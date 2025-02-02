package polymorphism;

public class AreaDemoMain {
    public static void main(String[] args) {
     //   Shape shape = new Shape();
       // System.out.println("Area" + shape.getArea());

        Circle c = new Circle(2);
        System.out.println("Area of circle:"+ c.getArea());

        Shape s = new Square(10);
        System.out.println("Area of Square :" + s.getArea());
    }
}
