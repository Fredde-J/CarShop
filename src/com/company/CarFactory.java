package com.company;

public class CarFactory {
    public static Car buildCar(String Brand){
        Car car = null;
        switch (Brand){
            case "Volkswagen":
                car = new Volkswagen(2,5,4,25,"gasolin","BROOM POP PANG BROM","beetle");

        }
     return car;
    }
}
