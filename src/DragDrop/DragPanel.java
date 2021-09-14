package DragDrop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DragPanel  extends JPanel {

    ImageIcon image = new ImageIcon("C:\\Users\\JussiSavoranta\\code\\java\\training\\SwingGUI\\src\\DragDrop\\bigSmile.png");
    final int WIDTH = image.getIconWidth();
    final int HEIGHT = image.getIconHeight();
    Point imageCorner; // a point representing a location in x,y coordination space (integer precision)
    Point prevPt;

    DragPanel(){

        imageCorner = new Point(0,0);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);

    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        image.paintIcon(this, g, (int) imageCorner.getX(), (int) imageCorner.getY());
    }

    private class ClickListener extends MouseAdapter{

        public void mousePressed(MouseEvent e){
            prevPt = e.getPoint(); // takes the point mouse is and updates it to this variable
        }
    }

    private class DragListener extends MouseMotionAdapter{
        // moves image as mouse is moved

        public void mouseDragged(MouseEvent e) {
            Point currentPt = e.getPoint();

            imageCorner.translate(
                    (int)(currentPt.getX() - prevPt.getX()),
                    (int)(currentPt.getY() - prevPt.getY())
            );
            prevPt = currentPt;
            repaint();
            //System.out.println(currentPt);
        }
    }

}
