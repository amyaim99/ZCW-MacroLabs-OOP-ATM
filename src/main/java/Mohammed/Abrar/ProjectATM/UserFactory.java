//package Mohammed.Abrar.ProjectATM;
//import org.junit.Assert;
//import org.junit.Test;
//
//import java.util.ArrayList;
//import java.util.Random;
//import java.util.Scanner;
//
//public class UserFactory {
//
//    private static ArrayList<User> userList = new ArrayList<>();
//    private static final UserFactory INSTANCE = new UserFactory();
//    User user = new User(000000);
//
//    private UserFactory() {
//        userList.add(user);
//    }
//
//    public static void createUser() {
//        Random random = new Random();
//        int userId = 100000 + random.nextInt(900000);
//        User user = new User(userId);
//        userList.add(user);
//        System.out.println("Your id is " + userId);
//    }
//
//    public static boolean checkUserExist(int userId) {
//        return INSTANCE.user.getId() != userId;
//    }
//
//
//
//    public static ArrayList<User> getUserList() {
//        return userList;
//    }
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
//        return INSTANCE;
//    }
//}
//
//
//
//
