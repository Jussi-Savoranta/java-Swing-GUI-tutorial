import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Labels {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("C:\\\\Users\\\\JussiSavoranta\\\\code\\\\java\\\\training\\\\SwingGUI\\\\src\\\\logo.png");
        Border border = BorderFactory.createLineBorder(new Color(153,204,51), 3);

        // lABEL
        JLabel label = new JLabel(); // label is a block of content
        label.setText("Insert text here!!!!");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text center and top
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(11,11,170));
        label.setFont(new Font("MV Boli", Font.PLAIN, 50));
        label.setIconTextGap(-25); // change gap to image, can be negative!
        label.setBackground(Color.gray);
        label.setOpaque(true); // you'll need to set this to true or background color won't be dispalyed
        label.setBorder(border); // outside border to label
        label.setVerticalAlignment(JLabel.CENTER); // set position even if you resize the window
        label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBounds(75,60,350,350); // set the placement and si<e of label

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        //frame.setLayout(null); // disables the automatic layout manager
        frame.setVisible(true);
        frame.add(label);
        frame.pack(); // makes frame as big as the conteent
    }
}
