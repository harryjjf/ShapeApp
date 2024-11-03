package drawingUI;

import Shapes.Circle;
import Shapes.Drawing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Objects;

public class DrawingUIController {

    JPanel controlsPanel = new JPanel();
    JPanel mainPanel = new JPanel();
    Drawing drawing = new Drawing();
    ShapeSelector sSel = new ShapeSelector();
    ColourSelector cSel = new ColourSelector();
    CircleDimsSelector cDimsSel = new CircleDimsSelector();
    RectDimsSelector rDimsSel = new RectDimsSelector();
    ShapeCounter sCounter = new ShapeCounter();
    SquareDimSelector sSquareSel = new SquareDimSelector();

    public DrawingUIController() {
        mainPanel.setLayout(new GridLayout(2,1));
        controlsPanel.setLayout(new GridLayout(3,1));

        mainPanel.add(controlsPanel);
        mainPanel.add(drawing);

        controlsPanel.add(cSel);
        controlsPanel.add(sSel);
        controlsPanel.add(cDimsSel);
        controlsPanel.add(rDimsSel);
        controlsPanel.add(sSquareSel);
        controlsPanel.add(sCounter);


        addMouseListenerToDrawing();
    }
    private void addMouseListenerToDrawing(){
        drawing.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (Objects.equals(sSel.getCurrentShape(), "Circle"))
                    drawing.addCircle(cDimsSel.getCurrentRadius(),e.getPoint(), cSel.getCurrentColour());
                else if (Objects.equals(sSel.getCurrentShape(), "Rectangle"))
                    drawing.addRect(rDimsSel.getCurrentWidth(),rDimsSel.getCurrentLength(), e.getPoint(), cSel.getCurrentColour());
                else if (Objects.equals(sSel.getCurrentShape(), "Square"))
                    drawing.addSquare(sSquareSel.getCurrentSideLength(), e.getPoint(), cSel.getCurrentColour());

                drawing.repaint();
                sCounter.setNumShapes(drawing.getNumCircles(), drawing.getNumRectangles(), drawing.getNumSquare());
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
