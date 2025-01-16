public class ComparisonOperator {
    public static void main(String[] args){
        int x= 10;
        int y= 20;
        boolean z1 = x<y;
        boolean z2 = x>y;
        boolean z3 = (x==y);
        boolean z4 = !(x==y);
        boolean z5 = (x<=y);
        boolean z6 = (x>=y);
        boolean z7 = x!=y;
        System.out.println( x + " is less than " + y + " : " + z1);
        System.out.println( x + " is greater than " + y + " : " + z2);
        System.out.println( x + " is equal to " + y + " : " + z3);
        System.out.println( x + " is not equal to " + y + " : " + z4);
        System.out.println( x + " is less than  or equal to " + y + " : " + z5);
        System.out.println( x + " is greater  than  or equal to " + y + " : " + z6);
        System.out.println( x + " is not equal  " + y + " : " + z7);
    }
}
