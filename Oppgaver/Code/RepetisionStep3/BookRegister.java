package RepetisionStep3;

public class BookRegister {

    public int numberOfBooks;
    public Book[] books;

    public BookRegister(int maxNumberOfBooks) {
        books = new Book[maxNumberOfBooks];
        numberOfBooks = 0;
    }

    public void registerBook(Book book) {
        books[numberOfBooks] = book;
        numberOfBooks++;
    }

    public void printAllBooks() {
        for (int i = 0; i < numberOfBooks; i++) {
            books[i].printInfo();
        }
    }

    public void PrintByGenre(Genre genre){
        for (int i = 0; i < numberOfBooks; i++) {
            Book book = books[i];

            if(book.getGenre() == genre) {
                books[i].printInfo();
            }
        }
    }
    public void PrintByAuthor(String author){
        for (int i = 0; i < numberOfBooks; i++) {
            Book book = books[i];

            if(book.getAuthor().equalsIgnoreCase(author)) {
                books[i].printInfo();
            }
        }
    }
}
