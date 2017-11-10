package Mohammed.Abrar.ProjectATM;


public class User extends Person {
    private String userName;
    private String passWord;
    private int userId;
    private int accountId;
    private Double moneySaved;

    public User(int userId) {
        super();
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


    public int getUserId() {
        return this.userId;
    }




    public String toString()
    {
    String userInformation = getuserName() +", " + getPassword() + ", " + getUserId();

    return userInformation;

    }

    public int getAccountId() {
        return accountId;
    }

    public Double getMoneySaved() {
        return moneySaved;
    }
}