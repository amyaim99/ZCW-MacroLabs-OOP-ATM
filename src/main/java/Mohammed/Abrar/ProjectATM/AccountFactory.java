//package Mohammed.Abrar.ProjectATM;
//
//import java.util.ArrayList;
//import java.util.Random;
//
//
//public class AccountFactory {
//
//    Random random = new Random();
//    private int id;
//
//    private static final AccountFactory INSTANCE = new AccountFactory();
//    private static ArrayList<Account> accountList = new ArrayList<>();
//
//
//     AccountFactory() {
//
//        for (int i = 1; i < 10; i++) {
//            id = random.nextInt(90000000) + 10000000;
//            Account account = new Account(id);
//
//            accountList.add(account);
//
//        }
//    }
//
////        public static boolean accountCheck (int accountId){
////
////        ArrayList<Account> accounts = getINSTANCE().getUserList();
////        boolean checkResult = false;
////
////        for (int i = 0; i<accounts.size(); i++)
////
////          checkResult =  accounts.get(i).getAccountNumber() == accountId;
////
////        return  checkResult;
////
////        }
//
//
////    public static  String createAccountOption(int accountId) {
////        String userStatus;
////        AccountManager accountManager = new AccountManager();
////        userStatus = accountCheck(accountId)? accountManager.transactionMenu():"Account doesnt exist, create one? ";
////
////        return userStatus;
////
////    }
////
////    public static void createNewAccount(String createAccount) {
////
////        Random random = new Random();
////
////        int newAccount = 10000000 + random.nextInt(90000000);
////
////
////
////        accountList.add(new Account(newAccount));
////
////    }
////
////
////    public static void deleteAccount(AccountManager accountManager) {
////
////        accountList.remove(accountManager);
////    }
////
////
//    public ArrayList<Account> getUserList() {
//        return INSTANCE.accountList;
//    }
//
//    public static AccountFactory getINSTANCE() {
//        return INSTANCE;
//    }
//
//
//
//
//
//
//}
//
//
