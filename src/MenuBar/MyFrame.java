package MenuBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame implements ActionListener {

    // 3,03

    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;
    ImageIcon loadIcon;
    ImageIcon saveIcon;
    ImageIcon exitIcon;

    MyFrame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        loadIcon = new ImageIcon("C:\\Users\\JussiSavoranta\\code\\java\\training\\SwingGUI\\src\\MenuBar\\pink_folder.png");
        saveIcon = new ImageIcon("C:\\Users\\JussiSavoranta\\code\\java\\training\\SwingGUI\\src\\MenuBar\\pink_floppy.png");
        exitIcon = new ImageIcon("C:\\Users\\JussiSavoranta\\code\\java\\training\\SwingGUI\\src\\MenuBar\\pink_folder.png");

        // creating a menu bar
        JMenuBar menuBar = new JMenuBar();
        // menu categories
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        // items for categories
        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("save");
        exitItem = new JMenuItem("exit");

        // action listeners for menu items
        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        // icons to menu items
        loadItem.setIcon(loadIcon);
        saveItem.setIcon(saveIcon);
        exitItem.setIcon(exitIcon);

        // setting keyboard shortcuts to menu categories
        fileMenu.setMnemonic(KeyEvent.VK_F); // Alt + F for file menu
        editMenu.setMnemonic(KeyEvent.VK_E); // Alt + E for edit menu
        helpMenu.setMnemonic(KeyEvent.VK_H); // Alt + H for help menu

        // setting keyboard shortcuts to menu items
        loadItem.setMnemonic(KeyEvent.VK_L); // L for load
        saveItem.setMnemonic(KeyEvent.VK_S); // S for save
        exitItem.setMnemonic(KeyEvent.VK_E); // E for exit


        // adding idividual items to a category
        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == loadItem) {
            System.out.println("**beep boop** you loaded a file");
        }
        if(e.getSource() == saveItem) {
            System.out.println("**beep boop** you saved a file");
        }
        if (e.getSource() == exitItem) {
            System.exit(0);
        }
    }
}
