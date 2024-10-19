package task2;


public class Main
{
    public static void main(String[] args)
    {
        Car car1 = new Car();
        Car car2 = new Car("M5", 2018);
        Car car3 = new Car("Prius", "PR1U5", "gray", 2010);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println("Age of " + car3.getLicense() + " " + car3.getModel() + " is " + car3.calculateAge() + " years old");
    }

}
