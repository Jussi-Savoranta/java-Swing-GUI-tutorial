import javax.swing.*;

public class DialogBox {
    public static void main(String[] args) {

        // JOptionPane =    pop up a standard dialog box that prompts users for a value
        //                  or informs them of something.

//        JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Here is some useless info", "title", JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "really", "title", JOptionPane.QUESTION_MESSAGE);
//       while (true) {
//           JOptionPane.showMessageDialog(null, "Your computer has a virus!", "title", JOptionPane.WARNING_MESSAGE);
//       }
//      JOptionPane.showMessageDialog(null, "Call tech support now!", "title", JOptionPane.ERROR_MESSAGE);

        // to see what the options return when clicked
        //System.out.println(JOptionPane.showConfirmDialog(null, "bro, do you even code?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION));

//        int answer = JOptionPane.showConfirmDialog(null, "bro, do you even code?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);
//        if(answer == 0) {
//            System.out.println("It's a yes!!!");
//        }

//        String name = JOptionPane.showInputDialog("What is your name?");
//        System.out.println("Hello " + name);

        String[] responses = {"No, you're awesome", "Thanx!", "*blush*"};
        ImageIcon icon = new ImageIcon("C:\\Users\\JussiSavoranta\\code\\java\\training\\SwingGUI\\src\\smile.png");
        JOptionPane.showOptionDialog(null, "You are awesome!",
                "secret message",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                icon,
                responses,
                0);
    }
}
