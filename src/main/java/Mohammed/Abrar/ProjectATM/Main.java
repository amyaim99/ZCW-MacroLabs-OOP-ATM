package Mohammed.Abrar.ProjectATM;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank theBank = new Bank("Bank of ZipCode");

        User user = theBank.addUser("Debebe" , "Abebe" , "1234");

        Account newAccount = new Account("Checking" , user , theBank);
        user.addAccount(newAccount);
        theBank.addAccount(newAccount);


        User curUser;
        while (true) {

            curUser = Main.mainMenuPrompt(theBank , sc);
            Main.printUserMenu(curUser , sc);


        }
    }

    public static User mainMenuPrompt(Bank theBank , Scanner sc) {
        String userId;
        String pin;
        User authUser;

        do {

            System.out.printf("\nWelcome to %s\n" , theBank.getName());
            System.out.print("Enter user ID: ");
            userId = sc.nextLine();
            System.out.print("Enter pin: ");
            pin = sc.nextLine();
            authUser = theBank.userLogIn(userId , pin);

            if (authUser == null) {
                System.out.println("Incorrect user Id/Pin combination. " + "Please try again");
            }
        } while (authUser == null);

        return authUser;
    }

    public static void printUserMenu(User user , Scanner sc) {

        user.printAccountsSummery();

        int choice;

        do {
            System.out.printf("Welcome %s, what would you like to do?\n" ,

                    user.getFirstName());
            System.out.println(" 1) Show account history");
            System.out.println(" 2) Withdraw");
            System.out.println(" 3) Deposit");
            System.out.println(" 4) Transfer");
            System.out.println(" 5) Quit");
            System.out.println();
            System.out.println("Enter choice: ");
            choice = sc.nextInt();

            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice. Please choose 1-5");
            }
        } while (choice < 1 || choice > 5);

        switch (choice) {
            case 1:
                Main.showTransactionHistory(user , sc);
                break;
            case 2:
                Main.withdrawMoney(user , sc);
                break;
            case 3:
                Main.depositMoney(user , sc);
                break;
            case 4:
                Main.transferMoney(user , sc);
                break;
        }

        if (choice != 5) {
            Main.printUserMenu(user , sc);

        }


    }


    private static void depositMoney(User user , Scanner sc) {
        int toAccount;
        double amount;
        double accntBalance;
        String memo;

        do {
            System.out.printf("Enter the number (1-%d) of the account \n" + "to deposit to: " , user.numAccounts());
            toAccount = sc.nextInt() - 1;

            if (toAccount < 0 || toAccount >= user.numAccounts()) {
                System.out.println("Invalid account. Please try again");

            }

        } while (toAccount < 0 || toAccount >= user.numAccounts());
        accntBalance = user.getAcctBalance(toAccount);

        do {
            System.out.printf("Enter the amount to deposit in (max $%.02f): $" , accntBalance);

            amount = sc.nextDouble();

            if (amount < 0) {
                System.out.println("Amount must be greater than zero");
            }
        } while (amount < 0);

        sc.nextLine();
        System.out.println("Enter a memo: ");
        memo = sc.nextLine();
        user.addAccountTransaction(toAccount , amount , memo);
    }

    private static void withdrawMoney(User user , Scanner sc) {
        int fromAcct;
        double amount;
        double accntBalance;
        String memo;

        do {
            System.out.printf("Enter the number (1-%d) of the account \n" + "to withdraw from: " , user.numAccounts());
            fromAcct = sc.nextInt() - 1;

            if (fromAcct < 0 || fromAcct >= user.numAccounts()) {
                System.out.println("Invalid account. Please try again");

            }

        } while (fromAcct < 0 || fromAcct >= user.numAccounts());
        accntBalance = user.getAcctBalance(fromAcct);

        do {
            System.out.printf("Enter the amount to withdraw (max $%.02f): $" , accntBalance);

            amount = sc.nextDouble();

            if (amount < 0) {
                System.out.println("Amount must be greater than zero");
            } else if (amount > accntBalance)
                System.out.printf("Amount must not be greater than \n" +
                        "balance of $%.02f.\n" , accntBalance);

        } while (amount < 0 || amount > accntBalance);

        sc.nextLine();
        System.out.println("Enter a memo: ");
        memo = sc.nextLine();

        user.addAccountTransaction(fromAcct , -1 * amount , memo);
    }

    private static void transferMoney(User user , Scanner sc) {

        int fromAcct;
        int toAccnt;
        double amount;
        double accntBalance;

        do {
            System.out.printf("Enter the number (1-%d) of the account \n" + "to transfer from: " , user.numAccounts());
            fromAcct = sc.nextInt() - 1;

            if (fromAcct < 0 || fromAcct >= user.numAccounts()) {
                System.out.println("Invalid account. Please try again");

            }

        } while (fromAcct < 0 || fromAcct >= user.numAccounts());
        accntBalance = user.getAcctBalance(fromAcct);

        do {
            System.out.printf("Enter the number (1-%d) of the account \n" + "to transfer to: " , user.numAccounts());
            toAccnt = sc.nextInt() - 1;

            if (toAccnt < 0 || toAccnt >= user.numAccounts()) {
                System.out.println("Invalid account. Please try again");

            }

        } while (toAccnt < 0 || toAccnt >= user.numAccounts());

        do {
            System.out.printf("Enter the amount to transfer (max $%.02f): $" , accntBalance);

            amount = sc.nextDouble();

            if (amount < 0) {
                System.out.println("Amount must be greater than zero");
            } else if (amount > accntBalance)
                System.out.printf("Amount must not be greater than \n" +
                        "balance of $%.02f.\n" , accntBalance);

        } while (amount < 0 || amount > accntBalance);
        user.addAccountTransaction(fromAcct , -1 * amount ,
                String.format("Transfer to account %s" , user.getAcctUUID(toAccnt)));
        user.addAccountTransaction(toAccnt , amount ,
                String.format("Transfer to account %s" , user.getAcctUUID(fromAcct)));
    }

    private static void showTransactionHistory(User user , Scanner sc) {
        int theAccount;

        do {
            System.out.printf("1-%d) of the account\n" + " whose transaction you want to see: " ,
                    user.numAccounts());
            theAccount = sc.nextInt() - 1;

            if (theAccount < 0 || theAccount >= user.numAccounts()) {
                System.out.println("Invalid account. Please try again");
            }
        } while (theAccount < 0 || theAccount >= user.numAccounts());

        user.printAccountTransHistory(theAccount);
    }
//         ConsoleATM.welcomeMessage();
//         //ConsoleATM.checkUserStatus();
//        // ConsoleInput.getInteger();
//         ConsoleATM.assignUserInfoTask();
//         ConsoleATM.transactionMenu();
//         ConsoleATM.doTransaction();


}