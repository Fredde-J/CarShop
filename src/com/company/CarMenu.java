package com.company;

public class CarMenu {
public void mainMenu(){
    CarFactory carFactory = new CarFactory();
    var car1 =  carFactory.buildCar("Volkswagen");
    car1.startEngine();
}
}
