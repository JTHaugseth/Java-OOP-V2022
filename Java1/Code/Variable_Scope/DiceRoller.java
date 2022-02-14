package Variable_Scope;

import java.util.Random;

public class DiceRoller {

    // You can use parameters to let *roll* get variables from *DiceRoller*.
    /*
    DiceRoller() {
        Random random = new Random();
        int number = 0;
        roll(random, number);
    }
    void roll(Random random, int number) {
        number = random.nextInt(6)+1;
        System.out.println(number);

    }
    */
    // Or you can declare the variables outside the method, but inside the class.
    Random random;
    int number;

    DiceRoller() {
        random = new Random();
        roll();
    }
    void roll() {
        number = random.nextInt(6)+1;
        System.out.println(number);

    }
}
