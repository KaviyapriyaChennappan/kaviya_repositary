public class constructorMain
{
    public static void main(String[] args)
    {
        Constructor   c = new Constructor();
        c.displayDetails();
        c.displayDetails("one");
        c.displayDetails("two","two");
        c.displayDetails("three" ,"three",456.76);
        c.displayDetails("four","four",453.78,"four");
    }
}
