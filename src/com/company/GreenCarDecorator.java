package com.company;

public class GreenCarDecorator extends CarDecorator {

    public GreenCarDecorator(Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public void startEngine() {

    }

    @Override
    public void refuelTheCar() {

    }

    @Override
    public void pedalToTheMetal() {

    }
    public Car setColorGreen(Car decoratedCar){
        decoratedCar.color="Green";
        return decoratedCar;
    }
}
