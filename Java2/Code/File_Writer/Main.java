package File_Writer;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("Java2/Code/File_Writer/poem");
            writer.write("Roses are red \nViolets are blue");
            writer.append("\nA poem by Julian"); // Legger til slutt-tekst.
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
