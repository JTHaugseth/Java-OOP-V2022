package Labels;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        // JLabel = a GUI display area for a string of text, an image, or both

        ImageIcon image = new ImageIcon("Java2/Code/Labels/code.jpg");
        Border border = BorderFactory.createLineBorder(Color.green, 3);

        JLabel label = new JLabel(); // create a label
        label.setText("Bro, do you even code?"); // set text for label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text left, right or center of imageicon
        label.setVerticalTextPosition(JLabel.TOP); // set text top, center or bottom of imageicon
        label.setForeground(Color.green); // sets font-color to green. You can also use RGB or hex-colors using "new Color()";
        label.setFont(new Font("MV Boli", Font.PLAIN, 20)); // sets font of text
        label.setIconTextGap(-10); // set gap of text to image
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon and text within label
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon and text within label
        //label.setBounds(0, 0, 250, 250); // set x,y position within frame as well as dimensions

        label.setBackground(Color.BLACK); // set background color
        label.setOpaque(true); // display background color

        label.setBorder(border); // sets a border

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500,500); //uncomment and comment away frame.pack to test
        //frame.setLayout(null); //uncomment label.setBounds
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
    }
}
