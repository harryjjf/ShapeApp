import drawingUI.DrawingUIController;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public static void main(String[] args) {
        DrawingUIController DUI = new DrawingUIController();

        JFrame frame = new JFrame();
        frame.setSize(500, 600);

        frame.add(DUI.getMainPanel());
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}
