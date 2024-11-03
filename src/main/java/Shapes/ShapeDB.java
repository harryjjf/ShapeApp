package Shapes;

import java.awt.*;
import java.util.ArrayList;

public class ShapeDB {

    private ArrayList<Shape> shapes = new ArrayList<>();

    void addCircle(int radius, Point position, Color colour){
        shapes.add(new Circle(radius, position, colour));
    };

    void addRect(int width, int height, Point position , Color colour){
        shapes.add(new Rect(width, height, position, colour));
    }

    void addSquare(int sideLength, Point position, Color colour){
        shapes.add(new Square(sideLength, position, colour));
    }

    void drawShapes(Graphics g){
        for (Shape s : shapes) {
            s.draw(g);
        }
    }
    int countClasses(Class<?> T) {
        int count = 0;
        for (Object object : shapes) {
            if (T.isInstance(object)) {
                count++;
            }
        }
        return count;
    }
}
