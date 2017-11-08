package Mohammed.Abrar.ProjectATM;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class AccountFactory {

    private static ArrayList<AccountManager> accountManagersList = new ArrayList<>();

    public AccountFactory() {
    }


    public static  String createAccount(int accountId) {
        String userStatus;
        AccountManager accountManager = new AccountManager();
        if (accountManager.getAccountId() == accountId) {
           userStatus = "Account Exist. Your account id is " + accountManager.getaccountId();

        } else {
          userStatus= "Creating new account. Your acocunt id is " +
                    accountManager.getaccountId();


        }

        return userStatus;

    }

    public static void deleteAccount(AccountManager accountManager) {

        accountManagersList.remove(accountManager);
    }


    public static ArrayList<AccountManager> getUserList() {
        return accountManagersList;
    }



}


