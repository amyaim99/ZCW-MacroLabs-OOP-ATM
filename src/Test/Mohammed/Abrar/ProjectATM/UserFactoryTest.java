package Mohammed.Abrar.ProjectATM;

import org.junit.Assert;
import org.junit.Test;

import javax.jws.soap.SOAPBinding;
import java.util.logging.Logger;


public class UserFactoryTest {


    UserFactory userFactory = UserFactory.getINSTANCE();
    User user;


    @Test
   public  void createGetAndUserTest() {
        userFactory.createUser();
        int expected = UserFactory.getUserList().size();
        userFactory.createUser();




        System.out.println(UserFactory.getUserList().size());
        int actual = UserFactory.getUserList().size();

        Assert.assertEquals(expected, actual);
    }

    @Test
   public void checkUserExistTest() {
        //:Given

          UserFactory.createUser();

          User user = new User(20202020)  ;
         UserFactory.getUserList().add(user);


        System.out.println(userFactory.getUserList().get(0) .getUserId());
        //System.out.println(id);

          boolean expected = true;

         boolean actual = UserFactory.checkUserExist(user);

         Assert.assertEquals(expected, actual);


    }

    @Test

    public void deleteUserTest(){
        UserFactory.createUser();


     int expected =  UserFactory.getUserList().size();
        System.out.println(UserFactory.getUserList().size()-1);
      UserFactory.removeUser(user);
        System.out.println(UserFactory.getUserList().size());
     int actual = UserFactory.getUserList().size();

     Assert.assertEquals(expected, actual);

    }


    @Test
   public void getUserListTest() {
        //:Given

        userFactory.createUser();
        String expected = "[null, null, " + UserFactory.getUserList().get(0).getUserId() +"]";





        System.out.println(UserFactory.getUserList().size());
        String actual = UserFactory.getUserList().toString();

        Assert.assertEquals("the two user information are equal",expected, actual);



    }


}