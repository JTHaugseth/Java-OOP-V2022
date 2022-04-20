package Step17;

import java.sql.*;
import java.util.ArrayList;

public class JDBCOps {

    public JDBCOps() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("The driver registered");
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Could not register driver");
        }
        try {
            createTable();
        }
        catch (SQLException e) {
            e.printStackTrace();
            System.out.println("CreateTable failed within jdbcOps");
        }
    }

    public void createTable() throws SQLException {
        try (Connection con = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/bookDb?allowPublicKeyRetrieval" +
                        "=true&useSSL=false", "julian", "haugseth123")) {

            Statement stmt = con.createStatement();

            String createTable = "CREATE TABLE IF NOT EXISTS authors( "
                    + "id INT NOT NULL AUTO_INCREMENT, "
                    + "name VARCHAR(45), "
                    + "nationality VARCHAR(45), "
                    + "primary key (id)) ";

            boolean result = stmt.execute(createTable);

            createTable = "CREATE TABLE IF NOT EXISTS books( "
                    + "id INT NOT NULL AUTO_INCREMENT, "
                    + "title VARCHAR(45), "
                    + "authorId INT, "
                    + "pages  INT(11), "
                    + "genre  VARCHAR(45), "
                    + "primary key (id), "
                    + "foreign key (authorId) references authors(id)) ";

             result = stmt.execute(createTable);

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();}
    }

    public ArrayList<Book> getBooks() {
        ArrayList<Book> books = new ArrayList<>();

        try (Connection con = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/bookDb?allowPublicKeyRetrieval" +
                        "=true&useSSL=false", "julian", "haugseth123")) {

            Statement stmt = con.createStatement();

            String joinSql = "SELECT book.title as title, book.pages as pages, book.genre as genre, author.name as authorName, author.nationality as authorNationality " +
                    "FROM books book " +
                    "INNER JOIN authors author " +
                    "ON book.authorId = author.id";

            ResultSet rs = stmt.executeQuery(joinSql);

            while (rs.next()) {
                Book book = new Book();
                book.setTitle(rs.getString("title"));
                book.setNumberOfPages(rs.getInt("pages"));
                book.setGenre(Genre.valueOf(rs.getString("genre")));
                Author author = new Author();
                author.setName(rs.getString("authorName"));
                author.setNationality(rs.getString("authorNationality"));
                book.setAuthor(author);
                books.add(book);
            }
            return books;

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return null;
    }
}
