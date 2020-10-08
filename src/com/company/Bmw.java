package com.company;

public class Bmw extends Car {
    public Bmw(int numberOfDoors, int numberOfSeats, int numberOfWheels, int horsePower, String fuelSource, String engineSound, String model, String color) {
        super(numberOfDoors, numberOfSeats, numberOfWheels, horsePower, fuelSource, engineSound, model, color);
    }

    @Override
    public void startEngine() {
        System.out.println("The "+model+" starts and make a "+ engineSound );
    }

    @Override
    public void refuelTheCar() {

    }

    @Override
    public void pedlalToTheMetal() {

    }
}
