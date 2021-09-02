import javax.swing.*;
import java.awt.*;

public class Panels {
    public static void main(String[] args) {

        ImageIcon icon = new ImageIcon("C:\\Users\\JussiSavoranta\\code\\java\\training\\SwingGUI\\src\\logo.png");
        JLabel label = new JLabel();
        label.setText("Tm");
        label.setIcon(icon);
        //label.setVerticalAlignment(JLabel.BOTTOM);
        //label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(0,0,200,200);

        // JPANEL
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);
        redPanel.setLayout(null);
        //redPanel.setLayout(new BorderLayout());

        JPanel bluePanel = new JPanel();
        bluePanel.setBounds(250,0,250,250);
        bluePanel.setBackground(Color.blue);
        bluePanel.setLayout(null);

        JPanel greenPanel = new JPanel();
        greenPanel.setBounds(0,250,500,250);
        greenPanel.setBackground(Color.green);
        greenPanel.setLayout(null); // this needs to be added to the panel with the label IF the label has manual alignment

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750, 750);
        frame.setLayout(null); // disables the automatic layout manager
        frame.setVisible(true);

        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
        bluePanel.add(label);
    }
}
