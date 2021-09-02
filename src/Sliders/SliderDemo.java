package Sliders;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderDemo implements ChangeListener {

    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;

    SliderDemo() {

        frame = new JFrame("Slider demo");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0,100,50); // min, max and starting value

        slider.setPreferredSize(new Dimension(400,300));

        // setting little ticks under slider
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);

        // setting major ticks under slider
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);

        // numbering to major ticks
        slider.setPaintLabels(true);
        // changing the font
        slider.setFont(new Font("MV boli", Font.PLAIN, 15));
        label.setFont(new Font("MV boli", Font.PLAIN, 25));

        // vertical slider
        slider.setOrientation(SwingConstants.VERTICAL);
        // or horizontal
        //slider.setOrientation(SwingConstants.HORIZONTAL);

        label.setText("°C = " + slider.getValue());

        // adding the change listener to the slider
        slider.addChangeListener(this);

        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(420,420);
        frame.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {

        label.setText("°C = " + slider.getValue());
    }
}
