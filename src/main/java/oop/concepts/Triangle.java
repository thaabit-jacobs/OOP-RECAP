package oop.concepts;

public class Triangle extends Shape{
    double sideOne;
    double sideTwo;
    double base;
    double height;

    public Triangle(String name, double sideOne, double sideTwo, double base, double height) {
        super(name);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.base = base;
        this.height = height;
    }

    public double getSideOne() {
        return sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void draw(){
        System.out.print("Drawing " + name);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "name=" + "triangle" +
                ", sideOne=" + sideOne +
                ", sideTwo=" + sideTwo +
                ", base=" + base +
                ", height=" + height +
                '}';
    }
}
