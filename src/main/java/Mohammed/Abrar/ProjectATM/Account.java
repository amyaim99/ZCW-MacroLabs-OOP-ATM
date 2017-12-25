package Mohammed.Abrar.ProjectATM;

import java.util.ArrayList;

public class Account {

    private String name;
//    private double balance;
    private String uuid;
    private User holder;
    private ArrayList<TransactionManager> transactions;

    public Account(){}

    public Account (String name, User holder, Bank theBank){

        this.name = name;
        this.holder = holder;
        this.uuid = theBank.getNewAccountUUID();
        this.transactions = new ArrayList<TransactionManager>();

    }
    public Account (String name, User holder, String uuid){

        this.name = name;
        this.holder = holder;
        this.uuid = uuid;
        this.transactions = new ArrayList<TransactionManager>();

    }

    public String getUUID() {
        return this.uuid;
    }

    public String getSummaryLine() {
        double balance = this.getBalance();

        if(balance >= 0){
            return String.format("%s : $%.02f: %s", this.uuid,balance, this.name);
        } else
            return String.format("%s : $(%.02f): %s", this.uuid,balance, this.name);

    }

   public double getBalance() {
        double balance =0;

       for (TransactionManager t: this.transactions){
           balance += t.getAmount();
       }
       return balance;
    }

    public void printTransHistory() {
        System.out.printf("\nTransaction history for account %s\n", this.uuid);
        for (int t = this.transactions.size()-1; t>=0; t--){
            System.out.println(this.transactions.get(t).getSummaryLine());
        }
        System.out.println();
    }

    public void addTransaction(double amount , String memo) {

        TransactionManager newTransaction = new TransactionManager(amount, memo, this);
        this.transactions.add(newTransaction);
    }


//    private int accountNumber;


//    public Account(int accountNumber) {
//        this.accountNumber = accountNumber;
//    }
//
//    public int getAccountNumber() {
//        return accountNumber;
//    }

}
