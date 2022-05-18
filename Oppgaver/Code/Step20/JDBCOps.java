package Step20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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

}
