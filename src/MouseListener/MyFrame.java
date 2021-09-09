package MouseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener {

    JLabel label;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);

        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.lightGray);
        label.setOpaque(true);
        this.addMouseListener(this);

        this.add(label);
        this.setLayout(null);
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
        label.setBackground(Color.yellow);

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Invoked when a mouse button has been released on a component
        //System.out.println("You released the mouse");
        label.setBackground(Color.green);

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Invoked when the mouse enters a component
        System.out.println("You enterd the label");
        label.setBackground(Color.blue);

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Invoked when the mouse exits a component
        System.out.println("You exited the label");
        label.setBackground(Color.red);

    }
}
