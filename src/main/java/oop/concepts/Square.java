package oop.concepts;


import java.util.Arrays;

public class Square extends Quadrilateral implements ShapePrinter{
    protected double sides;
    public Square(String name, double side){
        super(name);
        this.sides = side;
    }

    public double getSides(){
        return sides;
    }

    @Override
    public void draw(){
        System.out.print("Drawing " + name);
    }

    @Override
    public void printShapeName(){
        System.out.print("Square");

    }

    @Override
    public String toString() {
        return "Square{" +
                "name=" + "square," +
                "side=" + sides +
                '}';
    }
}
