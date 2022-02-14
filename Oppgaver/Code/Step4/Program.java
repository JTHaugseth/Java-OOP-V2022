package Step4;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    public void runProgram() {
        System.out.println("Step4.Program starting");
    }
    public void task4() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter three words");
        list.add(scanner.next());
        list.add(scanner.next());
        list.add(scanner.next());
        System.out.println("You entered");
        for (String i : list) {
            System.out.println(i);
        }
    }
    public void numbers() {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int sum = 0;
        int number = 0;

        while (number >= 0) {
            number = input.nextInt();
            if (number >= 0) {
                list.add(number);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println(sum);
    }
    public void menu() {
        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int choice = 0;

        while(choice !=3){

            System.out.println("1 - Add single word");
            System.out.println("2 - Display all words");
            System.out.println("3 - End");

            choice = input.nextInt();

            if(choice == 1){
                System.out.println("Write a word");
                list.add(input.next());
            }
            if(choice == 2){
                System.out.println("Displaying all your words");
                System.out.println(list);
            }
            if(choice == 3){
                System.out.println("End");
            }
        }
    }
}
