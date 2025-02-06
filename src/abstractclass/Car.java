package abstractclass;

public  class Car extends Vehicle{

    @Override
    public void brake() {
        System.out.println("car brake");
    }

    @Override
    public void start() {
        System.out.println("car start");
    }

    @Override
    public void accelerate() {
        System.out.println("car accelerate");

    }
}
