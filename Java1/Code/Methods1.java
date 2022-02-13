public class Methods1 {

    public static void main(String[] args) {

        // Method = a block of code that is executed whenever it is called upon.

        String name = "Bro";

        hello(name); // Du kan også kalle på denne methoden med kun: hello();
    }

    static void hello(String name) { // Må ikke ha name som parameter. Alt funker så lenge vi pusher name fra MAIN over. Tenk Javascript :)
        System.out.println("Hello "+name); // name her må ha samme som over.
    }
}
