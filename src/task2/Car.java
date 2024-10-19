package task2;

public class Car
{
    final static int CURRENT_YEAR = 2024;
    // Attributes
    private String model = "unknown model";
    private String license = "unknown license";
    private String color = "unknown color";
    private int year = -1;

    // Getters
    public String getModel() {return model;}
    public String getLicense() {return license;}
    public String getColor() {return color;}
    public int getYear() {return year;}

    // Setters
    public void setModel(String model) {this.model = model;}
    public void setLicense(String license) {this.license = license;}
    public void setColor(String color) {this.color = color;}
    public void setYear(int year) {this.year = year;}

    // Full constructor
    public Car(String model, String license, String color, int year)
    {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
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
