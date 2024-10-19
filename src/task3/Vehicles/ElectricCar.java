package task3.Vehicles;

public class ElectricCar extends Car{
    private int batteryCapacity = UNKNOWN_INDICATOR;


    public ElectricCar()
    {
        super();
        setEngineType("Electric");
    }

    public ElectricCar(String model, String license, String color, int year, String ownerName, int insuranceNumber, int batteryCapacity)
    {
        super(model, license, color, year, ownerName, insuranceNumber);
        this.batteryCapacity = batteryCapacity;
        setEngineType("Electric");
    }



    public int getBatteryCapacity(){
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity){
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString(){
        return super.toString() + "\tBattery Capacity: " + batteryCapacity + " kWh" + "\tEngine Type: " + engineType;
    }
}
