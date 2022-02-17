package Step6;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        Program program = new Program();

        /*try {
            program.step4();
        } catch (FileNotFoundException e) {
            System.out.println("Finner ikke filen!");
            e.printStackTrace();
        }

        try {
            program.step5();
        } catch (IOException e) {
            System.out.println("Du skrev noe ugyldig!");
            e.printStackTrace();
        }

        try {
            program.step7();
        } catch (FileNotFoundException e) {
            System.out.println("Finner ikke filen!");
            e.printStackTrace();
        }*/

        try {
            program.step8();
        } catch (FileNotFoundException e) {
            System.out.println("Finner ikke filen!");
            e.printStackTrace();
        }
    }
}
