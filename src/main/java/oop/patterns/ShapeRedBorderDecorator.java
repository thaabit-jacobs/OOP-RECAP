package oop.patterns;

import oop.concepts.Shape;

public class ShapeRedBorderDecorator extends Shape {
    private Shape shape;

    public ShapeRedBorderDecorator(Shape shape){
        super(shape.getName());
        this.shape = shape;
    }

    @Override
    public void draw(){
        shape.draw();
        addRedBorder();
    }
    private void addRedBorder(){
        System.out.println(" with red border");
    }
}
