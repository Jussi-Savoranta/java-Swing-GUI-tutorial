import javax.swing.*;
import javax.swing.JButton;
import java.awt.*;

public class GridLayoutManager {

    // jäin kohtaan 1.19.45
    public static void main(String[] args) {
        // Layout Manager = Defines the natural layout for components within a container

        // GridLayout =     Places components in a grid of cells.
        //                  Each component takes all the available space within its cell,
        //                  and each cell is the same size.

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);

        // by default buttons use as much space as they can so if you want them to be smaller than the space
        // you need to resize them or use different layout such as grid or flow.
        frame.setLayout(new GridLayout(3,3,5,5)); // specify rows, columns and spacing

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        // if you create uneven amount of buttons the gridlayout just crates another column
        //frame.add(new Button.JButton("10"));



        frame.setVisible(true);
    }

}
