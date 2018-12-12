package by.bntu.fitr.povt.justcompileit.javalabs.lab09.additionaltask.controller;

import by.bntu.fitr.povt.justcompileit.javalabs.lab09.additionaltask.view.Printer;
import by.bntu.fitr.povt.justcompileit.javalabs.lab09.additionaltask.util.Choise;
import by.bntu.fitr.povt.justcompileit.javalabs.lab09.additionaltask.util.UserInput;
import by.bntu.fitr.povt.justcompileit.javalabs.lab09.additionaltask.model.logic.GameLogic;
public class Game {
    public static final String[] MENU_ITEMS = {"EASY", "NORMAL", "DIFFICULT", "INSANE"};
    public static final String MENU_TITLE = "Choose difficulty:";
    public static final String EXITTING_MESSAGE = "Do you want to play more? (y/n)\n";
    private static final int[] EASY = {2, 4, 0, 50};
    private static final int[] NORMAL = {4, 6, 0, 100};
    private static final int[] DIFFICULT = {6, 9, 20, 100};
    private static final int[] INSANE = {10, 20, 1000, 9999};
    private static final int[][] LVLS = {EASY, NORMAL, DIFFICULT, INSANE};
    private static final int BEGINNING_INDEX = 2;
    private static final int END_INDEX = 3;
    private static final boolean DEFAULT_RUN = true;
    public static final String INPUT_MESSAGE = "Input your guess: ";
    public static final String CONGRATULATION = "CONGRATULATION!!!1!!!\n";
    public static final String GAME_OVER_1 = "Secret number: ";
    public static final String GAME_OVER_2 = "It took attemts: ";

    public static void main(String[] args) {
        boolean run = DEFAULT_RUN;
        while(run) {
            int guess;
            Printer.showMenu(MENU_ITEMS, MENU_TITLE);
            int item = Choise.chooseMenuItem(MENU_ITEMS.length);
            GameLogic.setLimits(LVLS[item]);
            GameLogic.gameInit();
            GameLogic.createNumber(LVLS[item][BEGINNING_INDEX], LVLS[item][END_INDEX]);

            do {
                guess = UserInput.nextInt(INPUT_MESSAGE);
                GameLogic.incAttempt();
                Printer.print(GameLogic.giveHelp(guess));
            } while (!GameLogic.isGameOver(guess));
            Printer.print(CONGRATULATION);
            Printer.print(GAME_OVER_1 + guess + ";\n" +
                    GAME_OVER_2 + GameLogic.showAttempts() + ".\n");
            run = Choise.exiting(EXITTING_MESSAGE);
        }
    }
}
