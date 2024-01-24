package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Shape;

public class Main {    
    public static void main(String[] args) {
        Renderer renderer = new Renderer();

        Shape shape1 = renderer.getShape("CIRCLE");
        shape1.draw;

        Shape shape2 = renderer.getShape("RECTANGLE");
        shape2.draw;

        Shape shape3 = renderer.getShape("SQUARE");
        shape3.draw;
    }
}
