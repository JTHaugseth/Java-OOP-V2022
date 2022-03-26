package GUI;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        // JFrame = a GUI window to add components to

        /*JFrame frame = new JFrame(); //Creates a frame for us
        frame.setTitle("Title"); // Sets title for frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application. Makes the X top right actually close the program
        frame.setResizable(false); // Prevents frame from being resized
        frame.setSize(420, 420); // Sets the x dimension and the y dimension
        frame.setVisible(true); // Make frame visible

        ImageIcon image = new ImageIcon("Java2/Code/GUI/logo.png"); // create an image icon
        frame.setIconImage(image.getImage()); // Change icon of frame to image

        frame.getContentPane().setBackground(Color.green); // change color of background. You can use RGB or hex-colors with "new Color()".*/

        //MyFrame myFrame = new MyFrame();
        new MyFrame();
    }
}
