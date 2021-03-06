package com.company;

public abstract class Car implements CarFunctions {
    public int numberOfWheels;
    public int horsePower;
    public int numberOfDoors;
    public int numberOfSeats;
    public String fuelSource;
    public String engineSound;
    public String model;
    public String color;

    public Car(int numberOfDoors,
               int numberOfSeats,
               int numberOfWheels,
               int horsePower,
               String fuelSource,
               String engineSound,
               String model,
               String color)
    {
        this.numberOfDoors = numberOfDoors;
        this.numberOfSeats = numberOfSeats;
        this.numberOfWheels = numberOfWheels;
        this.horsePower=horsePower;
        this.fuelSource=fuelSource;
        this.engineSound=engineSound;
        this.model=model;
        this.color=color;
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



}
