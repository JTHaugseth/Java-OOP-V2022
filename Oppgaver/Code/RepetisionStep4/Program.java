package RepetisionStep4;

import java.awt.image.AreaAveragingScaleFilter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Program {

    public void runProgram() {
        System.out.println("Program Starting");
        //oppgave4();
        //oppgave6();
        //oppgave7();

        ArrayList<String> namelist = new ArrayList<>();
        namelist.add("Kari");
        namelist.add("Lars");
        namelist.add("Markus");

        ArrayList<String> newList = new ArrayList<>();
        for (int i = namelist.size(); i > 0; i--) {
            newList.add(namelist.get(i));

        }
        System.out.println(newList);
    }
    public void oppgave4(){

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        list.add(scanner.next());
        list.add(scanner.next());
        list.add(scanner.next());

        System.out.println(list);

    }
    public void oppgave6(){
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int counter = 0;

        while (counter >= 0) {
            counter = input.nextInt();
            if (counter >= 0) {
                list.add(counter);
            }
        }
        int sum = 0;

        for (Integer i : list) {
            sum += i;
        }
        System.out.println("sum: " +sum);
    }
    public void oppgave7(){
        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        int choice = 0;

        while (choice != 3) {
            System.out.println("Press 1 to add a word!");
            System.out.println("Press 2 to display all words!");
            System.out.println("Press 3 to end!");
            choice = input.nextInt();

            if(choice == 1){
                System.out.println("Write a word");
                list.add(input.next());
            } else if ( choice == 2) {
                System.out.println("Printing all words");
                for (String i : list) {
                    System.out.println(i);
                }
            } else {
                System.out.println("Goodbye!");
            }


        }






    }
}
