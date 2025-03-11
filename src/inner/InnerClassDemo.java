package inner;
class OuterClass{
    int x=10;
    class InnerClass
    {
    int y=20;
    public void innerClassMethod()
    {
        System.out.println(x);
        System.out.println(y);
    }
    }
}
public  class InnerClassDemo {
    public static void main(String[] args) {
        OuterClass o = new OuterClass();
        OuterClass.InnerClass i = o.new InnerClass();
        i.innerClassMethod();
    }
}
