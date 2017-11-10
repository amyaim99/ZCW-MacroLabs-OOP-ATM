package Mohammed.Abrar.ProjectATM;

import java.util.Scanner;

public class ConsoleInput {

    public static final Scanner scanner = new Scanner(System.in);

    public static String  getString (){

        return scanner.nextLine();

    }

    public static double getDouble (){

        return Double.parseDouble(getString());
    }

    public static int getInteger(){

        return Integer.parseInt(getString());
    }
}
