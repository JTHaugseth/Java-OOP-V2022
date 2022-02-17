public class PrintF {

    public static void main(String[] args) {
        // printf() = an optimal method to control, format and display text to the console window
        //            two arguments = format string + (object/variable/value)
        //            % [flags] [precision] [width] [conversion-character]

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 1000;

        /* [Conversion-character] --> Character behind %
        System.out.printf("%b", myBoolean);
        System.out.printf("%c", myChar);
        System.out.printf("%s", myString);
        System.out.printf("%d", myInt);
        System.out.printf("%f", myDouble);
        */

        // [width] --> Number 10 in the middle of % and s. Spacing between word and string.
        // minimum number of characters to bre written as output
        //System.out.printf("Hello %10s", myString);

        // [Precision] --> %.2f decides how many digits after comma a float-value shows. In this case 2 = 1000.00.
        // sets number of digits of precision when outputting floating-point values.
        //System.out.printf("You have this much money %.2f", myDouble);

        // [Flags] ---> Test sout under to see.
        // adds an effect to output based on the flag added to format specifier
        // - : left-justify
        // + : output a plus ( + ) or minus ( - ) sign for a numeric value
        // 0 : numeric values are zero - padded
        // , : comma grouping separator if numbers > 1000

        // System.out.printf("You have this much money %20f", myDouble);
        // System.out.printf("You have this much money %+f", myDouble);
        // System.out.printf("You have this much money %020f", myDouble);
        // System.out.printf("You have this much money %,2f", myDouble);
    }
}
