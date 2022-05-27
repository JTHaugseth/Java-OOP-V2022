package RepetissionStep17;

import java.sql.*;
import java.util.ArrayList;
import java.util.Optional;

public class JDBCOps {

    public JDBCOps() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("The driver registered");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Could not register driver");
        }
        try {
            createTable();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("CreateTable failed within jdbcOps");
        }
    }

    public void createTable() throws SQLException {
        try (Connection con = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/booksDb?allowPublicKeyRetrieval" +
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
            sqlException.printStackTrace();
        }
    }

    public ArrayList<Book> getBooks() {

        ArrayList<Book> books = new ArrayList<>();

        try (Connection con = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/booksDb?allowPublicKeyRetrieval" +
                        "=true&useSSL=false", "julian", "haugseth123")) {

            Statement stmt = con.createStatement();

            String query = "SELECT book.title as title, book.pages as pages, book.genre as genre, author.name as name, author.nationality as nationality" +
                    "FROM books book" +
                    "INNER JOIN authors author" +
                    "ON book.authorId = author.id";

            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                Book book = new Book();
                book.setTitle(rs.getString("title"));
                book.setNumberOfPages(rs.getInt("pages"));
                book.setGenre(Genre.valueOf(rs.getString("genre")));
                Author author = new Author();
                author.setName(rs.getString("name"));
                author.setNationality(rs.getString("nationality"));
                book.setAuthor(author);
                books.add(book);
            }
            return books;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public ArrayList<Book> getBooksByAuthor(String authorNameLol) {

        ArrayList<Book> books = new ArrayList<>();

        try (Connection con = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/booksDb?allowPublicKeyRetrieval" +
                        "=true&useSSL=false", "julian", "haugseth123")) {

            Statement stmt = con.createStatement();

            String query = "SELECT book.title as title, book.pages as pages, book.genre as genre, author.name as name, author.nationality as nationality" +
                    "FROM books book" +
                    "INNER JOIN authors author" +
                    "ON book.authorId = author.id" +
                    "HAVING author.name = '" +
                    authorNameLol + "'";

            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                Book book = new Book();
                book.setTitle(rs.getString("title"));
                book.setNumberOfPages(rs.getInt("pages"));
                book.setGenre(Genre.valueOf(rs.getString("genre")));
                Author author = new Author();
                author.setName(rs.getString("name"));
                author.setNationality(rs.getString("nationality"));
                book.setAuthor(author);
                books.add(book);
            }
            return books;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public ArrayList<AuthorRecord> getAuthors() {

        ArrayList<AuthorRecord> authors = new ArrayList<>();

        try (Connection con = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/booksDb?allowPublicKeyRetrieval" +
                        "=true&useSSL=false", "julian", "haugseth123")) {

            Statement stmt = con.createStatement();

            String getTheAuthors = "SELECT * FROM authors";

            ResultSet rs = stmt.executeQuery(getTheAuthors);

            while (rs.next()) {
                Author author = new Author();
                author.setName(rs.getString("name"));
                author.setNationality(rs.getString("nationality"));
                AuthorRecord authorRecord = new AuthorRecord(rs.getInt("id"), author);
                authors.add(authorRecord);
            }

            return authors;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void addBook(Book book) throws SQLException {

        /**
         * when you add a book, check if the author exists in author table.if not, register author in author table
         */
        int authorId;
        boolean isAuthorPresent = false;
        ArrayList<AuthorRecord> authorRecords = getAuthors();

        Optional<AuthorRecord> result = (authorRecords!=null && !authorRecords.isEmpty())?
                authorRecords.stream()
                        .filter(authorRecord -> authorRecord.getAuthor().equals(book.getAuthor())).findFirst()
                : Optional.empty();
        if(result.isPresent()) {
            authorId = result.get().getTableId();
            isAuthorPresent = true;
        } else {
            authorId = authorRecords.size() + 1;
        }
        try (Connection con = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/booksDb?allowPublicKeyRetrieval" +
                        "=true&useSSL=false", "user1", "pass")) {
            Statement stmt = con.createStatement();
            String addBook = "INSERT INTO books(title, authorId, pages, genre)"
                    + " VALUES('"
                    + book.getTitle() + "', '"
                    + authorId + "', '"
                    + book.getNumberOfPages() + "', '"
                    + book.getGenre() + "')";
            stmt.execute(addBook);

            if(!isAuthorPresent ) {
                String addAuthor = "INSERT INTO authors(name, nationality)"
                        + " VALUES('"
                        + book.getAuthor().getName() + "', '"
                        + book.getAuthor().getNationality()
                        + "')";
                stmt.execute(addAuthor);
            }

        }catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    public void deleteBook(Book book) throws SQLException {
        try (Connection con = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/booksDb?allowPublicKeyRetrieval" +
                        "=true&useSSL=false", "user1", "pass")) {

                Statement stmt = con.createStatement();
                String delete = "DELETE FROM books" +
                        "WHERE title = '" +
                        book.getTitle() + "'";

                stmt.executeQuery(delete);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
