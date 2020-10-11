package com.company;

public class RedCarDecorator extends CarDecorator {
    public RedCarDecorator(Car decoratedCar) {
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
    public void setColorRed(){
        decoratedCar.color="Red";
    }
}
