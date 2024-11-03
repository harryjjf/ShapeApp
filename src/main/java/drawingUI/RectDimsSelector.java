package drawingUI;

import javax.swing.*;
import java.awt.*;


public class RectDimsSelector extends JPanel {

    JSlider width = new JSlider(1, 100);
    JSlider length = new JSlider(1, 100);
    JLabel widthLabel = new JLabel("Rectangle Width");
    JLabel lengthLabel = new JLabel("Rectangle Length");


    public RectDimsSelector() {
        JPanel controls = new JPanel();
        controls.setLayout(new GridLayout(4, 1));
        controls.add(widthLabel);
        controls.add(width);
        controls.add(lengthLabel);
        controls.add(length);
        add(controls);
        }

    public int getCurrentWidth() {
        return width.getValue();
    }
    public int getCurrentLength() {
        return length.getValue();
    }

}
