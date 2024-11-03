package drawingUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColourSelector extends JPanel {

    private Color currentColour =  Color.blue;

    public ColourSelector() {
        JButton btn1 = new JButton("Select Colour");
        add(btn1);
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Color newColour = JColorChooser.showDialog(
                        btn1, "Choose Colour", currentColour);
                currentColour=newColour;
                btn1.setBackground(currentColour);
            }
        });

    }

    public Color getCurrentColour(){
        return currentColour;
    }
}
