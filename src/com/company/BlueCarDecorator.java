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
    public void setColorBlue(){
        decoratedCar.color="Blue";
    }
}
