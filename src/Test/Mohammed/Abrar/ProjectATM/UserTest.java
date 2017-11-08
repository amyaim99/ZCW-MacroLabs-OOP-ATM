//package Mohammed.Abrar.ProjectATM;
//
//import org.junit.Assert;
//import org.junit.jupiter.api.Test;
//
//class UserTest {
//    User user = new User();
//
//
//
//
//    @Test
//    void getuserName() {
//        //:given
//        user.setFirstName("Abrar);
//        String expected = "myaccount";
//        //:when
//
//        String actual;
//        actual = user.getuserName();
//
//        //:then
//        Assert.assertEquals("The two strings for getUser method are equal", expected, actual);
//    }
////
////    @Test
////    void setUserName() {
////        //:given
////        String expected = "myaccount";
////
////        //:when
////        user.setUserName(expected);
////
////        String actual = user.getuserName();
////
////        //:then
////        Assert.assertEquals("The two strings for setUser method are equal", expected, actual);
////    }
////
////    @Test
////    void getPassword() {
////        //:given
////        String expected = "wontTell";
////        //:when
////
////        String actual = user.getPassword().toString();
////
////        //:then
////        Assert.assertEquals("The two strings for getPassword methodare equal", expected, actual);
////    }
////
////    @Test
////    void setPassword() {
////        //:given
////
////        String expected = "wontTell";
////
////        //:when
////        user.setPassword(expected);
////        String actual;
////        actual = user.getPassword();
////
////        //:then
////        Assert.assertEquals("The two strings for setPassowrd method are equal", expected, actual);
////    }
////
////
////    @Test
////    void getId() {
////        //:given
////
////        int expected = user.getNextUserId();
////
////        //:when
////        user.setId();
////        int actual = user.getId();
////
////        //:then
////        Assert.assertEquals("The two ints for getId method are equal", expected, actual);
////    }
////
////    @Test
////    void setId() {
////
////        int expected = user.getNextUserId();
////
////        //:when
////        user.setId();
////        int actual = user.getId();
////
////        //:then
////        Assert.assertEquals("The two int for setId method are equal", expected, actual);
////    }
////
////    @Test
////    void getIdTest() {
////
////        int expected = 1;
////        //:when
////
////
////        int actual = user.getId();
////
////        //:then
////        Assert.assertEquals("The two  int for getNextId method are equal", expected, actual);
////    }
////    @Test
////    void getNextUserId() {
////        user.setId();
////        int expected = user.getId() + 1;
////
////        //:when
////
////
////        int actual = User.getNextUserId();
////
////        //:then
////        Assert.assertEquals("The two ints for getNextUserId method are equal", expected, actual);
////    }
////
////
////
////}