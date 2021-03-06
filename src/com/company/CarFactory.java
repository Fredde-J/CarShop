package com.company;

public class CarFactory {
    public static Car buildCar(String Brand) {
        Car car = null;
        switch (Brand) {
            case "Volkswagen":
                car = new Volkswagen(2, 5, 4, 25, "Gasoline", "BROOM POP PANG BOOM sound", "Beetle", "Black");
                break;
            case "Tesla":
                car = new Tesla(4, 5, 4, 503, "Electricity", "silent sound", "Model S", "Black");
                break;
            case "Bmw":
                car = new Bmw(4, 5, 4, 333, "Electricity and Gasoline", "silent sound then BROOM", "530e", "Black");
                break;
            default:
                System.out.println("The factory can create that car");
                break;

        }
        return car;
    }

    public static void changeColor(String color, Car car) {
        switch (color) {
            case "Red":
                 new RedCarDecorator(car).setColorRed();
                break;
            case "Green":
                new GreenCarDecorator(car).setColorGreen();
                break;
            case "Blue":
                new BlueCarDecorator(car).setColorBlue();
                break;
        }

    }
}
