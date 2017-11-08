package Mohammed.Abrar.ProjectATM;

import java.util.Scanner;

public class ConsoleATM {



    public ConsoleATM(){}

    public static int welcomeMessage(){
        System.out.println("***********************************************\n \n" +
                "      ****  Welcome of ABC Bank ***\n\n" +
                "**********************************************");

        System.out.println("Please insert your user id ");
        Scanner scanner = new Scanner(System.in);

        int userId = Integer.parseInt(scanner.nextLine());

        return userId;

    }

//    public static void manageUserLogIn(int userId) {
//
//        UserFactory userFactory = UserFactory.getINSTANCE();
//
//
//
//        if (userFactory.checkUserExist(userId)) {
//            System.out.println("Insert your account id");
//            Scanner scanner = new Scanner(System.in);
//            int accountId = Integer.parseInt(scanner.nextLine());
//            AccountFactory accountFactory = AccountFactory.getINSTANCE();
//            accountFactory.accountCheck(accountId);
//        } else {
//            System.out.println("user doesnt exist. Creating new user");
//            userFactory.createUser();
//        }
//    }
}
