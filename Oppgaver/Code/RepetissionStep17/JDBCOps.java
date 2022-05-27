package RepetissionStep17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

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
            sqlException.printStackTrace();}
    }
}
