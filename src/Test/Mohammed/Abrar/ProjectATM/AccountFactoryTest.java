package Mohammed.Abrar.ProjectATM;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AccountFactoryTest {
    AccountFactory accountFactory = new AccountFactory();
    AccountManager accountManager = new AccountManager();
    AccountManager accountManager2 = new AccountManager();


    @Test
    void createAccountTest() {

        String expected ="Account Exist. Your account id is 1";



        String actual =  accountFactory.createAccount(accountManager.getAccountId());
        Assert.assertEquals(expected, actual);
    }

    @Test
    void createAccountTest2() {

        String expected ="Creating new account. Your acocunt id is 1";



        String actual =  accountFactory.createAccount(2);
        Assert.assertEquals(expected, actual);

    }

    @Test
    void deleteAccount() {
        ArrayList<AccountManager> accountList= new ArrayList<>();
        accountList.add(accountManager);
       AccountManager accountManager2 = new AccountManager();
        accountList.add(accountManager2);
        System.out.println(accountList.size());
     // int expected =  accountList.size() -1;

      AccountFactory.deleteAccount(accountManager2);
        System.out.println(accountList.indexOf(accountManager2));
      // int actual = accountList.size();

      // Assert.assertEquals(expected,actual);


    }

    UserFactory userFactory = new UserFactory();

   }