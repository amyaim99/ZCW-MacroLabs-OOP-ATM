//
//package Mohammed.Abrar.ProjectATM;
//
//import java.util.Scanner;
//
//public class ConsoleATM {
//
//
//
//    public ConsoleATM(){}
//
//    public static void welcomeMessage() {
//        System.out.println("***********************************************\n \n" +
//                "      ****  Welcome of ABC Bank ***\n\n" +
//                "**********************************************\n");
//    }
//
//    public static int checkUserStatus(){
//
//        System.out.println("Please select\n1. New User \n2. Existing User");
//        int input = ConsoleInput.getInteger();
//        return input;
//
//
//    }
//
//    public static int getUserId(){
//
//        System.out.println("Please insert your user id: ");
//        int input = ConsoleInput.getInteger();
//        return input;
//
//
//    }
//
//    public static int checkUserAccountStatus(){
//
//        System.out.println("Please select\n1. New Account: \n2. Existing Account");
//        int input = ConsoleInput.getInteger();
//        return input;
//    }
//
//    public static void assignUserInfoTask() {
//
//        int input = checkUserStatus();
//
//        int i = 0;
//        try {
//            do {
//
//                if (input == 1) {
//                    UserFactory.createUser();
//                    AccountFactory.createAccount();
//
//                    //  transactionMenu();
//
//                    i = 1;
//                } else if (input == 2) {
//                    assignUserAccountInfoTask();
//                    i = 1;
//                } else {
//                    System.out.println("Please select 1 or 2");
//                    i = 1;
//                }
//            } while (i == 0);
//        } catch (Exception e) {
//            System.out.println("Wrong number");
//
//        }
//    }
//    public static int getUserAccountId(){
//        System.out.println("Please inser your account id");
//        int input =  ConsoleInput.getInteger();
//        return  input;
//    }
//
//
//
//
//
//    public static void assignUserAccountInfoTask(){
//        int input = checkUserAccountStatus();
//
//        int i = 0;
//        try{
//            do{
//                checkUserAccountStatus();
//
//                if (input == 1){
//                    AccountFactory accountFactory= AccountFactory.getINSTANCE();
//
//                    i=1;
//                }
//
//                else if(input ==2){
//                    checkUserAccountStatus();
//                    i=1;
//                }
//
//            }while (i==0);
//        } catch(Exception e){
//            System.out.println("Please select 1 or 2");
//        }
//
//
//
//    }
//
//    public static void transactionMenu() {
//        int accountId = getUserAccountId();
//        TransactionManager transactionManager = new TransactionManager(accountId);
//        String menuContent;
//        System.out.println("You are logged in with " + accountId + "id \n" +
//                "Saving account: " + transactionManager.getSavingCurrentAmount() +
//                " \nChecking account: " + transactionManager.getCheckingCurrentAmount() +
//                "\nInvestment account: " + transactionManager.getInvestmentCurrentAmount() +
//                "\nyou transaction history: " + transactionManager.getTransactionHistory());
//
//
//    }
//
//    public static int  userTransactionRequest(){
//
//        System.out.println("Input your transaction inquiry:\n1. Deposit" +
//                "\n2.Withdraw\n3.Transfer" );
//        int useInput = ConsoleInput.getInteger();
//        return useInput;
//    }
//
//    public static void doTransaction() {
//        int userInput = userTransactionRequest();
//        int accountId = getUserAccountId();
//        TransactionManager transactionManager = new TransactionManager(accountId);
//        System.out.println("Insert amount");
//        double amount = ConsoleInput.getDouble();
//        int transferToId = 0;
//        int i = 0;
//        do {
//            switch (userInput) {
//                case 1:
//
//                    transactionManager.deposit(amount);
//                    i = 1;
//
//                    break;
//
//                case 2:
//                    transactionManager.withdrawal(amount);
//                    i = 1;
//                    break;
//
//                case 3:
//                    transactionManager.trasfer(amount);
//                    transactionManager.transferTo(amount, transferToId);
//                    i = 1;
//                    break;
//
//                default:
//                    System.out.println("Thank you for doing business with us. Do you have other ransaction?");
//                    i = 1;
//            }
//        }while (i == 0);
//
//
//    }
//
//
//}
//
