package edu.cmu.cs.cs214.lab02;

import java.util.List;

import edu.cmu.cs.cs214.lab02.shapes.*;

public class Renderer {
    private List<Shape> shapes;
    
    Renderer(List<Shape> shapes) {
        this.shapes = shapes;
    }

    void draw() {
        for (Shape shape : shapes) {
            double area = shape.getArea();
            System.out.println("Shape printed\n" + "Its area is " + area);
        }
    }
}
