package task5.vehicles;

public class Car extends Vehicle {
    public String vehicleType(){
        return "Car";
    }

    // Full constructor
    public Car(String model, String license, String color, int year, String ownerName, int insuranceNumber)
    {
        this();
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
        this.ownerName = ownerName;
        this.insuranceNumber = insuranceNumber;
    }

    // Default constructor
    public Car()
    {
        engineType = "Combustion";
    }

    // Custom constructor
    public Car(String model, int year)
    {
        this.model = model;
        this.year = year;
    }

}
