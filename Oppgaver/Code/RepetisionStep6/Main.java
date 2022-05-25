package RepetisionStep6;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        Program program = new Program();
        try {
            program.oppgave8();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
