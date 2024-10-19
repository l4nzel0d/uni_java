package task5.vehicles;

public abstract class Vehicle {
    final static int UNKNOWN_INDICATOR = -1;
    // Attributes
    protected String model = "unknown model";
    protected String license = "unknown license";
    protected String color = "unknown color";
    protected int year = UNKNOWN_INDICATOR;
    protected String ownerName = "unknown owner";
    protected int insuranceNumber = UNKNOWN_INDICATOR;
    protected String engineType = "unknown engine type";

    // Getters
    public String getModel() {return model;}
    public String getLicense() {return license;}
    public String getColor() {return color;}
    public int getYear() {return year;}
    public String getOwnerName() {return ownerName;}
    public int getInsuranceNumber() {return insuranceNumber;}
    public String getEngineType() {return engineType;}

    // Setters
    public void setModel(String model) {this.model = model;}
    public void setLicense(String license) {this.license = license;}
    public void setColor(String color) {this.color = color;}
    public void setYear(int year) {this.year = year;}
    public void setOwnerName(String ownerName) {this.ownerName = ownerName;}
    public void setInsuranceNumber(int insuranceNumber) {this.insuranceNumber = insuranceNumber;}
    public void setEngineType(String engineType) {this.engineType = engineType;}

    // Abstract method
    public abstract String vehicleType();

    public String toString()
    {
        String output = "";
        output += "Model: " + model;
        output += "\tLicense: " + license;
        output += "\tColor: " + color;
        output += "\tYear: " + year;
        output += "\tOwner Name: " + ownerName;
        output += "\tInsurance Number: " + insuranceNumber;
        output += "\tEngine Type: " + engineType;
        output += "\tVehicle Type: " + vehicleType();
        return output;
    }
}
