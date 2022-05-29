package Exam2021;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Program {

    HashMap<Integer, Equipment> map = new HashMap<>();

    public void fileReader() throws FileNotFoundException {
        File file = new File("Oppgaver/Code/Exam2021/equipment.txt");
        Scanner scanner = new Scanner(file);
        System.out.println("Reading from the equipment file...");

        while(scanner.hasNextLine()){
            String typeEquipment = scanner.nextLine();

            switch (typeEquipment) {
                case "Ball":

                    int idBall = scanner.nextInt();
                    scanner.nextLine();
                    String lockerBall = scanner.nextLine();
                    String replacementBall = scanner.nextLine();
                    boolean replacementBallState = Boolean.parseBoolean(replacementBall);
                    String typeBall = scanner.nextLine();
                    String airPressure = scanner.nextLine();
                    boolean airPressureState = Boolean.parseBoolean(airPressure);

                    switch (typeBall) {
                        case "Football":
                            Equipment equipment = new Football("Ball", idBall, new Locker(lockerBall), replacementBallState, Type.Football, airPressureState);
                            map.put(idBall, equipment);
                            break;
                        case "Handball":
                            equipment = new Handball("Ball", idBall, new Locker(lockerBall), replacementBallState, Type.Handball, airPressureState);
                            map.put(idBall, equipment);
                            break;
                        case "Volleyball":
                            equipment = new Volleyball("Ball", idBall, new Locker(lockerBall), replacementBallState, Type.Volleyball, airPressureState);
                            map.put(idBall, equipment);
                            break;
                        case "Basketball":
                            equipment = new Basketball("Ball", idBall, new Locker(lockerBall), replacementBallState, Type.Basketball, airPressureState);
                            map.put(idBall, equipment);
                            break;
                        default:
                            System.out.println("Something went wrong with switch TypeBall in Ball");
                    }
                break;

                case "TableTennisRacket":

                    int idRacket = scanner.nextInt();
                    scanner.nextLine();
                    String lockerRacket = scanner.nextLine();
                    String replacementRacket = scanner.nextLine();
                    boolean replacementRacketState = Boolean.parseBoolean(replacementRacket);
                    String newPadRacket = scanner.nextLine();
                    boolean newPadRacketState = Boolean.parseBoolean(newPadRacket);

                    Equipment equipment = new Racket("TableTennisRacket", idRacket, new Locker(lockerRacket), replacementRacketState, newPadRacketState);
                    map.put(idRacket, equipment);

                break;

                default:
                    System.out.println("Something went wrong with switch TypeRacket in TableTennisRacket");

            }
        }
        System.out.println("All objects created");
    }

    public Equipment printBallsNeedingMoreAir() {
        ArrayList<Equipment> list = new ArrayList<>();

        return null;
    }
}
