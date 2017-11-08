package Mohammed.Abrar.ProjectATM;

import java.io.Console;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        MyLambda myString = s ->s.length();
//        System.out.println(myString.stringLength("abra"));
//
//        Thread myTread = new Thread (()-> System.out.println("print me"));
//        myTread.run();
         String[] studentName = {"Aaron Herion", "Abrar Mohammed","Andrea Susnick","Andrew Kutchen",
                "Brian Sutton","Claude McAlpin", "Donald Fountain" , "Elliott Kozulak", "Gabriela Lisboa",
                "Graham Nilsen", "Greg Patselas","Jeff Lawrence", "Katherine Anderson",
                "Kevin Buckley", "Lina Zhang", "Linda Qiu", "Logan Hanner", "Oleg Stirbu", "Pavel Parfenov",
                "Raul Cubila Perez", "Rob Kruzel", "Ryan Maiale", "SAMUEL HAILE", "Timothy Rager", "Vince Paris",
                "Wesley Connors","Zan Cheema"};
        ArrayList<Person> people = new ArrayList<>();
        Person person;

        for (int i = 0; i < studentName.length; i++) {

            person = new Person(studentName[i]);
            people.add(person);
        }

        System.out.println(people.size());
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
               return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });
        printAll(people);
        System.out.println(people.);

    }

    private static void printAll(ArrayList<Person> people) {
    }
}

interface MyLambda {

    int stringLength(String s);
}


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("User Name:   ");
//        String userName = scanner.nextLine();
//        System.out.println("Password:   ");
//        String password = scanner.nextLine();
//        UserFactory.createUser(userName, password);
//        int id = scanner.nextInt();
//        AccountFactory.createAccount(id);
//        AccountManager accountManager = new AccountManager();
//        accountManager.logInToAccount(id);
//    }
//}
////        //System.out.println(UserFactory.getUserList().size());
////        //System.out.println(UserFactory.getUserList().get(1).getId());
////        //System.out.println("Result: "  + result);
////        //System.out.println("ArrayList size: " + UserFactory.getUserList().size());
//////        AccountManager accountManager = new AccountManager();
//////        accountManager.accountType();
//////        accountManager.transactionOrderId();
////
////
////        /** System.out.println("Are you New Mohammed.Abrar.ProjectATM.User (Yes No): ");
////         String userStat = scanner.nextLine();
////         if ("yes".equalsIgnoreCase(userStat)) {
////
////         UserCheck userCheck = new UserCheck();
////         userCheck.isUser(userName, sPassword);
////         System.out.println("Select account type: 1 for Checking, 2 for Savings and 3 for Investment");
////         int accountId = scanner.nextInt();
////         AccountType accountType = new AccountType(accountId);
////
////         System.out.println("Select action to perform: 1 for Withdrawal, 2 for Deposit, 3 for Transfer across account," +
////         "4 for open new account, 5 for Close account, 6 for print transaction history, 7 for Check balance" +
////         "8 for transfer to another user account");
////
////         AssignJob assignJob = new AssignJob();
////
////         } else {
////         CreateAccount createAccount = new CreateAccount();
////         createAccount.create();
////         }*/
////    }
////}