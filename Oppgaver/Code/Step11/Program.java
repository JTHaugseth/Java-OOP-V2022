package Step11;

import javax.swing.text.html.Option;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Program {

    private HashSet<Person> people = new HashSet<>();

    void runProgram() {
        HashSet();
    }

    private void HashSet(){
        people.add(new Person(23, "Vegard"));
        people.add(new Person(24, "Julian"));
        System.out.println(people);
    }
    public Optional<Person> getSamplePerson(String name) {
        for (Person i : people) {
            if (i.getName().equalsIgnoreCase(name)) {
                return Optional.of(i);
            }
        }
        return Optional.empty();
    }

    public void addPerson (Person p){
        validate(p);
        people.add(p);
    }
    public void validate(Person p) {
        if (p.getName() == null) {
            throw new IllegalArgumentException("Name must be valid");
        }
        if (p.getAge() < 0) {
            throw new IllegalArgumentException("Age must be over 0");
        }
        if (p == null) {
            throw new IllegalArgumentException("Null input when Person excepted");
        }
    }
    public Set<Person> getPersonByAge(int age) {
        Set<Person> personToReturn = new HashSet<>();
        for (Person p : people){
            if (p.getAge() > age) {
                personToReturn.add(p);
            }
        }
        return personToReturn;
    }

}
