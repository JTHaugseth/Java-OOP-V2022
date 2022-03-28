package Step11;

import java.util.Optional;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Program program = new Program();

        program.addPerson(new Person(23 , "Ole"));
        program.addPerson(new Person(23 , "Kristoffer"));
        program.addPerson(new Person(27 , "Simon"));
        program.addPerson(new Person(13 , "Simen"));
        program.addPerson(new Person(23 , "Bob"));
        program.addPerson(new Person(53 , "Geir Ove"));
        program.addPerson(new Person(24 , "Terje"));
        program.addPerson(new Person(20 , "William"));
        program.addPerson(new Person(33 , "Fredrik"));
        program.addPerson(new Person(25 , "Petter"));

        program.runProgram();

        /*Optional<Person> people = program.getSamplePerson("Julian");
        if (people.isPresent()) {
            System.out.println("Person exists");
        }else
            System.out.println("person does not exist!");*/

        Set<Person> people = program.getPersonByAge(30);
        System.out.println(people);
        /*for (Person p : people) {
            System.out.println(p);
        }*/
    }
}
