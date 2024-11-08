package Shapes;

import java.awt.*;

public class Drawing extends Canvas {
    private ShapeDB shapes = new ShapeDB();

    public Drawing(){
        setSize(400,200);
        setBackground(Color.white);
    }

    public void addCircle(int radius, Point position, Color colour){
        shapes.addCircle(radius, position, colour);
    }
    public void addRect(int width, int length, Point position, Color colour){
        shapes.addRect(width, length, position, colour);
    }
    public void addSquare(int sideLength, Point position, Color colour){
        shapes.addSquare(sideLength, position, colour);
    }
    public int getNumCircles(){
        return shapes.countClasses(Circle.class);
    }
    public int getNumRectangles(){
        return shapes.countClasses(Rect.class);
    }
    public int getNumSquare(){
        return shapes.countClasses(Square.class);
    }


    public void paint(Graphics g) {
        shapes.drawShapes(g);
        }
    }

