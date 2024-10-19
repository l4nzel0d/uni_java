package task4.vehicles;

public class Car extends Vehicle{
    public String vehicleType(){
        return "Car";
    }

    // Full constructor
    public Car(String model, String license, String color, int year, String ownerName, int insuranceNumber)
    {
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
        // Remains empty
    }

    // Custom constructor
    public Car(String model, int year)
    {
        this.model = model;
        this.year = year;
    }


    public String toString()
    {
        String output = "";
        output += "Model: " + model;
        output += "\tLicense: " + license;
        output += "\tColor: " + color;
        output += "\tYear: " + year;
        output += "\tOwner Name: " + ownerName;
        output += "\tInsurance Number: " + insuranceNumber;
        output += "\tVehicle Type: " + vehicleType();
        return output;
    }
}
