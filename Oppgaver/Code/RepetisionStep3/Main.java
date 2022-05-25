package RepetisionStep3;

public class Main {

    public static void main(String[] args) {

        Chapter[] chapter1 = new Chapter[2];
        chapter1[0] = new Chapter("lol", 20, 5);
        chapter1[1] = new Chapter("hey", 10, 10);

        Book book = new Book("Hei", "Julian", 100, Genre.CRIME, chapter1);
        Book book1 = new Book("Hei123", "Julian2135215", 1200, Genre.CRIME, chapter1);
        Book book2 = new Book("Hei153631", "Julian1252151", 1001, Genre.CRIME, chapter1);

        BookRegister bookRegister = new BookRegister(20);
        bookRegister.registerBook(book);
        bookRegister.registerBook(book1);
        bookRegister.registerBook(book2);
        bookRegister.PrintByAuthor("julian");

    }
}
