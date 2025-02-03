package encapsulation;

public class LoginApp {
    private String username;
    private String password;

    public LoginApp(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginApp{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void  loginUser (String username, String password)
    {
        if (this.username.equals(username) && this.password.equals(password))
        {
            System.out.println("User is authenticated");
        } else {
            System.out.println("Invalid credentials");
        }
    }
}
