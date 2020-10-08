package com.company;

import java.util.Scanner;

public class CarMenu {

    Scanner scanner = new Scanner(System.in);

    public void mainMenu() {
        System.out.println("Welcome to the Car Shop!");
        System.out.println("Please Select a alternative below");
        System.out.println("----------------------------------");
        System.out.println("1:Create a Volkswagen Beetle");
        System.out.println("2:Create a Tesla Model S");
        System.out.println("3.Create a Bmw 530e");
        String menuChoice = scanner.next();
        String brand = "";

        switch (menuChoice) {
            case "1":
                brand = "Volkswagen";
                break;
            case "2":
                brand = "Tesla";
                break;
            case"3":
                brand = "Bmw";

            default:
                System.out.println("Wrong input! please try again.");
                break;
        }
        Car car = CarFactory.buildCar(brand);
        System.out.println("You have created a " + car.color + " " + brand + " " + car.model);
        System.out.println("You can do following things with your car");
        System.out.println("------------------------------------------");
        System.out.println("1: Start your " + brand + " " + car.model);
        System.out.println("2: Change the color");
        menuChoice = scanner.next();
        switch (menuChoice) {
            case "1":
                car.startEngine();
                break;
            default:
                System.out.println("Wrong input! please try again.");
                break;
            case "2":
                System.out.println("choose a color you want to paint your car with");
                System.out.println("1.Red  2.Green  3.Blue");
                String colorChoice = scanner.next();
                switch (colorChoice) {
                    case "1":
                        CarFactory.changeColor("Red", car);
                        System.out.println("your car is now " + car.color);
                }

        }
    }

    /* var car1 =  carFactory.buildCar("Volkswagen");
    car1.startEngine();
    System.out.println(car1.color);
    car1= carFactory.changeColor("Red",car1);
    System.out.println(car1.color);
    car1.startEngine();
*/


}

