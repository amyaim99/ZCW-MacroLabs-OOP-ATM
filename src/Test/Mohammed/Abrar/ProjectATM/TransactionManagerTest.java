package Mohammed.Abrar.ProjectATM;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class TransactionManagerTest {

    Account account = new Account();

    TransactionManager transactionManager = new TransactionManager(540, "donation", account);



    @Test
    void getAmount() {
        double expected = 540;
        double actual = transactionManager.getAmount();
        Assert.assertEquals(expected, actual,0);

    }

//    @Test
//    void getSummaryLine() {
//        String expected = new Date().toString() + " : $540.00 : donation";
//        String actual = transactionManager.getSummaryLine();
//        Assert.assertEquals(expected, actual);
//    }

}