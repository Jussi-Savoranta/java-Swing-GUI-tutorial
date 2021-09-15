package KeyBindingsDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Game {

    JFrame frame;
    JLabel label;
    Action upAction;
    Action downAction;
    Action leftAction;
    Action rightAction;

    Game() {

        frame = new JFrame("KeyBinding Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);

        label = new JLabel();
        label.setBackground(Color.red);
        label.setBounds(100,100,100,100);
        label.setOpaque(true);

        upAction = new UpAction();
        downAction = new DownAction();
        leftAction = new LeftAction();
        rightAction = new RightAction();

        // each action needs to be binded to a key stroke on input map and that key stroke will need a name for that mapped input
        // this name (like "mappedUpAction", name doesn't really matter) is used to map this input to specific action
        // up key to upAction
        label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "mappedUpAction"); // "mappedUpAction" is a name for this keystroke and is used in the next line
        label.getActionMap().put("mappedUpAction", upAction);
        // down key to downAction
        label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "mappedDownAction");
        label.getActionMap().put("mappedDownAction", downAction);
        // left
        label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "mappedLeftAction");
        label.getActionMap().put("mappedLeftAction", leftAction);
        // right
        label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "mappedRightAction");
        label.getActionMap().put("mappedRightAction", rightAction);

        frame.add(label);
        frame.setVisible(true);
    }

    public class UpAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY() -10);
        }
    }

    public class DownAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY() +10);
        }
    }

    public class LeftAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX() - 10, label.getY());
        }
    }

    public class RightAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX() + 10, label.getY());
        }
    }

}
