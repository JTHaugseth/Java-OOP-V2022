package Step7;

import java.util.Scanner;

public class light_bulb_program {

    light_bulb bulb = new light_bulb();

    Scanner input = new Scanner(System.in);

    void runStateCheck() {
        System.out.println("Sjekker om lyspæren er av eller på: ");

        if (bulb.stateCheck()) {
            System.out.println("Lyspæren er på!");
        } else {
            System.out.println("Lyspæren er av!");
        }
    }
    void activateControlPanel() {
        System.out.println("\nHva ønsker du å gjøre?");
        System.out.println("1 - Skru på lyspæren");
        System.out.println("2 - Skru av lyspæren");
        System.out.println("3 - Sjekk status på pæren");
        System.out.println("4 - Avslutt");

        boolean repeater = true;

        while (repeater) {

            int inputValue = input.nextInt();

            switch (inputValue) {
                case 1:
                    bulb.turnOn();
                    System.out.println("Du trykker på lysbryteren");
                    break;
                case 2:
                    bulb.turnOff();
                    System.out.println("Du trykker på lysbryteren");
                    break;
                case 3:
                    runStateCheck();
                    break;
                case 4:
                    repeater = false;
                    System.out.println("Avslutter kontrollpanel");
            }
        }


    }
}
