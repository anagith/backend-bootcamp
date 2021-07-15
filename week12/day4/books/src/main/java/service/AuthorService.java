package service;

import entity.Author;
import util.DataBaseCredential;

import java.sql.*;

public class AuthorService {
    public static void writeAuthor(Author author) throws SQLException {
        Connection connection = DriverManager.getConnection(DataBaseCredential.getUrl(),
                DataBaseCredential.getUsername(),
                DataBaseCredential.getPassword());
        PreparedStatement st = connection.prepareStatement("insert into authors(name)" +
                "values(?)");
        st.setString(1, author.getName());
        st.executeUpdate();
        st.close();
    }

    public static void printAuthors() {
        try (Connection connection = DriverManager.getConnection(DataBaseCredential.getUrl(),
                DataBaseCredential.getUsername(),
                DataBaseCredential.getPassword())) {
            PreparedStatement st = connection.prepareStatement("select * from authors");
            ResultSet resultSet = st.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + ":"
                        + resultSet.getString("name"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void delete(String name) throws SQLException {
        Connection connection = DriverManager.getConnection(DataBaseCredential.getUrl(),
                DataBaseCredential.getUsername(),
                DataBaseCredential.getPassword());
        PreparedStatement st = connection.prepareStatement("delete from authors where name=?");
        st.setString(1, name);
        st.executeUpdate();
        st.close();
    }
}
