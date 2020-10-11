package com.company;

public abstract class CarDecorator implements CarFunctions {
    public Car decoratedCar;

    public CarDecorator(Car decoratedCar){
        this.decoratedCar=decoratedCar;
    }

}
