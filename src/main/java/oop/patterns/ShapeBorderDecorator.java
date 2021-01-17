package oop.patterns;

import oop.concepts.Shape;

public class ShapeBorderDecorator extends Shape {
    private Shape shape;

    public ShapeBorderDecorator(Shape shape){
        super(shape.getName());
        this.shape = shape;
    }

    @Override
    public void draw(){
        shape.draw();
        addBorder();
    }
    private void addBorder(){
        System.out.println(" with border");
    }
}
