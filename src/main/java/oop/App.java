package oop;

import oop.concepts.*;
import oop.patterns.ShapeBorderDecorator;
import oop.patterns.ShapeRedBorderDecorator;
import oop.patterns.ShapeRepoSingelton;

public class App {
    public static void main(String[] args) {
        Shape triangle = new Triangle("Triangle", 12, 18, 25, 10);
        Shape squareOne = new Square("Square", 10);
        Shape parallelogramOne = new Parallelogram("Parallelogram", 25, 10, 18.2);
        ShapePrinter shapeTwo = new Square("Square", 24);
        Quadrilateral parallelogramTwo = new Parallelogram("Parallelogram", 10, 7.5, 12);

        Brush.drawShape(triangle);
        Brush.drawShape(squareOne);
        Brush.drawShape(parallelogramOne);
        Brush.drawShape((Shape)shapeTwo);
        Brush.drawShape(parallelogramTwo);

        ShapeRepoSingelton repoOne = ShapeRepoSingelton.getInstance();
        ShapeRepoSingelton repoTwo = ShapeRepoSingelton.getInstance();

        repoOne.addShape(triangle);
        repoOne.addShape(squareOne);
        repoOne.addShape(parallelogramOne);

        repoTwo.addShape((Shape)shapeTwo);
        repoTwo.addShape(parallelogramTwo);

        System.out.println(repoOne.getShapeList());
        System.out.println(repoTwo.getShapeList());


        AreaCalculator areaCalculator = new AreaCalculator();

        //Square strategy
        areaCalculator.setAreaCalculatorStrategy(s -> ((Square)s).getSides() * 2);
        System.out.println(areaCalculator.calculateArea(squareOne));

        //triangle strategy
        areaCalculator.setAreaCalculatorStrategy(t -> {
            Triangle tri = ((Triangle)t);
            return 0.5 * tri.getBase() * tri.getHeight();
        });
        System.out.println(areaCalculator.calculateArea(triangle));

        //parallelogram strategy
        areaCalculator.setAreaCalculatorStrategy(p -> {
            Parallelogram para = ((Parallelogram)p);
            return para.getBase() * para.getHeight();
        });
        System.out.println(areaCalculator.calculateArea(parallelogramOne));

        //border decorator
        ShapeBorderDecorator triangleBorderDecorator = new ShapeBorderDecorator(triangle);
        ShapeBorderDecorator squareBorderDecorator = new ShapeBorderDecorator(squareOne);
        //red border decorator
        ShapeRedBorderDecorator paraRedBorderDecorator = new ShapeRedBorderDecorator(parallelogramOne);
        ShapeRedBorderDecorator squareRedBorderDecorator = new ShapeRedBorderDecorator((Shape)shapeTwo);


        Brush.drawShape(triangleBorderDecorator);
        Brush.drawShape(paraRedBorderDecorator);
        Brush.drawShape(squareBorderDecorator);
        Brush.drawShape(squareRedBorderDecorator);
    }
}
