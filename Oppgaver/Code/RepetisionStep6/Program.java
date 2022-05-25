package RepetisionStep6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    public void oppgave4() throws FileNotFoundException {
        File file = new File("Oppgaver/Code/RepetisionStep6/opg4.txt");
        Scanner input = new Scanner(file);
        System.out.println("Scanning file");
        while (input.hasNextLine()) {
            System.out.println(input.nextLine());
        }
        input.close();
    }

    public void oppgave5() throws IOException {
        File file = new File("Oppgaver/Code/RepetisionStep6/opg6.txt");
        file.createNewFile();
        Scanner input = new Scanner(System.in);
        FileWriter filewriter = new FileWriter(file);
        System.out.println("write 5 strings!");

        for (int i = 0; i < 5; i++) {
            String a = input.next();
            filewriter.write(a + "\n");
        }
        filewriter.close();
        input.close();
    }
    public void oppgave7() throws FileNotFoundException{

        ArrayList<Artist> artists = new ArrayList<>();
        File file = new File("Oppgaver/Code/RepetisionStep6/opg7.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()){

            String artistName = scanner.nextLine();
            String date = scanner.nextLine();
            LocalDate bDate = LocalDate.parse(date);
            String city = scanner.nextLine();
            String country = scanner.nextLine();

            Artist artist = new Artist(artistName, bDate, city, country);
            artists.add(artist);

            scanner.nextLine();
        }

        for (Artist a: artists) {
            System.out.println(a.toString());
        }

        scanner.close();
    }
    public void oppgave8() throws FileNotFoundException {
        ArrayList<Artist> artists = new ArrayList<>();
        File file = new File("Oppgaver/Code/RepetisionStep6/opg7.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {

            String artistName = scanner.nextLine();
            String date = scanner.nextLine();
            LocalDate bDate = LocalDate.parse(date);
            String city = scanner.nextLine();
            String country = scanner.nextLine();

            Artist artist = new Artist(artistName, bDate, city, country);
            artists.add(artist);

            scanner.nextLine();
        }

        artists.get(0).setArtistName("Julian");
        artists.get(2).setCity("London");
        artists.get(3).setCountry("Denmark");

        try {
            writeArtistsToNewFile(artists, "Oppgaver/Code/RepetisionStep6/opg9.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }


        scanner.close();
    }

    public void writeArtistsToNewFile(ArrayList<Artist> artists, String newFile) throws IOException {
        File file = new File(newFile);
        file.createNewFile();
        FileWriter fileWriter = new FileWriter(newFile);

        for (int i = 0; i < artists.size(); i++) {
            fileWriter.write(artists.get(i).getArtistName() + "\n");
            fileWriter.write(artists.get(i).getDateOfBirth() + "\n");
            fileWriter.write(artists.get(i).getCity() + "\n");
            fileWriter.write(artists.get(i).getCountry() + "\n");
            fileWriter.write("---" + "\n");
        }
        fileWriter.close();
    }
}
