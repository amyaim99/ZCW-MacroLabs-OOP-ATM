package Mohammed.Abrar.ProjectATM;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class UserFactory {

    private static ArrayList<User> userList = new ArrayList<>();

    public UserFactory() {
    }

    public static User createUser(String userName, String passWord) {
        User user = new User(userName, passWord);
        if (userExist(user)) {
            System.out.println("Insert your account Id:  ");

        } else {
            System.out.println("Adding a new user to the list....\n\nInsert your desired user Id: ");
            userList.add(user);
        }

        return user;
    }


    static boolean userExist(User user) {
        return userList.contains(user);
    }

    public static ArrayList<User> getUserList() {
        return userList;
    }

    @Override
    public String toString() {
        StringBuilder listAsString = new StringBuilder();
        // String result = "+";
        for (int i = 0; i < userList.size(); i++) {
            listAsString.append(userList.get(i));

        }
        return listAsString.toString();
    }
}




