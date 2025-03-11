package interfaceinterface;

public class Mobile implements  Calculator , Camera , Telephone{
    @Override
    public void show() {
        System.out.println("show method");
    }

    public static void main(String[] args) {
        Calculator c = new Mobile();
        c.show();
    }
}
