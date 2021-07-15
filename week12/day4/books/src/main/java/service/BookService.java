package service;

import entity.Book;
import util.DataBaseCredential;
import util.Genre;

import java.sql.*;
import java.util.ArrayList;

public class BookService {

    public static void writeBook(Book book) throws SQLException {
        Connection connection = DriverManager.getConnection(DataBaseCredential.getUrl(),
                DataBaseCredential.getUsername(),
                DataBaseCredential.getPassword());
        PreparedStatement st = connection.prepareStatement("insert into books(title,genre)" +
                "values(?,?)");
        st.setString(1, book.getTitle());
        st.setString(2, String.valueOf(book.getGenre()));
        st.executeUpdate();
        st.close();
        PreparedStatement st1 = connection.prepareStatement("select id from books where title=? ");
        st1.setString(1, book.getTitle());
        ResultSet resultSet = st1.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            book.setId(id);
        }
        st1.close();
    }

    public static void writeBookAuthor(Book book, ArrayList<Integer> ids) {
        ids.forEach(id -> {
            try (Connection connection = DriverManager.getConnection(DataBaseCredential.getUrl(),
                    DataBaseCredential.getUsername(),
                    DataBaseCredential.getPassword())) {
                PreparedStatement st = connection.prepareStatement("insert into books_authors(book_id,Author_id) values(?,?)");
                st.setInt(1, book.getId());
                st.setInt(2, id);
                st.executeUpdate();
                st.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        });
    }

    public static void delete(String title) throws SQLException {
        Connection connection = DriverManager.getConnection(DataBaseCredential.getUrl(),
                DataBaseCredential.getUsername(),
                DataBaseCredential.getPassword());
        PreparedStatement st = connection.prepareStatement("delete from books where title=?");
        st.setString(1, title);
        st.executeUpdate();
        st.close();
    }

    public static void readAll() throws SQLException {
        Connection connection = DriverManager.getConnection(DataBaseCredential.getUrl(),
                DataBaseCredential.getUsername(),
                DataBaseCredential.getPassword());
        PreparedStatement st = connection.prepareStatement("select books.title, array_to_string(array_agg(authors.name), ',') from books " +
                "join books_authors on books_authors.book_id=books.id join authors on authors.id=books_authors.author_id group by books.title");
        ResultSet resultSet = st.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getString(1) + ":" + resultSet.getString(2));
        }
    }

    public static void searchByTitle(String title) throws SQLException {
        Connection connection = DriverManager.getConnection(DataBaseCredential.getUrl(),
                DataBaseCredential.getUsername(),
                DataBaseCredential.getPassword());
        PreparedStatement st = connection.prepareStatement("select title from books where title like ? ");
        st.setString(1, "%" + title + "%");
        ResultSet resultSet = st.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getString("title"));
        }
    }

    public static void printBooks() throws SQLException {
        try (Connection connection = DriverManager.getConnection(DataBaseCredential.getUrl(),
                DataBaseCredential.getUsername(),
                DataBaseCredential.getPassword())) {
            PreparedStatement st = connection.prepareStatement("select books.id,books.title,books.genre, array_to_string(array_agg(authors.name), ',') from books " +
                    "join books_authors on books_authors.book_id=books.id join authors on authors.id=books_authors.author_id group by books.id,books.title,books.genre");
            ResultSet resultSet = st.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + ":"
                        + resultSet.getString(2) + ":"
                        + resultSet.getString(3) + ":" +
                        resultSet.getString(4));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void changeName(int id, String title) throws SQLException {
        Connection connection = DriverManager.getConnection(DataBaseCredential.getUrl(),
                DataBaseCredential.getUsername(),
                DataBaseCredential.getPassword());
        PreparedStatement st = connection.prepareStatement("update books set title=? where id=?");
        st.setInt(2, id);
        st.setString(1, title);
        st.executeUpdate();
        st.close();
    }

    public static void changeGenre(int id, Genre genre) throws SQLException {
        Connection connection = DriverManager.getConnection(DataBaseCredential.getUrl(),
                DataBaseCredential.getUsername(),
                DataBaseCredential.getPassword());
        PreparedStatement st = connection.prepareStatement("update books set genre=? where id=?");
        st.setInt(2, id);
        st.setString(1, String.valueOf(genre));
        st.executeUpdate();
        st.close();

    }
}
