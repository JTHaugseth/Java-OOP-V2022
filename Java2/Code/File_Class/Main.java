package File_Class;

import java.io.File;

public class Main {

    public static void main(String[] args){
        // file = An abstract representation of file and directory pathnames.

        File file = new File("Java2/Code/File_Class/Secret_Message");

        //file.delete(); deletes the file. Remember to refresh, to see that it is deleted.

        if (file.exists()) {
            System.out.println("That file exists!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile()); // Returns boolean-value.
        } else {
            System.out.println("That file does not exist!");
        }
    }
}
