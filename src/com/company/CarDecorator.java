package com.company;

public abstract class CarDecorator implements CarFunctions {
    private Car decoratedCar;

    public CarDecorator(Car decoratedCar){
        this.decoratedCar=decoratedCar;
    }

    @Override
    public void startEngine() {

    }
}
