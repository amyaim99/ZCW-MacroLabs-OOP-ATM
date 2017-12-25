package Mohammed.Abrar.ProjectATM;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class User  {
    private String firstName;
    private String lastName;
    private String uuid;
    private byte pinHash[];
     private ArrayList<Account> accounts;

    public User (){}
    public User(String firstName, String lastName, String pin, Bank theBank) {
        this.firstName = firstName;
        this.lastName = lastName;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            this.pinHash = md.digest(pin.getBytes());
        } catch (NoSuchAlgorithmException e) {
            System.out.println("No such algorithmException");
            e.printStackTrace();
            System.exit(1);
        }
        this.uuid = theBank.getNewUserUUID();
        this.accounts = new ArrayList<Account>();
        System.out.printf("New user %s, %s with ID %s created. \n", lastName, firstName, this.uuid );
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public String getUUID() {
        return this.uuid;
    }

    public boolean validatePin(String apin) {

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            return  MessageDigest.isEqual(md.digest(apin.getBytes()), this.pinHash);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return  false;
    }

    public void printAccountsSummery() {

        System.out.printf("\n\n%s's account summary\n", this.firstName);

        for(int a=0; a<this.accounts.size(); a++){
        System.out.printf("%d)%s\n",a+1, this.accounts.get(a).getSummaryLine());
        }
        System.out.println();
    }

    public int numAccounts() {
        return this.accounts.size();

    }

    public void printAccountTransHistory(int theAccount) {
        this.accounts.get(theAccount).printTransHistory();
    }

    public double getAcctBalance(int index) {
        return this.accounts.get(index).getBalance();
    }

    public String getAcctUUID(int accntIndex) {
        return this.accounts.get(accntIndex).getUUID();
    }

    public void addAccountTransaction(int accntIndex , double amount , String memo) {
        this.accounts.get(accntIndex).addTransaction(amount, memo);


    }

    public String getFirstName() {
        return this.firstName;
    }


//    public String getuserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public String getPassword() {
//        return passWord;
//    }
//
//    public void setPassword(String passWord) {
//        this.passWord = passWord;
//    }
//
//
//    public int getUserId() {
//        return this.userId;
//    }



//
//    public String toString()
//    {
//    String userInformation = getuserName() +", " + getPassword() + ", " + getUserId();
//
//    return userInformation;
//
//    }
//
//    public int getAccountId() {
//        return accountId;
//    }
//
//    public Double getMoneySaved() {
//        return moneySaved;
//    }
}