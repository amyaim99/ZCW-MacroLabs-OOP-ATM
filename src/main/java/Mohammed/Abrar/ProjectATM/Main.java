package Mohammed.Abrar.ProjectATM;

import java.io.Console;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("***********************************************\n \n" +
                "      ****  Welcome of ABC Bank ***\n\n" +
                "**********************************************");


        Scanner scanner = new Scanner(System.in);
        System.out.println("User Name:   ");
        String userName = scanner.nextLine();
        System.out.println("Password:   ");
        String password = scanner.nextLine();
        UserFactory.createUser(userName, password);
        int id = scanner.nextInt();
        AccountFactory.createAccount(id);
        AccountManager accountManager = new AccountManager();
        accountManager.logInToAccount(id);
    }
}
////        //System.out.println(UserFactory.getUserList().size());
////        //System.out.println(UserFactory.getUserList().get(1).getId());
////        //System.out.println("Result: "  + result);
////        //System.out.println("ArrayList size: " + UserFactory.getUserList().size());
//////        AccountManager accountManager = new AccountManager();
//////        accountManager.accountType();
//////        accountManager.transactionOrderId();
////
////
////        /** System.out.println("Are you New Mohammed.Abrar.ProjectATM.User (Yes No): ");
////         String userStat = scanner.nextLine();
////         if ("yes".equalsIgnoreCase(userStat)) {
////
////         UserCheck userCheck = new UserCheck();
////         userCheck.isUser(userName, sPassword);
////         System.out.println("Select account type: 1 for Checking, 2 for Savings and 3 for Investment");
////         int accountId = scanner.nextInt();
////         AccountType accountType = new AccountType(accountId);
////
////         System.out.println("Select action to perform: 1 for Withdrawal, 2 for Deposit, 3 for Transfer across account," +
////         "4 for open new account, 5 for Close account, 6 for print transaction history, 7 for Check balance" +
////         "8 for transfer to another user account");
////
////         AssignJob assignJob = new AssignJob();
////
////         } else {
////         CreateAccount createAccount = new CreateAccount();
////         createAccount.create();
////         }*/
////    }
////}