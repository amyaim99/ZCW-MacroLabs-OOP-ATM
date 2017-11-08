package Mohammed.Abrar.ProjectATM;
import org.junit.Assert;
import org.junit.Test;

public class User extends Person {
    private static int nextUserId;
    private String userName;
    private String passWord;
    private int userId;
    private int accountId;
    private Double moneySaved;

    public User() {

    }

    public User(String userName, String passWord) {
        this();
        this.userName = userName;
        this.passWord = passWord;
        userId = 1;
    }

    public String getuserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return passWord;
    }

    public void setPassword(String passWord) {
        this.passWord = passWord;
    }


    public int getId() {
        return this.userId;
    }

    public void setId() {
        this.userId = this.nextUserId;
        this.nextUserId++;
    }
    public void setAccount(int accountId ){
        AccountManager accountManager = new AccountManager();
        AccountFactory.createAccount(accountId);

    }

    public static int getNextUserId() {
        return nextUserId;
    }

    public String toString()
    {
    String userInformation = getuserName() +", " + getPassword() + ", " + getId();

    return userInformation;

    }


}