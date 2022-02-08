import java.util.ArrayList;

public class For_Each_Loop {

    public static void main (String[] args) {

        // for-each = traversing technique to iterate through the elements in an array/collection
        //            less steps, more readable
        //            less flexible

        // String[] animals = {"Cat", "Dog", "Rat", "Bird"};

        ArrayList<String> animals = new ArrayList<String>();

        animals.add("Cat");
        animals.add("Dog");
        animals.add("Rat");
        animals.add("Bird");

        for (String i : animals) {
            System.out.println(i);
        }
    }
}
