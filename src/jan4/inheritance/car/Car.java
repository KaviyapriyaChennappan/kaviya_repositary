package jan4.inheritance.car;

public class Car extends Vehicle {

int numberOfDoors;

    @Override
    public void start() {
        System.out.println("car starts");
    }

    @Override
    public void brake() {
        System.out.println("car brake");
    }

    @Override
    public void accelerate() {
        System.out.println("Car accelerate");
    }
    public boolean hasAc()
    {
        return true;
    }

    public void wheele()
    {
        System.out.println(numberOfWheels);
    }
}
