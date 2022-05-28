package RepetisionStep17;

public class Main {

    public static void main(String[] args)  {

        Author author1 = new Author("Julian", "Norge");
        Author author2 = new Author("Vegard", "Botswana");

        Book book1 = new Book("Book1", author1, 100, Genre.CRIME);
        Book book2 = new Book("Book2", author2, 300, Genre.CLASSIC);
        Book book3 = new Book("Book3", author2, 500, Genre.CLASSIC);

        JDBCOps jdbcOps = new JDBCOps();
        BookRegister bookRegister = new BookRegister(jdbcOps);
        System.out.println("add book1");
        bookRegister.addBook(book1);
        System.out.println("add book2");
        bookRegister.addBook(book2);
        System.out.println("add book3");
        bookRegister.addBook(book3);

        System.out.println("Get Registered Books for author1");
        bookRegister.getRegisteredBooksByAuthor(author1.getName());
        System.out.println("Get Registered Books for author2");
        bookRegister.getRegisteredBooksByAuthor2(author2.getName());

        System.out.println("delete book1");
        bookRegister.deleteBook(book1);

        System.out.println("Get Registered Books for author1");
        bookRegister.getRegisteredBooksByAuthor(author1.getName());
        System.out.println("Get Registered Books for author2");
        bookRegister.getRegisteredBooksByAuthor2(author2.getName());

    }
}
