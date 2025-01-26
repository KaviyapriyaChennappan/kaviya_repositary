public class Details {
    String name;
    String email;
    String  phone;
    String result;
    public String info(String name)
    {
        result = name;
        return result;
    }
    public String info(String name , String email)
    {

       result = name + email;
        return result ;
    }
    public String info(String name , String email , String  phone) {

        result = name + email+ phone ;
        return result;
    }
}
