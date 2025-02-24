package com.myapp.prototype_design_pattern;

public class Main {

    public static void main(String[] args) {
        Shape circlePrototype = new Circle("red");
        ShapeClient client = new ShapeClient(circlePrototype);
        Shape redCircle = client.createShape();

        redCircle.draw();

    }
}
