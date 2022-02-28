package Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // exception = an event that occurs during the execution of a program that,
        //             disrupts the normal flow of instructions.

        Scanner scanner = new Scanner(System.in);


        try {
            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();
            System.out.println("Enter a whole number to divide by: ");
            int y = scanner.nextInt();

            int z = x / y;

            System.out.println("Result: " + z);
        }
        catch (ArithmeticException e) {
            System.out.println("You can't divide by zero!");
        }
        catch (InputMismatchException e) {
            System.out.println("You can only enter numbers!");
        }

        // Ha som rutine å skrive ekstakt hva exception det er snakk om, som over.
        // Finner du ikke exceptionen eller glemmer den kan du skrive det som står under. Men det er sett på som latmannskap.
        catch (Exception e) {
            System.out.println("Something went wrong!");
        }

        // Det under vil alltid printe.
        finally {
            System.out.println("This will always print!");
            // Bra bruk av finally er å lukke f.eks scanneren.
            scanner.close();
        }
    }
}
