package task4.app;

import task4.vehicles.*;

public class TestCar {
    public static void main(String[] args) {
        Vehicle car = new Car("Prius", "PR1U5", "gray", 2010, "Mia Dance", 12345);
        Vehicle electric_car = new ElectricCar("i8", "BMWI8", "blue", 2020, "Alice Eve", 23456, 50);
        System.out.println(car);
        System.out.println(electric_car);
        System.out.println("---");
        car.setYear(2024);
        electric_car.setColor("violet");
        System.out.println(car);
        System.out.println(electric_car);
    }
}
