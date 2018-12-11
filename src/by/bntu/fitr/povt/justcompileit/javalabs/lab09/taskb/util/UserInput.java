package by.bntu.fitr.povt.justcompileit.javalabs.lab09.taskb.util;

import by.bntu.fitr.povt.justcompileit.javalabs.lab09.taskb.view.Printer;

import java.util.Scanner;

public class UserInput {
    public static final Scanner scanner = new Scanner(System.in);
    public static final String ERROR_MESSAGE = "Wrong type of data. Please input integer value...\n";

    public static double nextDouble(String msg){
        Printer.print(msg);
        if (scanner.hasNextDouble()) {
            return scanner.nextDouble();
        } else {
            Printer.print(ERROR_MESSAGE);
            scanner.nextLine();
            return nextDouble(msg);
        }
    }

    private static boolean isValidSign(char sign) {
        boolean ans = false;
        if (sign == '+' || sign == '-' || sign == '/' || sign == '%') {
            ans = true;
        }
        return ans;
    }

    public static char nextSign(String msg) {
        Printer.print(msg);
        char sign = scanner.next().charAt(0);
        if (!isValidSign(sign)) {
            Printer.print(ERROR_MESSAGE);
            return nextSign(msg);
        }
        return sign;
    }

    public static char nextChar(String msg){
        Printer.print(msg);
        return scanner.next().charAt(0);
    }
}
