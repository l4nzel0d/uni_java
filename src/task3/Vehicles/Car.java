package task3.Vehicles;

public class Car
{
    final static int CURRENT_YEAR = 2024;
    final static int UNKNOWN_INDICATOR = -1;
    // Attributes
    private String model = "unknown model";
    private String license = "unknown license";
    private String color = "unknown color";
    private int year = UNKNOWN_INDICATOR;
    private String ownerName = "unknown owner";
    private int insuranceNumber = UNKNOWN_INDICATOR;
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
        return output;
    }

    public int calculateAge()
    {
        return CURRENT_YEAR - this.year;
    }
}
