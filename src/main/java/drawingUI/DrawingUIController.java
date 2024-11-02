package drawingUI;

import Shapes.Drawing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DrawingUIController {

    JPanel controlsPanel = new JPanel();
    JPanel mainPanel = new JPanel();
    Drawing drawing = new Drawing();

    public DrawingUIController() {
        mainPanel.setLayout(new GridLayout(2,1));
        controlsPanel.setLayout(new GridLayout(3,1));

        mainPanel.add(drawing);
        mainPanel.add(controlsPanel);
        addMouseListenerToDrawing();
    }
    private void addMouseListenerToDrawing(){
        drawing.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                drawing.addCircle(200,e.getPoint(), Color.red);
                drawing.repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        })
    ;}



    public JPanel getMainPanel() {
        return mainPanel;
    }
}
