package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Circle;
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Shape;
import edu.cmu.cs.cs214.lab02.shapes.Square;

public class ShapeFactory {
    public Shape getShape(String shapeType, double... parameters) {
        if (shapeType == null) return null;

        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle(parameters[0]);
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle(parameters[0], parameters[1]);
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square(parameters[0]);
        }
        
        return null;
    }
}
