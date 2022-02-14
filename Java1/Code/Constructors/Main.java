package Constructors;

public class Main {

    public static void main(String[] args) {

        Human human1 = new Human("Rick", 45, 70);
        Human human2 = new Human("Morty", 15, 60);

        human2.eat();
        human1.drink();
    }
}
