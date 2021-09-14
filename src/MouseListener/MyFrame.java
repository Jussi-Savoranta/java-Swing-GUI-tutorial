package MouseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener {

    JLabel label;
    ImageIcon smile;
    ImageIcon nervous;
    ImageIcon pain;
    ImageIcon dizzy;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);

        label = new JLabel();
//        label.setBounds(0,0,100,100);
//        label.setBackground(Color.lightGray);
//        label.setOpaque(true);
        label.addMouseListener(this);

        smile = new ImageIcon("C:\\Users\\JussiSavoranta\\code\\java\\training\\SwingGUI\\src\\MouseListener\\bigSmile.png");
        nervous = new ImageIcon("C:\\Users\\JussiSavoranta\\code\\java\\training\\SwingGUI\\src\\MouseListener\\EyeRoll.png");
        pain = new ImageIcon("C:\\Users\\JussiSavoranta\\code\\java\\training\\SwingGUI\\src\\MouseListener\\frustration.png");
        dizzy = new ImageIcon("C:\\Users\\JussiSavoranta\\code\\java\\training\\SwingGUI\\src\\MouseListener\\dizzy.png");

        label.setIcon(smile);
        this.add(label);

        this.add(label);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setLocationRelativeTo(null); // will make your frame appear in the middle of computer screen
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Invoked when the mouse button has been clicked (pressed AND released) on a component
        //System.out.println("You clicked the mouse");

    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Invoked when a mouse button has been pressed on a component
        //System.out.println("You pressed the mouse");
//        label.setBackground(Color.yellow);
        label.setIcon(pain);

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Invoked when a mouse button has been released on a component
        //System.out.println("You released the mouse");
//        label.setBackground(Color.green);
        label.setIcon(dizzy);

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Invoked when the mouse enters a component
        System.out.println("You enterd the label");
//        label.setBackground(Color.blue);
        label.setIcon(nervous);

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Invoked when the mouse exits a component
        System.out.println("You exited the label");
//        label.setBackground(Color.red);
        label.setIcon(smile);

    }
}
