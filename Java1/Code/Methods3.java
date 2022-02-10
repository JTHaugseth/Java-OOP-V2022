public class Methods3 {

    public static void main(String[] args) {
        // Method = a block of code that is executed whenever it is called upon.

        int x = 3;
        int y = 4;

        int z = add(x, y);

        System.out.println(z);
    }

    static int add(int x, int y) {  // static *int*. (List datatypen du vil returne. I dette tilfelle vil vi returne int :)

        int z = x + y;
        return z; // Du kan også skrive return x + y, og legge add-formelen rett inn i sout i main.
    }
}
