package ComboBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JComboBox comboBox;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals = {"dog", "cat", "bird"};
        // okay, if you need to store a primitive data types ie. int, you need to use the wrapper class Integer with uppercase
        // like this: Integer[] numbers = {5,1,23,89}; OR Double[] numbers = {2.3,4.8,7.4};
        // String is a wrapper class! String is list of char's

        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);

        comboBox.setEditable(true); // allows typing to selection box, selecting with enter; if typing dowsn't exist within the list, method returns -1
        System.out.println(comboBox.getItemCount()); // returns number of items
        comboBox.addItem("horse"); // adds item to the back of the list
        comboBox.insertItemAt("pig", 0); // inserts item to given index no.
        comboBox.setSelectedIndex(0); // sets the pre-selected index to given index; combobox selects index 0 automaticly but if you add item to the start or list it stays on that pre selcted itme.
        System.out.println(comboBox.getItemCount());
        comboBox.removeItem("cat");
        comboBox.removeItemAt(0);
        //comboBox.removeAllItems();

        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == comboBox) {
            //System.out.println(comboBox.getSelectedItem());
            System.out.println(comboBox.getSelectedIndex());
        }
    }
}
