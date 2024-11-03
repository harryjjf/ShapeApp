package drawingUI;

import javax.swing.*;
import java.awt.*;


public class SquareDimSelector extends JPanel {

    JSlider sideLength = new JSlider(1, 100);
    JLabel lengthLabel = new JLabel("Square Side Length");


    public SquareDimSelector() {
        JPanel controls = new JPanel();
        controls.setLayout(new GridLayout(3, 1));
        controls.add(lengthLabel);
        controls.add(sideLength);
        add(controls);
    }

    public int getCurrentSideLength() {
        return sideLength.getValue();
    }

}

