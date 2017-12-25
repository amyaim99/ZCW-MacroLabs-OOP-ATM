//package Mohammed.Abrar.ProjectATM;
//
//
//import java.sql.SQLOutput;
//import java.util.ArrayList;
//import java.util.Random;
//import java.util.Scanner;
//import java.util.logging.Logger;
//
//public class UserFactory {
//    private static final Logger logger = Logger.getGlobal();
//
//    private static final UserFactory USERINSTANCE = new UserFactory();
//    private static ArrayList<User> userList;
//
//
//   private UserFactory() {
//
//    }
//
//    public static void createUser() {
//
//        Random random = new Random();
//        int userId = 100000 + random.nextInt(900000);
//        logger.info("Trying to create an account with " + userId);
//        userList = new ArrayList<>();
//        userList.add(new User(userId));
//        System.out.println("Your id is " + userId);
//    }
//
//    public static boolean checkUserExist(User user) {
//        return USERINSTANCE.userList.contains(user);
//    }
//
//    public static void removeUser(User user) {
//
//        userList.remove(user);
//
//    }
//
//    public static ArrayList<User> getUserList() {
//        return userList;
//    }
//
//
//    @Override
//    public String toString() {
//        StringBuilder listAsString = new StringBuilder();
//        // String result = "+";
//        for (int i = 0; i < userList.size(); i++) {
//            listAsString.append(userList.get(i));
//
//        }
//        return listAsString.toString();
//    }
//
//    public static UserFactory getINSTANCE() {
//        return USERINSTANCE;
//    }
//}
//
//
//
//
