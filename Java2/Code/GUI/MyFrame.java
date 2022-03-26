package GUI;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame() {

        this.setTitle("Title"); // Sets title for frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application. Makes the X top right actually close the program
        this.setResizable(false); // Prevents frame from being resized
        this.setSize(420, 420); // Sets the x dimension and the y dimension
        this.setVisible(true); // Make frame visible

        ImageIcon image = new ImageIcon("Java2/Code/GUI/logo.png"); // create an image icon
        this.setIconImage(image.getImage()); // Change icon of frame to image

        this.getContentPane().setBackground(Color.green); // change color of background. You can use RGB or hex-colors with "new Color()".
    }
}
