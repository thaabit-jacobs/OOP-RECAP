package oop.concepts;

public abstract class Quadrilateral extends Shape{
    public Quadrilateral(String name) {
        super(name);
    }

    public boolean hasFourSides(){
        return true;
    }
}
