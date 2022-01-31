import java.util.Scanner;

public class PracticeWhile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = "";

        // Normal while loop
        /*while(name.isBlank()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }*/

        // do-while-loop. Do vil alltid kjøre koden EN gang FØR while tar den tilbake.
        do{
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        } while (name.isBlank());


        System.out.println("Hello "+name);
    }
}
