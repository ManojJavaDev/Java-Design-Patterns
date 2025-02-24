package com.myapp.prototype_design_pattern;

public class ShapeClient {


    private final Shape shapePrototype;

    public ShapeClient(Shape shapePrototype) {
        this.shapePrototype = shapePrototype;
    }

    public Shape createShape(){
        return shapePrototype.clone();
    }

}
