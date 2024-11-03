package drawingUI;
import javax.swing.*;
import java.awt.*;

public class CircleDimsSelector extends JPanel {

    JLabel label=new JLabel(" Circle Radius");
    JSlider radiusSlider =new JSlider(1,100);

    public CircleDimsSelector() {
       // add(radius);
        JPanel controls=new JPanel();
        controls.setLayout(new GridLayout(3,1));
        controls.add(label);
        controls.add(radiusSlider);
        add(controls);
    }

    public int getCurrentRadius() {
        return radiusSlider.getValue();
    }
}

