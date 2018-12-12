package by.bntu.fitr.povt.justcompileit.javalabs.lab09.additionaltask.util;

import by.bntu.fitr.povt.justcompileit.javalabs.lab09.additionaltask.view.Printer;

public class Choise {
    public static final String INPUT_MESSAGE_1 = "Input menu item:";
    public static final String ERROR_MESSAGE = "Wong type of answer. Try again...\n";
    public static final String ERROR_MESSAGE_1 = "Thar's no such menu item. Try again...\n";
    public static final char POSITIVE_ANSWER = 'y';
    public static final char NEGATIVE_ANSWER = 'n';

    public static int chooseMenuItem(int amountOfItems) {
        int item = UserInput.nextInt(INPUT_MESSAGE_1) - 1;
        if (item >= amountOfItems || item < 0) {
            System.out.print(ERROR_MESSAGE_1);
            return chooseMenuItem(amountOfItems);
        }
        return item;
    }
    public static boolean exiting(String msg) {
        char answer = UserInput.nextChar(msg);
        if (answer == POSITIVE_ANSWER) {
            return true;
        } else if (answer == NEGATIVE_ANSWER) {
            return false;
        } else {
            Printer.print(ERROR_MESSAGE);
            return exiting(msg);
        }
    }
}
