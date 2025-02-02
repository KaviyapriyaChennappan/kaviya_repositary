package jan4.inheritance.car;

public class MotorBike extends Vehicle{
    int numberOfKicks;

    @Override
    public void start() {
        System.out.println("Bike Starts");
    }

    @Override
    public void brake() {
        System.out.println("Bike brake");
    }

    @Override
    public void accelerate() {
        System.out.println("Bike accelerate");
    }
    public boolean canDoWheele()
    {
        return true;
    }
}
