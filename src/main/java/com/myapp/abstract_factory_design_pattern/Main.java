package com.myapp.abstract_factory_design_pattern;

public class Main {

    public  static void main(String[] args){
        CarFactory northAmericanFactory = new NorthAmericaCarFactory();
        Car northAmericaCar = northAmericanFactory.createCar();
        CarSpecifications northAmericaSpec = new NorthAmericaSpecifications();

        northAmericaCar.assemble();
        northAmericaSpec.display();


        CarFactory asianFactory = new AsianCarFactory();
        Car asianCar = asianFactory.createCar();
        CarSpecifications asianSpec = new AsianSpecifications();

        asianCar.assemble();
        asianSpec.display();
    }
}
