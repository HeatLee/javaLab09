package by.bntu.fitr.povt.justcompileit.javalabs.lab09.taska.controller;

import by.bntu.fitr.povt.justcompileit.javalabs.lab09.taska.util.UserInput;
import by.bntu.fitr.povt.justcompileit.javalabs.lab09.taska.util.Choise;
import by.bntu.fitr.povt.justcompileit.javalabs.lab09.taska.model.logic.SeasonSelector;
import by.bntu.fitr.povt.justcompileit.javalabs.lab09.taska.view.Printer;

public class taskA {
    public static final boolean DEFAULT_RUN = true;
    public static final String INPUT_MESSAGE = "Input number in range from 1 to 12: ";
    public static final String EXITTING_MESSAGE = "DO you want to exit? (y/n)";

    public static void main(String[] args) {
        boolean running = DEFAULT_RUN;
        while (running) {
            int month = UserInput.nextInt(INPUT_MESSAGE);
            String season = SeasonSelector.selectSeason(month);
            Printer.print(season);
            running = Choise.exiting(EXITTING_MESSAGE);
        }
    }
}
