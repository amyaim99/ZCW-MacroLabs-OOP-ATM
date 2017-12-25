//package Mohammed.Abrar.ProjectATM;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class AccountFactoryTest {
//    AccountFactory accountFactory = AccountFactory.getINSTANCE();
//
//        Account account = new Account(2000);
//        Account account2 = new Account(4000);
//
//    @Test
//   public void getUserListAndGetINSTANCETEST() {
//
//        int expected = accountFactory.getAccountList().size()+2;
//        accountFactory.getAccountList().add(account);
//        accountFactory.getAccountList().add(account2);
//
//
//       int actual =  accountFactory.getAccountList().size();
//
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test
//    void removeAccountTest(){
//
//        accountFactory.getAccountList().add(account);
//        accountFactory.getAccountList().add(account2);
//
//        int expected = accountFactory.getAccountList().size()-1;
//        AccountFactory.removeAccount(account);
//        int actual = accountFactory.getAccountList().size();
//
//        Assert.assertEquals(expected, actual);
//
//
//}
//
//}