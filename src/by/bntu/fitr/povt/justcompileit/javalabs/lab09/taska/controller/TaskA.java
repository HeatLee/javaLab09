package by.bntu.fitr.povt.justcompileit.javalabs.lab09.taska.controller;

import by.bntu.fitr.povt.justcompileit.javalabs.lab09.taska.util.UserInput;
import by.bntu.fitr.povt.justcompileit.javalabs.lab09.taska.model.logic.SeasonSelector;
import by.bntu.fitr.povt.justcompileit.javalabs.lab09.taska.view.Printer;

public class TaskA {
    public static boolean DEFAULT_RUN = true;
    public static String INPUT_MESSAGE_1 = "Input number in range from 1 to 12: ";
    public static String INPUT_MESSAGE_2 = "Do you want to exit (y/n)?";
    public static String ERROR_MESSAGE = "Wong type of answer. Try again...";
    public static char POSITIVE_ANSWER = 'y';
    public static char NEGATIVE_ANSWER = 'n';

    public static void main(String[] args) {
        boolean running = DEFAULT_RUN;
        while (running) {
            int month = UserInput.nextInt(INPUT_MESSAGE_1);
            String season = SeasonSelector.selectSeason(month);
            Printer.print(season);
            running = exiting();
        }
    }
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
