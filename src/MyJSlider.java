import javax.swing.*;
import java.awt.*;

public class MyJSlider {
    MyJSlider() {
        JFrame frame = new JFrame("");
        frame.setLayout(new BorderLayout());
        frame.setTitle("Resizable square");

        JSlider slider = new JSlider();
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
