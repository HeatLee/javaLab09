package by.bntu.fitr.povt.justcompileit.javalabs.lab09.additionaltask.model.logic;

import java.util.Random;
public class GameLogic {

    public static int SECRET_NUMBER = 0;
    private static int ATTEMPT = 0;
    private static int FIRST_LIMIT = 0;
    private static int SECOND_LIMIT = 0;
    public static final String HELP_TIP_1 = "Oh, our numbers have identical last digits...\n";
    public static final String HELP_TIP_2 = "Both numbers have identical first dagits ...\n";
    public static final String HELP_TIP_3 = "Secret number is divided by your number\n";
    public static final String HELP_TIP_4 = "Your number is divided by secret number\n";
    public static final String HELP_TIP_5 = "Your number is bigger than secret one.\n";
    public static final String HELP_TIP_6 = "Your number is smaller than secret ... ;)\n";

    public static void setLimits(int[] setup) {
        FIRST_LIMIT = setup[0];
        SECOND_LIMIT = setup[1];
    }

    public static void createNumber(int from, int to) {
        SECRET_NUMBER =  new Random().nextInt(to - from) + from;
    }

    public static boolean isGameOver(int guess) {
        return SECRET_NUMBER == guess;
    }

    public static void incAttempt() {
        ATTEMPT++;
    }

    public static void gameInit() {
        ATTEMPT = 0;
    }

    public static int showAttempts() {
        return ATTEMPT;
    }

    private static int findFirstDigit(int number) {
        while (number / 10 != 0) {
            number /= 10;
        }
        return number;
    }

    public static String giveHelp(int guess) {
        String tip = "";
        if (guess != SECRET_NUMBER) {
            // common tips
            if (guess > SECRET_NUMBER) {
                tip += HELP_TIP_5;
            } else {
                tip += HELP_TIP_6;
            }
            // medium tips
            if (ATTEMPT >= FIRST_LIMIT) {
                if (SECRET_NUMBER % guess == 0) {
                    tip += HELP_TIP_3;
                }
                if (guess % SECRET_NUMBER == 0) {
                    tip += HELP_TIP_4;
                }
            }
            // advanced tips
            if (ATTEMPT >= SECOND_LIMIT) {
                if (SECRET_NUMBER % 10 == guess % 10) {
                    tip += HELP_TIP_1;
                } else if (findFirstDigit(SECRET_NUMBER) == findFirstDigit(guess)) {
                    tip += HELP_TIP_2;
                }
            }
        }
        return tip;
    }
}

