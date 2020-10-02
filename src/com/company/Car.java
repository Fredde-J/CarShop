package com.company;

public abstract class Car {
    public int numberOfWheels;
    public int horsePower;
    public int numberOfDoors;
    public int numberOfSeats;
    public String fuelSource;

    Car(int numberOfDoors, int numberOfSeats, int numberOfWheels, int horsePower , String fuelSource){
        this.numberOfDoors = numberOfDoors;
        this.numberOfSeats = numberOfSeats;
        this.numberOfWheels = numberOfWheels;
        this.horsePower=horsePower;
        this.fuelSource=fuelSource;
    }
}
