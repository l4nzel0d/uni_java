package task3.app;
import task3.Vehicles.Car;
import task3.Vehicles.ElectricCar;

public class Main {
    public static void main(String[] args){
        Car car1 = new Car();
        Car car2 = new Car("Prius", "PR1U5", "gray", 2010, "Mia Dance", 12345);
        ElectricCar ev1 = new ElectricCar();
        ElectricCar ev2 = new ElectricCar("i8", "BMWI8", "blue", 2020, "Alice Eve", 23456, 50);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(ev1);
        System.out.println(ev2);
    }
}
