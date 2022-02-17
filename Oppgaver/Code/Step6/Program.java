package Step6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    public void step4() throws FileNotFoundException {

        File file = new File("Oppgaver/Code/Step6/opg4.txt");
        Scanner input = new Scanner(file);
        while (input.hasNextLine()) {
            System.out.println(input.nextLine());
        }
    }

    public void step5() throws IOException {

        File file = new File("Oppgaver/Code/Step6/opg6.txt");

        Scanner input = new Scanner(System.in);
        FileWriter writer = new FileWriter(file);

        for (int i = 0; i < 5; i++) {
            String a = input.nextLine();
            writer.write(a+"\n");
        }
        writer.close();
        input.close();
    }

    public void step7() throws FileNotFoundException{
        ArrayList<Artist> artists = new ArrayList<>();
        File file = new File("Oppgaver/Code/Step6/opg7.txt");
        readArtists(artists, file);
        for (Artist a:
                artists){
            a.printState();
        }
    }
    public void readArtists(ArrayList<Artist> artists, File file) throws FileNotFoundException {
        Scanner input = new Scanner(file);
        while (input.hasNextLine()){
            String artistName = input.nextLine();
            String dateString = input.nextLine();
            LocalDate bDate = LocalDate.parse(dateString);
            String city = input.nextLine();
            String country = input.nextLine();

            Artist a = new Artist(artistName, bDate, city, country);
            artists.add(a);

            input.nextLine();
        }
        input.close();
    }

    public void step8() throws FileNotFoundException {
    ArrayList<Artist> artists = new ArrayList<>();
    ArrayList<String> newArtistNames = new ArrayList<>();
    for (int i = 0; i < 7; i++) {
        newArtistNames.add("Classified");
    }
    File file = new File("Oppgaver/Code/Step6/opg7.txt");
    readArtists(artists, file);
    for(int i = 0; i < artists.size(); i++){
        artists.get(i).setArtistName(newArtistNames.get(i));
    }


    writeArtistsToFile(artists, "Oppgaver/Code/Step6/opg8.txt" );
    }
    public void writeArtistsToFile (ArrayList<Artist> artists, String filename) {
    try {
        FileWriter writer = new FileWriter(filename);
        for(Artist a: artists){
            writer.write(a.getArtistName() + "\n");
            writer.write(a.getDateOfBirth() + "\n");
            writer.write(a.getCity() + "\n");
            writer.write(a.getCountry() + "\n");
            writer.write("---\n");

        }
        writer.close();
    }catch (Exception e){
        System.out.println("Fant ikke filen, eller noe annet som jeg ikke forstår");
        e.printStackTrace();
    }
    }
}
