package polymorphism;

public class CarMain {
    public static void main(String[] args) {
        Car g = new Gasoline();
        Car d = new Diesel();
        Car e = new Electric();
        g.printDetails();
        d.printDetails();
        e.printDetails();
    }
}
