package oop.concepts;

public class Shape {

    String name;

    public Shape(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void draw(){
        System.out.format("Drawing " + name);
    }

}
