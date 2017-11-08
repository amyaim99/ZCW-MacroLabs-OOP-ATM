package Mohammed.Abrar.ProjectATM;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class AccountManagerTest {
    AccountManager accountManager = new AccountManager();

    @Test
    void getTransactionHistory() {
        //:Given
        accountManager.deposit(50);
        String expected = "[Deposit: 50.0\n current amount: 50.0]";

        //: when
        String actual = accountManager.getTransactionHistory().toString();

        //:then

        Assert.assertEquals("The two transactionHistory are equesl", expected, actual);
    }

    @Test
    void getNextAccountId() {
         AccountManager.nextAccountId = 1;
        int expected = 1;
        //:when


        int actual = accountManager.getNextAccountId();

        //:then
        Assert.assertEquals("The two  int for getNextId method are equal", expected, actual);
    }

    @Test
    void setAccountId() {
        //:Given
       int expected = accountManager.getaccountId()+1;



        //: when
        accountManager.setAccountId();
        int actual = AccountManager.getNextAccountId();

        //then

        Assert.assertEquals("The numbers are equal", expected, actual);
    }


    @Test
    void trasfer() {
        //:Given
        AccountManager accountManager = new AccountManager();
        double expected = 60;

        //: when
        accountManager.setCurrentAmount(110);
        double actual = accountManager.trasfer(50);

        //then

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    void trasferTo() {
        //:Given
        AccountManager accountManager = new AccountManager();
        double expected = 250;

        //: when

        double actual = accountManager.getCheckingCurrentAmount()+ accountManager.transferTo(250, 1);

        //then

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    void deposit() {
        //:Given
        AccountManager accountManager = new AccountManager();
        double expected = 90;

        //: when
        accountManager.setCurrentAmount(40);
        double actual = accountManager.deposit(50);

        //then

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    void withdrawal() {

        //:Given
        AccountManager accountManager = new AccountManager();
        double expected = 40;

        //: when
        accountManager.setCurrentAmount(40);
        double actual = accountManager.withdrawal(50);

        //then

        Assert.assertEquals(expected, actual, 0);
    }


    @Test
    void accountAmount() {
        //:Given
        AccountManager accountManager = new AccountManager();
        double expected = accountManager.getCheckingCurrentAmount();

        //: when
        double actual =  accountManager.accountAmount(1);

        //then

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    void getAccountId() {
        //:Given
        AccountManager accountManager = new AccountManager();
        int expected = 1;

        //: when
        int actual = accountManager.getAccountId();

        //then

        Assert.assertEquals("The numbers are equal", expected, actual);
    }





    @Test
    void setTransactionHistory() {
    }

    @Test
    void getCheckingCurrentAmount() {
        //:Given
        AccountManager accountManager = new AccountManager();
        double expected = 0;

        //: when

        double actual = accountManager.getCheckingCurrentAmount();

        //then

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    void getSavingCurrentAmount() {
        //:Given
        AccountManager accountManager = new AccountManager();
        double expected = 0;

        //: when

        double actual = accountManager.getSavingCurrentAmount();

        //then

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    void getInvestmentCurrentAmount() {
        //:Given
        AccountManager accountManager = new AccountManager();
        double expected = 0;

        //: when

        double actual = accountManager.getInvestmentCurrentAmount();

        //then

        Assert.assertEquals(expected, actual, 0);
    }

}