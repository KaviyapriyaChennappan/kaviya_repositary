public class MethodOverloading {

    public static  void main(String[] args) {
        String output;
        Details details = new Details();
        output = details.info ("kaviya");
        System.out.println(output);
        output = details.info("kaviya" , "k@k.cpm");
        System.out.println(output);
        output = details.info("kaviya" , "k@k.cpm" , "1234567890");
        System.out.println(output);
    }
}
