//package Mohammed.Abrar.ProjectATM;
//
//import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
//import org.junit.Assert;
//import org.junit.jupiter.api.Test;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class UserFactoryTest {
//
//    UserFactory userFactory = new UserFactory();
//
//    @Test
//    void userExist() {
//        //:Given
//        User user = UserFactory.createUser("myUserName", "myPassword");
//
//        //: then
//
//        Assert.assertTrue(UserFactory.userExist(user));
//
//    }
//
//    @Test
//    void getUserList() {
//        //:Given
//        ArrayList<User> userList = new ArrayList<>();
//        User user = new User();
//
//        userList.add(user);
//
//       // System.out.println( userList.size());
//        user.setPassword("myname");
//        user.setUserName("myPassword");
//        System.out.println(userList.get(0).toString());
////        String expected = "Am de";
////
////        //: when
////       String actual = userFactory.toString();
////
////       Assert.assertEquals("Thelist does exist", expected, actual);
//    }
//
//    @Test
//    void createUser() {
//        //:Given
//        User user = UserFactory.createUser("myUserName", "myPassword");
//
//        //:then
//        Assert.assertTrue(UserFactory.userExist(user));
//
//    }
//
//
//}