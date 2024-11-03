package drawingUI;

import javax.swing.*;
import java.awt.*;

public class ShapeCounter extends JPanel {

    JLabel numRect = new JLabel();
    JLabel numCircle = new JLabel();
    JLabel numSquare = new JLabel();

    public ShapeCounter() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));
        setNumShapes(0, 0, 0);
        panel.add(numRect);
        panel.add(numCircle);
        panel.add(numSquare);
        add(panel);
    }
    public void setNumShapes(int circle, int rect, int square) {
        numRect.setText("Number of Rectangles: " + rect);
        numCircle.setText("Number of Circles: " + circle);
        numSquare.setText("Number of Squares: " + square);
    };

}
