package com.company;

public class CarDecorator implements CarFunctions {
    private CarFunctions carFunctions;

    CarDecorator(CarFunctions carFunctions){
        this.carFunctions = carFunctions;
    }
    @Override
    public void startEngine() {

    }
}
