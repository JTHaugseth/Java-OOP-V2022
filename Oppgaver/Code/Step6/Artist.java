package Step6;

import java.time.LocalDate;

public class Artist {

    String artistName;
    LocalDate dateOfBirth;
    String city;
    String country;

        Artist(String artistName, LocalDate dateOfBirth, String city, String country) {
            this.artistName = artistName;
            this.dateOfBirth = dateOfBirth;
            this.city = city;
            this.country = country;
        }

        public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void printState(){
        System.out.println("Artistname:"+artistName+"\n" + "date of birth:"
                + dateOfBirth+ "\n"+ "city:" + city +"\n"+ "country:" + country+"\n");
    }

}
