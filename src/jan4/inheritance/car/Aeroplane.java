package jan4.inheritance.car;

public class Aeroplane extends Vehicle {

    @Override
    public void start() {
        System.out.println("Plane starts");
    }

    @Override
    public void brake() {
        System.out.println("plane brake");
    }

    @Override
    public void accelerate() {
        System.out.println("plane accelerate");
    }

    public boolean canFlyInAir()
    {
        return true;
    }
}
