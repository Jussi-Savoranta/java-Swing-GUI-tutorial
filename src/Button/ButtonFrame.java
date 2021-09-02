package Button;

import javax.swing.*;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    ButtonFrame() {

            ImageIcon icon = new ImageIcon("C:\\Users\\JussiSavoranta\\code\\java\\training\\SwingGUI\\src\\house.png");
            //ImageIcon labelIcon = new ImageIcon("C:\\Users\\JussiSavoranta\\code\\java\\training\\SwingGUI\\src\\house.png");

            label = new JLabel();
            label.setIcon(icon);
            label.setSize(200,200);
            label.setBounds(110,200,250,100);
            label.setVisible(false);

            button = new JButton();
            button.setBounds(110,100,250,100);
            button.addActionListener(this);
            // or
            button.addActionListener(e -> System.out.println("poo")); // this replaces implements Actionlistener and Actionlistener method
            button.setText("this is a Button");
            button.setFocusable(false); // gets rid of focus lines around the text (visible only short time)
            button.setIcon(icon);
            button.setHorizontalTextPosition(JButton.CENTER);
            button.setVerticalTextPosition(JButton.BOTTOM);
            button.setFont(new Font("Comic SAns", Font.BOLD,25));
            button.setIconTextGap(-5);
            button.setForeground(Color.MAGENTA);
            button.setBackground(Color.lightGray);
            button.setBorder(BorderFactory.createEtchedBorder());


            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLayout(null);
            this.setSize(500,500);
            this.setVisible(true);
            this.add(button);
            this.add(label);
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            System.out.println(label.getLocation());
            button.setEnabled(false); // creates button that can be clicked once and then it's disabled
            label.setVisible(true);

        }
    }
}
