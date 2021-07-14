import com.google.gson.Gson;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Controller {

    public static void main(String[] args) throws Exception {

        try (Socket socket = new Socket("localhost", 8080)) {
            while (true) {
                System.out.println("""
                        Enter 1:FOR CREATE
                        Enter 2:FOR READ
                        Enter 3:FOR UPDATE
                        Enter 4:FOR DELETE
                        Enter any other number :FOR EXIT
                        """);
                Scanner scanner = new Scanner(System.in);
                Action action = getAction(scanner);
                String json = getJson(scanner, action);
                OutputStream outputStream = socket.getOutputStream();
                DataOutputStream objectOutputStream = new DataOutputStream(outputStream);
                objectOutputStream.writeUTF(json);
                if (action.equals(Action.EXIT)) {
                    break;
                }
                InputStream inputStream = socket.getInputStream();
                DataInputStream objectInputStream = new DataInputStream(inputStream);
                String response = objectInputStream.readUTF();
                System.out.println(response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String getJson(Scanner scanner, Action action) {
        Gson gson = new Gson();
        String json = null;
        if (action.equals(Action.CREATE)) {
            PersonRequest personRequest = GeneratePerson.generate();
            personRequest.setAction(Action.CREATE);
            json = gson.toJson(personRequest, PersonRequest.class);
        } else if (action.equals(Action.UPDATE)) {
            System.out.println("Please enter id");
            int id = scanner.nextInt();
            PersonRequest personRequest = GeneratePerson.generate();
            personRequest.setAction(Action.UPDATE);
            personRequest.setId(id);

            System.out.println("Please enter name");
            personRequest.setName(scanner.next());

            System.out.println("Please enter surname");
            personRequest.setSurname(scanner.next());

            System.out.println("Please enter 1:for Male\n" +
                    "enter 2:for Female");
            int gender = scanner.nextInt();
            if (gender == 1) {
                personRequest.setGender(Gender.MALE);
            } else if (gender == 2) {
                personRequest.setGender(Gender.FEMALE);
            }

            System.out.println("Please enter age");
            personRequest.setAge(scanner.nextInt());

            json = gson.toJson(personRequest, PersonRequest.class);
        } else if (action.equals(Action.READ)) {
            System.out.println("Please enter id");
            int id = scanner.nextInt();
            PersonRequest personRequest = new PersonRequest(Action.READ, id);
            json = gson.toJson(personRequest, PersonRequest.class);
        } else if (action.equals(Action.DELETE)) {
            System.out.println("Please enter id");
            int id = scanner.nextInt();
            PersonRequest personRequest = new PersonRequest(Action.DELETE, id);
            json = gson.toJson(personRequest, PersonRequest.class);
        } else if (action.equals(Action.EXIT)) {
            PersonRequest personRequest = new PersonRequest(Action.EXIT);
            json = gson.toJson(personRequest, PersonRequest.class);
        }
        return json;
    }

    private static Action getAction(Scanner scanner) throws Exception {
        int choice = scanner.nextInt();
        Action action = parseAction(choice);
        return action;
    }

    private static Action parseAction(int choice) throws Exception {
        if (choice == 1) {
            return Action.CREATE;
        }
        if (choice == 2) {
            return Action.READ;
        } else if (choice == 3) {
            return Action.UPDATE;
        } else if (choice == 4) {
            return Action.DELETE;
        }
        return Action.EXIT;
    }
}
