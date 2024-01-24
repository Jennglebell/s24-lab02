package edu.cmu.cs.cs214.lab02;

import java.util.ArrayList;
import java.util.List;

import edu.cmu.cs.cs214.lab02.shapes.Shape;

public class Main {    
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        ShapeFactory shapeFactory = new ShapeFactory();
        Renderer renderer;

        Shape shape1 = shapeFactory.getShape("CIRCLE", 1);
        shapes.add(shape1);
        Shape shape2 = shapeFactory.getShape("RECTANGLE", 1, 2);
        shapes.add(shape2);
        Shape shape3 = shapeFactory.getShape("SQUARE", 3);
        shapes.add(shape3);
        
        renderer = new Renderer(shapes);
        renderer.draw();
    }
}
