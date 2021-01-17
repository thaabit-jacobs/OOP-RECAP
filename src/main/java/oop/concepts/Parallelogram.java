package oop.concepts;

public class Parallelogram extends Quadrilateral{
    private double base;
    private double side;
    private double height;

    public Parallelogram(String name, double base, double side, double height) {
        super(name);
        this.base = base;
        this.side = side;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getSide() {
        return side;
    }

    public double getHeight() {
        return height;
    }



    @Override
    public void draw(){
        System.out.print("Drawing " + name);
    }
}
