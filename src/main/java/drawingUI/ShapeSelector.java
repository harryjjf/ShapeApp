package drawingUI;
import javax.swing.*;

public class ShapeSelector extends JPanel {
    private JRadioButton bCirc = new JRadioButton("Circle");
    private JRadioButton bRect = new JRadioButton("Rectangle");
    private JRadioButton Square = new JRadioButton("Square");
    ButtonGroup group = new ButtonGroup();

    public ShapeSelector() {
        group.add(bCirc);
        group.add(bRect);
        group.add(Square);

        add(bCirc);
        add(bRect);
        add(Square);
        bCirc.setSelected(true);
    }

    public String getCurrentShape(){
        if (bCirc.isSelected()){
            return "Circle";
        }
        else if (bRect.isSelected()){
            return "Rectangle";
        }
        else if (Square.isSelected()){
            return "Square";
        }
        else{
            return "Circle";
        }
    }
}
