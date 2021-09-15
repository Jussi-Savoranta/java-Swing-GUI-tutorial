package GraphicsDemo;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    Image img;
    MyPanel() {
        // creating a image out of imageIcon for later
        img = new ImageIcon("C:\\Users\\JussiSavoranta\\code\\java\\training\\SwingGUI\\src\\house.png").getImage();
        this.setPreferredSize(new Dimension(500,500));
    }

    // this paint()-method is actually called behind the scenes automatically when we invoke JFrame
    // it draws every graphical component to the frame/panel/label
    public void paint(Graphics g) {

        // paint() uses Graphics but it is little outdated, Graphics2D is updated version of it
        // it allows to do some more things with it
        // so first, we cast (= tyyppimuunnos in finnish) this Graphics object as a Graphics2D object
        Graphics2D g2D = (Graphics2D) g;

        g2D.setPaint(Color.blue);
        //g2D.setStroke(new BasicStroke(5)); // sets the stroke width in pixels
        // g2D.drawLine(0,0,500,500); // draws a line from corner to corner

//        g2D.setPaint(Color.pink);
//        //g2D.drawRect(0,0, 100, 200); // draws a rectangle with the stroke set above
//        g2D.fillRect(0,0,100,200); // draws a filled rectangle

//        g2D.setPaint(Color.orange);
//        g2D.drawOval(0,0,100,75); // draws oval
//        g2D.fillOval(0,0,100,75); // draws filled oval
//        g2D.drawArc(0,0,100,100,0,180); // draws an arc (= kaari in finnish)

        // painting a pokeball :)
//        g2D.setPaint(Color.red);
//        g2D.fillArc(0,0,100,100,0,180);
//        g2D.setPaint(Color.white);
//        g2D.fillArc(0,0,100,100,180,180);
//        g2D.setPaint(Color.black);
//        g2D.fillOval(40,40,20,20);
//        g2D.setStroke(new BasicStroke(5));
//        g2D.drawLine(3,50,97,50);
//        g2D.drawOval(0,0,100,100);

//        // drawing a triangle with polygons
//        int[] xPoints = {150, 250, 350};
//        int[] yPoints = {300, 150, 300};
//        g2D.setPaint(Color.yellow);
////        g2D.drawPolygon(xPoints, yPoints, 3);
//        g2D.fillPolygon(xPoints, yPoints, 3);

//        // drawing a string
//        g2D.setPaint(Color.MAGENTA);
//        g2D.setFont(new Font("Ink Free", Font.BOLD, 25));
//        // starting point of drawString is the BOTTOM OF THE STRING so if y = 0 it won't be visible
//        g2D.drawString("Bleep bloop", 50,50);

        // drawing a image of existing image
        g2D.drawImage(img, 0,0,null);

    }
}
