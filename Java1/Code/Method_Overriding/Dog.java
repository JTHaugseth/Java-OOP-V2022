package Method_Overriding;

public class Dog extends Animal{


    // @Override gjør ingenting. Men det blir brukt for å vise til at metoden under skriver over metoden i Animal.
    @Override
    void speak() {
        System.out.println("The dog goes *bark*");
    }
}
