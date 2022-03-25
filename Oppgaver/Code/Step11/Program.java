package Step11;

import java.util.HashSet;
import java.util.Optional;

public class Program {

    private HashSet<Person> people = new HashSet<>();

    void runProgram() {
        HashSet();
        getSamplePerson("Vegard");
    }

    private void HashSet(){
        people.add(new Person(23, "Vegard"));
        people.add(new Person(24, "Julian"));
        System.out.println(people);
    }
    public HashSet<Person> getSamplePerson(String name) {
        for (Person i : people) {
            if (people.contains(name)) {
                System.out.println("Navnet eksisterer");
            }

        }

        return null;
    }

}
