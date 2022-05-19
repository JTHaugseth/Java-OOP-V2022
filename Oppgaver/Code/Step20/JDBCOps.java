package Step20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class JDBCOps {

    public void registerBook(Book book) {
        try (Connection con = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/bookDb?allowPublicKeyRetrieval" +
                        "=true&useSSL=false", "julian", "haugseth123")) {

            PreparedStatement stmt = con.prepareStatement("INSERT INTO books(title, pages, genre) VALUES(?, ?, ?)");
            stmt.setString(1,book.getTitle());
            stmt.setInt(2,book.getNumberOfPages());
            stmt.setString(3, book.getGenre().toString());

            stmt.executeUpdate();

    }   catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void registerAuthor(Author author){
        try (Connection con = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/bookDb?allowPublicKeyRetrieval" +
                        "=true&useSSL=false", "julian", "haugseth123")) {

            PreparedStatement stmt = con.prepareStatement("INSERT INTO authors(name, nationality) VALUES(?, ?)");
            stmt.setString(1, author.getName());
            stmt.setString(2, author.getNationality());

            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateBook(Book book, Integer authorId){
        try (Connection con = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/bookDb?allowPublicKeyRetrieval" +
                        "=true&useSSL=false", "julian", "haugseth123")) {

            PreparedStatement stmt = con.prepareStatement("UPDATE books SET authorId = ? WHERE title = ?");
            stmt.setInt(1, authorId);
            stmt.setString(2, book.getTitle());

            stmt.executeUpdate();

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public ArrayList<Book>getBooks_ByJoin(){
        ArrayList<Book> getBooks_ByJoin = new ArrayList<>();
        try (Connection con = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/bookDb?allowPublicKeyRetrieval" +
                        "=true&useSSL=false", "julian", "haugseth123")) {
            PreparedStatement stmt = con.prepareStatement("")

        }catch (SQLException e){
            e.printStackTrace();
        }
        return getBooks_ByJoin;
   }

}
