package com.company;

public class BlueCarDecorator extends CarDecorator
{
    public BlueCarDecorator(Car decoratedCar) {
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
    public Car setColorBlue(Car decoratedCar){
        decoratedCar.color="Blue";
        return decoratedCar;
    }
}
