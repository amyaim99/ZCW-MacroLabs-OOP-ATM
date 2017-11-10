package Mohammed.Abrar.ProjectATM;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Logger;


public class AccountFactory {
    public static final Logger logger = Logger.getGlobal();
    Random random = new Random();
    private int accountId;

    private static final AccountFactory ACCOUNTINSTANCE = new AccountFactory();
    private static ArrayList<Account> accountList;


    private AccountFactory() {

    }

    public static void createAccount() {

        Random random = new Random();
        int accountId = 100000 + random.nextInt(900000);
        logger.info("Trying to create an account with " + accountId);
        accountList = new ArrayList<>();
        accountList.add(new Account(accountId));
        System.out.println("Your account id is " + accountId);
    }


    public static boolean checkAccountExist(Account account) {
        return ACCOUNTINSTANCE.accountList.contains(account);
    }

    public static void removeAccount(Account account) {

        accountList.remove(account);

    }


    @Override
    public String toString() {
        StringBuilder listAsString = new StringBuilder();
        // String result = "+";
        for (int i = 0; i < accountList.size(); i++) {
            listAsString.append(accountList.get(i));

        }
        return listAsString.toString();
    }

    public static AccountFactory getINSTANCE() {
        return ACCOUNTINSTANCE;
    }

    public ArrayList<Account> getAccountList() {
        return accountList;
    }


}


