package com.myapp.builder_design_pattern;

public class Main {

    public static void main(String[] args) {
        GamingComputerBuilder gamingBuilder = new GamingComputerBuilder();
        ComputerDirector director = new ComputerDirector();

        director.construct(gamingBuilder);
        Computer gamingComputer = gamingBuilder.getResult();

        gamingComputer.displayInfo();

      }
}
