import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame() {
        // FRAME
        
        this.setTitle("Title goes here");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // closes application when hitting "X"
        this.setResizable(false); // prevent frame from resizing
        this.setSize(420,420);
        this.setVisible(true); // makes frame visible

        // customizing frame
        ImageIcon image = new ImageIcon("C:\\Users\\JussiSavoranta\\code\\java\\training\\SwingGUI\\src\\logo.png"); // creates an ImageIcon
        this.setIconImage(image.getImage()); // change icon from frame
        this.getContentPane().setBackground(new Color(123,50,250)); //change background color
    }
}
