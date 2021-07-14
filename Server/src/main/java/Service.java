import com.google.gson.Gson;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Service {

    static Logger logger = Logger.getLogger("myLogger");

    public static void main(String[] args) throws SQLException {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            Socket accept = serverSocket.accept();
            while (true) {
                InputStream inputStream = accept.getInputStream();
                DataInputStream dataInputStream = new DataInputStream(inputStream);
                String json = dataInputStream.readUTF();
                Gson gson = new Gson();
                PersonRequest personRequest = gson.fromJson(json, PersonRequest.class);
                Person person = parseRequestToPerson(personRequest);
                Action action = personRequest.getAction();
                if (action.equals(Action.EXIT)) {
                    break;
                }
                if (action.equals(Action.CREATE)) {
                    create(person);
                    String s = gson.toJson(person);
                    response(accept, s);

                }
                if (action.equals(Action.UPDATE)) {
                    update(person);
                    String s = gson.toJson(person);
                    response(accept, s);
                }
                if (action.equals(Action.DELETE)) {
                    delete(person);
                    String s = gson.toJson(person);
                    response(accept, s);
                }
                if (action.equals(Action.READ)) {
                    Person read = read(person);
                    String s = gson.toJson(read);
                    response(accept, s);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void response(Socket accept, String json1) throws IOException {
        OutputStream outputStream = accept.getOutputStream();
        DataOutputStream objectOutputStream = new DataOutputStream(outputStream);
        objectOutputStream.writeUTF(json1);
    }

    private static Person read(Person person) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Green@00me");
        PreparedStatement st = connection.prepareStatement("select * from persons where id=?");
        st.setInt(1, person.getId());
        ResultSet resultSet = st.executeQuery();
        while (resultSet.next()) {
            return new Person(resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getString("surname"),
                    Gender.getGender(resultSet.getString("gender")),
                    resultSet.getBoolean("isadult"));
        }
        return new Person();
    }

    private static void delete(Person person) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Green@00me");
        PreparedStatement st = connection.prepareStatement("delete from persons where id=?");
        st.setInt(1, person.getId());
        st.executeUpdate();
        st.close();
    }

    private static void update(Person person) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Green@00me");
        PreparedStatement st = connection.prepareStatement("update persons set name=?,surname=?,gender=?,isAdult=?" +
                "where id=?");
        st.setString(1, person.getName());
        st.setString(2, person.getSurname());
        st.setString(3, String.valueOf(person.getGender()));
        st.setBoolean(4, person.isAdult());
        st.setInt(5, person.getId());
        st.executeUpdate();
        st.close();
    }

    private static void create(Person person) throws SQLException {
        logger.log(Level.INFO, "Creating a person");
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "user", "password");
        PreparedStatement st = connection.prepareStatement("insert into persons(name,surname,gender,isadult) values(?,?,?,?)");
        st.setString(1, person.getName());
        st.setString(2, person.getSurname());
        st.setString(3, String.valueOf(person.getGender()));
        st.setBoolean(4, person.isAdult());
        st.executeUpdate();
        st.close();
        logger.log(Level.WARNING, "Successfully created a person with id - " + person.getId());
    }

    private static Person parseRequestToPerson(PersonRequest request) {
        boolean isAdult = false;
        if (request.getAge() >= 18) {
            isAdult = true;
        }
        return new Person(
                request.getId(),
                request.getName(),
                request.getSurname(),
                request.getGender(),
                isAdult);
    }
}
