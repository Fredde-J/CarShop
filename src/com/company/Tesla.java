package com.company;

public class Tesla extends Car {
    public Tesla(int numberOfDoors, int numberOfSeats, int numberOfWheels, int horsePower, String fuelSource, String engineSound, String model, String color) {
        super(numberOfDoors, numberOfSeats, numberOfWheels, horsePower, fuelSource, engineSound, model, color);
    }

    @Override
    public void startEngine() {
        System.out.println("The Testa starts and make a"+ engineSound +" sound");
    }

    @Override
    public void refuelTheCar() {

    }

    @Override
    public void pedlalToTheMetal() {

    }
}
