package inner;

class Laptop
{
    static class HardDrive{
        int capacity= 100;
        public void store()
        {
            System.out.println(capacity);
        }
    }
}
public class StaticinnerDemo {
    public static void main(String[] args) {
       Laptop.HardDrive l = new Laptop.HardDrive();
        l.store();
    }
}
