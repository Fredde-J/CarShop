package com.company;

public class RedCarDecorator extends CarDecorator {
    public RedCarDecorator(Car decoratedCar) {
        super(decoratedCar);
    }
    public Car setColorRed(Car decoratedCar){
      decoratedCar.color="Red";
      return decoratedCar;
    }
}
