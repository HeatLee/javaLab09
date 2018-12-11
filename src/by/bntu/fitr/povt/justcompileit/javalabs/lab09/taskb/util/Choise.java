package by.bntu.fitr.povt.justcompileit.javalabs.lab09.taskb.util;

import by.bntu.fitr.povt.justcompileit.javalabs.lab09.taskb.util.UserInput;
import by.bntu.fitr.povt.justcompileit.javalabs.lab09.taskb.view.Printer;

public class Choise{
    public static final String INPUT_MESSAGE_2 = "Do you want to exit (y/n)?\n";
    public static final String ERROR_MESSAGE = "Wong type of answer. Try again...\n";
    public static final char POSITIVE_ANSWER = 'y';
    public static final char NEGATIVE_ANSWER = 'n';

    public static boolean exiting() {
        char answer = UserInput.nextChar(INPUT_MESSAGE_2);
        if (answer == POSITIVE_ANSWER) {
            return true;
        } else if (answer == NEGATIVE_ANSWER) {
            return false;
        } else {
            Printer.print(ERROR_MESSAGE);
            return exiting();
        }
    }
}
