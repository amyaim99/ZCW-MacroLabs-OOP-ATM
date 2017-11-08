package Mohammed.Abrar.ProjectATM;


public class User extends Person {
    private static int nextUserId;
    private String userName;
    private String passWord;
    private int userId;
    private int accountId;
    private Double moneySaved;


    public User() {


    }

    public User(int userId) {
        this();
        this.userId = userId;
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




    public static int getNextUserId() {
        return nextUserId;
    }

    public String toString()
    {
    String userInformation = getuserName() +", " + getPassword() + ", " + getId();

    return userInformation;

    }


}