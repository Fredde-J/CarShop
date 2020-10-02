package com.company;

public abstract class Car {
    public int numberOfWheels;
    public int horsePower;
    public int numberOfDoors;
    public int numberOfSeats;
    public String fuelSource;
    public String engineSound;

    Car(int numberOfDoors, int numberOfSeats, int numberOfWheels, int horsePower , String fuelSource, String engineSound){
        this.numberOfDoors = numberOfDoors;
        this.numberOfSeats = numberOfSeats;
        this.numberOfWheels = numberOfWheels;
        this.horsePower=horsePower;
        this.fuelSource=fuelSource;
        this.engineSound=engineSound;
    }
    public void startEngine(){
        System.out.println("The car makes a "+engineSound+"when it starts and is ready to release "+horsePower+" hp");
    }
}
