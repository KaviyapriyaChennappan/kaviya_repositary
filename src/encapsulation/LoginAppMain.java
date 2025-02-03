package encapsulation;

public class LoginAppMain {
    public static void main(String[] args) {

          LoginApp l = new LoginApp("kaviya", "qwerty");
          l.loginUser("kaviya","qwerty");
       //   l.password="dfg";
      //    l.loginUser("kaviya","dfg");
        l.setPassword("fee");
    }
}
