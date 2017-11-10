package Mohammed.Abrar.ProjectATM;

import org.junit.Assert;
import org.junit.Test;

class AccountManagerTest {
    TransactionManager accountManager = new TransactionManager(1010101);

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
    void trasfer() {
        //:Given
        double expected = -50;

        //: when

        double actual = accountManager.trasfer(50);

        //then

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    void trasferTo() {
        //:Given
        TransactionManager accountManager = new TransactionManager(1010101);
        double expected = 250;

        //: when

        double actual = accountManager.getCheckingCurrentAmount() + accountManager.transferTo(250, 1);

        //then

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    void deposit() {
        //:Given
        TransactionManager accountManager = new TransactionManager(1010101);
        double expected = 50;

        //: when

        double actual = accountManager.deposit(50);

        //then

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    void withdrawal() {

        //:Given
        TransactionManager accountManager = new TransactionManager(1010101);
        double expected = -50;

        //: when

        double actual = accountManager.withdrawal(50);

        //then

        Assert.assertEquals(expected, actual, 0);
    }


    @Test
    void accountAmount() {
        //:Given
        TransactionManager accountManager = new TransactionManager(1010101);
        double expected = accountManager.getCheckingCurrentAmount();

        //: when
        double actual = accountManager.accountAmount(1);

        //then

        Assert.assertEquals(expected, actual, 0);
    }


    @Test
    void setTransactionHistory() {
    }

    @Test
    void getCheckingCurrentAmount() {
        //:Given
        TransactionManager accountManager = new TransactionManager(1010101);
        double expected = 0;

        //: when

        double actual = accountManager.getCheckingCurrentAmount();

        //then

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    void getSavingCurrentAmount() {
        //:Given
        TransactionManager accountManager = new TransactionManager(1010101);
        double expected = 0;

        //: when

        double actual = accountManager.getSavingCurrentAmount();

        //then

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    void getInvestmentCurrentAmount() {
        //:Given
        TransactionManager accountManager = new TransactionManager(1010101);
        double expected = 0;

        //: when

        double actual = accountManager.getInvestmentCurrentAmount();

        //then

        Assert.assertEquals(expected, actual, 0);
    }

}