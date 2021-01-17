package oop.patterns;

import oop.concepts.Shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeRepoSingelton {
    private static ShapeRepoSingelton instance;
    private List<Shape> shapesList;

    private ShapeRepoSingelton(){
        this.shapesList = new ArrayList();
    }

    public static ShapeRepoSingelton getInstance(){
        if(instance == null){
            instance = new ShapeRepoSingelton();
            return instance;
        }

        return instance;
    }

    public boolean addShape(Shape shape){
        return shapesList.add(shape);
    }

    public List<Shape> getShapeList(){
        return new ArrayList<>(shapesList);
    }

}
