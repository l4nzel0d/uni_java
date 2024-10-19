package task5.app;

import task5.vehicles.*;

public class TestCar {
    public static void main(String[] args) {
//        Car car = new Car("Prius", "PR1U5", "gray", 2010, "Mia Dolan", 12345);
        Car car = new Car();
//        ElectricCar electricCar = new ElectricCar("i8", "BMWI8", "blue", 2020, "Alice Eve", 11111, 50);
        ElectricCar electricCar = new ElectricCar();

        System.out.println("---");

        car.setYear(2023);
        car.setOwnerName("Sebastian Wilder");
        car.setInsuranceNumber(54321);

        electricCar.setYear(2024);
        electricCar.setOwnerName("Craig Ferguson");
        electricCar.setInsuranceNumber(22222);

        System.out.println(car);
        System.out.println(electricCar);

        electricCar.setBatteryCapacity(50);
        System.out.println("Battery capacity is: " + electricCar.getBatteryCapacity() + " kWh");
    }
}
