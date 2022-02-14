package Step3;

public class Main {

    public static void main(String[] args) {
        System.out.println("Printer ny bok");
        Book hei = new Book("Hei", "Julian", 200, Genre.ACTION);

        System.out.println("printer enda en bok");
        Book yo = new Book("Yo", "Vegard", 420, Genre.CRIME);

        System.out.println(hei.getGenre());
        hei.getAuthor();
        hei.printState();

        hei.setNumberOfPages(720);
    }

}
