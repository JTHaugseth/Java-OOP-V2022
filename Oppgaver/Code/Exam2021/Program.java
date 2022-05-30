package Exam2021;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.locks.Lock;

public class Program {

    HashMap<Integer, Equipment> map = new HashMap<>();

    public void fileReader() throws FileNotFoundException {
        File file = new File("Oppgaver/Code/Exam2021/equipment.txt");
        Scanner scanner = new Scanner(file);
        System.out.println("Reading from the equipment file...");

        Equipment equipment;
        int id;
        String locker;
        boolean replacement;
        String type;
        boolean airPressure;
        boolean newPad;

        while(scanner.hasNextLine()){
            String typeEquipment = scanner.nextLine();

            switch (typeEquipment) {
                case "Ball":
                    id = Integer.parseInt(scanner.nextLine());
                    locker = scanner.nextLine();
                    replacement = Boolean.parseBoolean(scanner.nextLine());
                    type = scanner.nextLine();
                    airPressure = Boolean.parseBoolean(scanner.nextLine());

                    equipment = createBall(id, locker, replacement, type, airPressure);
                    map.put(id, equipment);
                break;

                case "TableTennisRacket":
                    id = Integer.parseInt(scanner.nextLine());
                    locker = scanner.nextLine();
                    replacement = Boolean.parseBoolean(scanner.nextLine());
                    newPad = Boolean.parseBoolean(scanner.nextLine());

                    equipment = createRacket(id, locker, replacement, newPad);
                    map.put(id, equipment);
                break;

                default:
                    System.out.println("Something went wrong with switch TypeRacket in TableTennisRacket");

            }
        }
        System.out.println("All objects created");
    }

    public Equipment createBall(int id, String lockerName, boolean replacement, String typeOfBall, boolean airPressure) {

        Equipment equipment;
        Locker locker = new Locker(lockerName);

        switch (typeOfBall) {
            case "Football":
                equipment = new Football("Ball", id, locker, replacement, Type.Football, airPressure);
                return equipment;
            case "Handball":
                equipment = new Handball("Ball", id, locker, replacement, Type.Handball, airPressure);
                return equipment;
            case "Volleyball":
                equipment = new Volleyball("Ball", id, locker, replacement, Type.Volleyball, airPressure);
                return equipment;
            case "Basketball":
                equipment = new Basketball("Ball", id, locker, replacement, Type.Basketball, airPressure);
                return equipment;
            default:
                return null;
        }
    }

    public Equipment createRacket(int id, String lockerName, boolean replacement, boolean newPad) {

        Equipment equipment;
        Locker locker = new Locker(lockerName);

        equipment = new Racket("TableTennisRacket", id, locker, replacement, newPad);
        return equipment;
    }

    public void printBallsNeedingMoreAir() {
        for (Equipment e : map.values()) {
            if (e instanceof Handball) {
                if (((Handball) e).isAirPressure()) {
                    System.out.println(((Handball) e).getType() + " with id: " + ((Handball) e).getId() + " Needs more air");
                }
            }
            if (e instanceof Football) {
                if (((Football) e).isAirPressure()) {
                    System.out.println(((Football) e).getType() + " with id: " + ((Football) e).getId() + " Needs more air");
                }
            }
            if (e instanceof Volleyball) {
                if (((Volleyball) e).isAirPressure()) {
                    System.out.println(((Volleyball) e).getType() + " with id: " + ((Volleyball) e).getId() + " Needs more air");
                }
            }
            if (e instanceof Basketball) {
                if (((Basketball) e).isAirPressure()) {
                    System.out.println(((Basketball) e).getType() + " with id: " + ((Basketball) e).getId() + " Needs more air");
                }
            }
        }
    }

    public void printEquipmentNeedingToBeReplaced() {
        for (Equipment e : map.values()) {
            if (e instanceof Handball) {
                if (((Handball) e).isNeedsReplacement()) {
                    System.out.println(((Handball) e).getType() + " with id: " + ((Handball) e).getId() + " Needs to be replaced");
                }
            }
            if (e instanceof Football) {
                if (((Football) e).isNeedsReplacement()) {
                    System.out.println(((Football) e).getType() + " with id: " + ((Football) e).getId() + " Needs to be replaced");
                }
            }
            if (e instanceof Volleyball) {
                if (((Volleyball) e).isNeedsReplacement()) {
                    System.out.println(((Volleyball) e).getType() + " with id: " + ((Volleyball) e).getId() + " Needs to be replaced");
                }
            }
            if (e instanceof Basketball) {
                if (((Basketball) e).isNeedsReplacement()) {
                    System.out.println(((Basketball) e).getType() + " with id: " + ((Basketball) e).getId() + " Needs to be replaced");
                }
            }
            if (e instanceof Racket) {
                if (((Racket) e).isNeedsReplacement()) {
                    System.out.println("Racket with id: " + ((Racket) e).getId() + " Needs to be replaced");
                }
            }
        }
    }

    public void printTableTennisRacketsNeedingNewPad() {
        for (Equipment e : map.values()) {
            if (e instanceof Racket) {
                if (((Racket) e).isNeedsNewPad()) {
                    System.out.println("Racket with id: " + ((Racket) e).getId() + " Needs a new pad");
                }
            }
        }
    }
}
