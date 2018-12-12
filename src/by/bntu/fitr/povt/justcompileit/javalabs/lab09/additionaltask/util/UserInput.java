package by.bntu.fitr.povt.justcompileit.javalabs.lab09.additionaltask.util;

import by.bntu.fitr.povt.justcompileit.javalabs.lab09.additionaltask.view.Printer;
import java.util.Scanner;
public class UserInput {
    public static Scanner scanner = new Scanner(System.in);
    public static final String ERROR_MESSAGE = "Wrong type of data. Please input integer value...\n";
    public static int nextInt(String msg){
        Printer.print(msg);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            Printer.print(ERROR_MESSAGE);
            scanner.nextLine();
            return nextInt(msg);
        }
    }

    public static char nextChar(String msg){
        Printer.print(msg);
        return scanner.next().charAt(0);
    }
}
