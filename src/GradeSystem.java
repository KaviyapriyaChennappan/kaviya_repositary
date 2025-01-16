public class GradeSystem {
    public static void main (String [] args)
    {
        int kaviya = 100;
        if ( kaviya >=90  && kaviya <=100)
        {
            System.out.println( "kaviya got A+");
        }
        else if ( kaviya >=80 && kaviya <=89 )
        {
            System.out.println( "kaviya got A");
        }
        else if ( kaviya >=70 && kaviya <=79 )
        {
            System.out.println( "kaviya got B+");
        }
        else if ( kaviya >=60 && kaviya <=69 )
        {
            System.out.println( "kaviya got B");
        }
        else if ( kaviya >=50 && kaviya <=59 )
        {
            System.out.println( "kaviya got C+");
        }
        else if ( kaviya >=40 && kaviya <=49 )
        {
            System.out.println( "kaviya got C");
        }
        else if ( kaviya <40 )
        {
            System.out.println( "Fail");
        }
        else
        {
            System.out.println ( "Enter a valid mark");
        }
    }
}
