package com.myapp.prototype_design_pattern;

public class Circle implements Shape{
    private final String color;
    public Circle(String color) {
        this.color = color;
    }

    @Override
    public Shape clone() {
        return new Circle(this.color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + color+ " color Circle");
    }
}
