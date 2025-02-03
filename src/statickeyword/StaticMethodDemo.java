package statickeyword;

public class StaticMethodDemo {
    public static void show()
    {
        System.out.println("Insode static  method");
    }
    public void display()
    {
        System.out.println("Inside non static  ");
    }

    //precedence of all
    static {
        System.out.println("Inside Block");
    }
    //instance block , belongs to the object of the class
    {
        System.out.println("Inside Instance");
    }
}
