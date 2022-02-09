public class Book {

    private String title;
    private String author;
    private int numberOfPages;
    //private Genre genre;

    public Book(String title, String author, int numberOfPages){
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        //this.genre = genre;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public int getNumberOfPages(){
        return numberOfPages;
    }
    public void setNumberOfPages(int numberOfPages){
        this.numberOfPages = numberOfPages;
    }
}

