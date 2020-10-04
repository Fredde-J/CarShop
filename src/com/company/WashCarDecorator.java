package com.company;

public class WashCarDecorator extends CarDecorator {
    private Car car;
    public WashCarDecorator(Car car) {
        this.car = car;
    }

    public void washCar (){
        System.out.println("the "+ car.model +" is now shinny");
    }
}
