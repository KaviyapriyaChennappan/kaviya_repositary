package jan4.inheritance.car;

public class Vehicle {
    int numberOfWheels = 4;
    String color;
    public void start()
    {
        System.out.println("Vehicle Starts");
    }
    public void brake()
    {
        System.out.println("We can apply brake");
    }
    public void accelerate()
    {
        System.out.println("Vehicle can accelerate");
    }
}
