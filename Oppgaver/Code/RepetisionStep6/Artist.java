package RepetisionStep6;

import java.time.LocalDate;
import java.util.Date;

public class Artist {

    public String artistName;
    public LocalDate dateOfBirth;
    public String city;
    public String country;

    public Artist(String artistName, LocalDate dateOfBirth, String city, String country) {
        this.artistName = artistName;
        this.dateOfBirth = dateOfBirth;
        this.city = city;
        this.country = country;
    }

    public String getArtistName() {return artistName;}

    public void setArtistName(String artistName) {this.artistName = artistName;}

    public LocalDate getDateOfBirth() {return dateOfBirth;}

    public void setDateOfBirth(LocalDate dateOfBirth) {this.dateOfBirth = dateOfBirth;}

    public String getCity() {return city;}

    public void setCity(String city) {this.city = city;}

    public String getCountry() {return country;}

    public void setCountry(String country) {this.country = country;}

    @Override
    public String toString() {
        return "Artist{" +
                "artistName='" + artistName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
