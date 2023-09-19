package practise4.Task3;

public class User {
    private final String login;
    private final String password;

    public User (String login, String password){
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}