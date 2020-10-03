package com.company;

public class Volkswagen extends Car {

    Volkswagen(int numberOfDoors,
               int numberOfSeats,
               int numberOfWheels,
               int horsePower,
               String fuelSource,
               String engineSound,
               String model)
    {
        super(numberOfDoors, numberOfSeats, numberOfWheels, horsePower, fuelSource, engineSound, model);
    }

    @Override
    public void startEngine() {
        System.out.println("engine starts "+ engineSound);
    }
}
