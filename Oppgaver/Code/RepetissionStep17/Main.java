package RepetissionStep17;

public class Main {

    public static void main(String[] args)  {

        Author author1 = new Author("Julian", "Norge");
        Author author2 = new Author("Vegard", "Botswana");

        Book book1 = new Book("Book1", author1, 100, Genre.CRIME);
        Book book2 = new Book("Book2", author2, 300, Genre.CLASSIC);
        Book book3 = new Book("Book3", author2, 500, Genre.CLASSIC);

        JDBCOps jdbcOps = new JDBCOps();

    }
}
