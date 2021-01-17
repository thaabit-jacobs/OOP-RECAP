package oop.concepts;

import oop.patterns.AreaCalculatorStrategy;

public class AreaCalculator {
    private AreaCalculatorStrategy areaCalculatorStrategy;

    public void setAreaCalculatorStrategy(AreaCalculatorStrategy areaCalculatorStrategy){
        this.areaCalculatorStrategy = areaCalculatorStrategy;
    }

    public double calculateArea(Shape shape){
        return areaCalculatorStrategy.calculateArea(shape);
    }
}
