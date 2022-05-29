package Exam2021;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Program program = new Program();
        program.fileReader();

        System.out.println(program.map.get(5));
    }
}
