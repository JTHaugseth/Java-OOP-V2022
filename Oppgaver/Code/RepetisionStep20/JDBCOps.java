package RepetisionStep20;

import java.sql.*;
import java.util.ArrayList;

public class JDBCOps {
    public JDBCOps() {
        /**
         * register driver
         */
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException exception) {
            exception.printStackTrace();
        }
        try {
            createTable();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private void createTable() throws SQLException {
        try (Connection con = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/booksDb?allowPublicKeyRetrieval" +
                        "=true&useSSL=false", "user1", "pass")) {
            Statement stmt = con.createStatement();
            String createTable = "CREATE TABLE IF NOT EXISTS books( "
                    + "id INT NOT NULL AUTO_INCREMENT, "
                    + "title VARCHAR(45), "
                    + "authorId INT, "
                    + "pages  INT(11), "
                    + "genre  VARCHAR(45), "
                    + "primary key (id), "
                    + "foreign key (authorId) references authors(id)) ";
            boolean result = stmt.execute(createTable);
            createTable = "CREATE TABLE IF NOT EXISTS authors( "
                    + "id INT NOT NULL AUTO_INCREMENT, "
                    + "name VARCHAR(45), "
                    + "nationality VARCHAR(45), "
                    + "primary key (id)) ";
            result = stmt.execute(createTable);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

    }

    public void registerBook(Book book) {
        try (Connection con = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/booksDb?allowPublicKeyRetrieval" +
                        "=true&useSSL=false", "user1", "pass")) {

            PreparedStatement stmt = con.prepareStatement("INSERT INTO books(title, pages, genre) VALUES(?, ?, ?)");

            stmt.setString(1, book.getTitle());
            stmt.setInt(2, book.getNumberOfPages());
            stmt.setString(3, book.getGenre().toString());

            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void registerAuthor(Author author) {
        try (Connection con = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/booksDb?allowPublicKeyRetrieval" +
                        "=true&useSSL=false", "user1", "pass")) {

            PreparedStatement stmt = con.prepareStatement("INSERT INTO authors(name, nationality) VALUES(?, ?)");

            stmt.setString(1, author.getName());
            stmt.setString(1, author.getNationality());

            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateBook(Book book, Integer authorId){
        try (Connection con = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/booksDb?allowPublicKeyRetrieval" +
                        "=true&useSSL=false", "user1", "pass")) {

            PreparedStatement stmt = con.prepareStatement("UPDATE books SET authorId = ? WHERE title = ?");

            stmt.setInt(1, authorId);
            stmt.setString(2, book.getTitle());

            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Book> getBooks_byJoin(){

        ArrayList<Book> books = new ArrayList<>();

        try (Connection con = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/booksDb?allowPublicKeyRetrieval" +
                        "=true&useSSL=false", "user1", "pass")) {

            CallableStatement stmt = con.prepareCall("{CALL getBooks_byJoin()}");
            ResultSet rs = stmt.executeQuery();

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

    public Integer getIdByAuthor(String authorName) {
        try (Connection con = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/booksDb?allowPublicKeyRetrieval" +
                        "=true&useSSL=false", "user1", "pass")) {

            PreparedStatement stmt = con.prepareStatement("SELECT * FROM authors WHERE name = ?");
            stmt.setString(1, authorName);
            ResultSet rs = stmt.executeQuery();

            while(rs.next()) {
                return rs.getInt("id");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
        return 0;
    }

    public void addBook(Book book){
        Integer authorId = getIdByAuthor(book.getAuthor().getName());

        try (Connection con = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/booksDb?allowPublicKeyRetrieval" +
                        "=true&useSSL=false", "user1", "pass")) {

            con.setAutoCommit(false);
            PreparedStatement stmt = con.prepareStatement("INSERT INTO books(title, authorId, pages, genre) VALUES(?, ?, ?, ?)");
            stmt.setString(1, book.getTitle());
            stmt.setInt(2, authorId);
            stmt.setInt(3, book.getNumberOfPages());
            stmt.setString(4, book.getGenre().toString());
            ResultSet rs = stmt.executeQuery();

            if (authorId <= 0){
                System.out.println("the author does not exist!");
                con.rollback();
            } else {
                con.commit();
            }


        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    public void addBookAndAuthor(Book book) {
        Integer authorId = getIdByAuthor(book.getAuthor().getName());

        try (Connection con = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/booksDb?allowPublicKeyRetrieval" +
                        "=true&useSSL=false", "user1", "pass")) {


            PreparedStatement stmt = con.prepareStatement("INSERT INTO books(title, authorId, pages, genre) VALUES(?, ?, ?, ?)");
            stmt.setString(1, book.getTitle());
            stmt.setInt(2, authorId);
            stmt.setInt(3, book.getNumberOfPages());
            stmt.setString(4, book.getGenre().toString());
            stmt.executeQuery();

            if (authorId <= 0){
                System.out.println("the author does not exist!");
                registerAuthor(book.getAuthor());
                authorId = getIdByAuthor(book.getAuthor().getName());
                updateBook(book, authorId);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}