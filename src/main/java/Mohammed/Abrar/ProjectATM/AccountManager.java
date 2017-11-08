package Mohammed.Abrar.ProjectATM;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;


public class AccountManager {
    public static int nextAccountId = 1  ;
    private int accountId;
    private double checkingCurrentAmount;
    private double savingCurrentAmount;
    private double investmentCurrentAmount;
    private double currentAmount;
    private static ArrayList<String> transactionHistory = new ArrayList<>();



    public AccountManager() {
        this.accountId = nextAccountId;
        this.checkingCurrentAmount = checkingCurrentAmount;
        this.savingCurrentAmount = savingCurrentAmount;
        this.investmentCurrentAmount = investmentCurrentAmount;
        this.currentAmount = currentAmount;

    }

    public void logInToAccount(Integer userAccountId) {


        String userResponse;
        if (getAccountId() == userAccountId)

            System.out.println("You are logged in.\n" +
                    "Saving account: + this.getSavingCurrentAmount() +" +
                    " \n Checking account:  + this.getSavingCurrentAmount() + " +
                    "\nInvestment account  = this.getInvestmentCurrentAmount() + " +
                    "\nTotal: " + currentAmount);
    }


    public double accountAmount(int typeId) {
        //System.out.println("Select account type: \n1:Checking\n 2: Savings\n3:Investment");
        // int typeId = scanner.nextInt();
        double currentAmount = 0;
        switch (typeId) {

            case 1:
                currentAmount = checkingCurrentAmount;
                break;

            case 2:
                currentAmount = savingCurrentAmount;
                ;

                break;
            case 3:
                currentAmount = investmentCurrentAmount;


                break;
            default:
                currentAmount = 0;

                break;


        }
        return currentAmount;
    }


    public void setCurrentAmount(double currentAmount) {
        this.currentAmount = currentAmount;
    }

    public double withdrawal(double transactionAmount) {
        String transaction;
        if (this.currentAmount < transactionAmount) {
            String response = "You dont have enough amount!";
            System.out.println(response);
            currentAmount = this.currentAmount;

        } else {
            currentAmount -= transactionAmount;
            transaction = "Withdraw: " + transactionAmount + "\n current amount: " + currentAmount;
            System.out.println(transaction);
            transactionHistory.add(transaction);

        }
        return currentAmount;

    }


    public double deposit(double transactionAmount) {
        String transaction;
        currentAmount += transactionAmount;
        transaction = "Deposit: " + transactionAmount + "\n current amount: " + currentAmount;
        System.out.println(transaction);
        transactionHistory.add(transaction);
        return currentAmount;

    }

    public double trasfer(double transactionAmount) {
        String transaction;
        if (this.currentAmount < transactionAmount) {
            String response = "You dont have enough amount!";
            System.out.println(response);
            currentAmount = this.currentAmount;
        } else {
            this.currentAmount -= transactionAmount;
            transaction = " Transferd: " + transactionAmount + "\n current amount: " + currentAmount;
            System.out.println(transaction);


        }
        return currentAmount;

    }

    public double transferTo(double transactionAmount, int typeId) {
        String transaction;
        currentAmount = this.accountAmount(typeId);
        currentAmount += transactionAmount;
        transaction = " " + transactionAmount + "\n current amount: " + currentAmount;
        System.out.println(transaction);

        return currentAmount;
    }


    public static int getAccountId() {
        return nextAccountId;
    }
    public int getaccountId() {
        return this.accountId;
    }

    public void setAccountId() {
        nextAccountId= accountId;
        nextAccountId++;
    }

    public double getCheckingCurrentAmount() {
        return checkingCurrentAmount;
    }


    public double getSavingCurrentAmount() {
        return savingCurrentAmount;
    }


    public double getInvestmentCurrentAmount() {
        return investmentCurrentAmount;
    }


    public static int getNextAccountId() {
        return nextAccountId;
    }


    public static ArrayList<String> getTransactionHistory() {
        return transactionHistory;
    }



    private void setCurrentAmount() {
        double currentAmount = this.getCheckingCurrentAmount() + this.getSavingCurrentAmount() + getInvestmentCurrentAmount();

    }
@Override
    public String toString()
    {
        String accountInformation= getaccountId() +"\n Current amount " + getTransactionHistory();

        return accountInformation;

    }


}

