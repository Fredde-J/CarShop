package com.company;

public class CarFactory {
    public static Car buildCar(String Brand){
        Car car = null;
        switch (Brand){
            case "Volkswagen":
                car = new Volkswagen(2,5,4,25,"Gasoline","BROOM POP PANG BROM","Beetle","Black");
                break;
            case "Tesla":
                car = new Tesla(4, 5, 4, 503,"Electricety",".......","Model S","Black");

        }
     return car;
    }
    public static Car changeColor(String color, Car car){
    switch (color){
        case "Red":
         car = new RedCarDecorator(car).setColorRed(car);
    }
    return car;
    }
}
