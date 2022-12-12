package Eats.Unlimited;

public class Account {

    private String username;
    private String password;

    //Todo defensive checks on password and emails and throw exeptions if not correct
    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // TODO: 12/11/22 create random password generator
    public String passGen(){
        return "";
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
}
