package by.bntu.fitr.povt.justcompileit.javalabs.lab09.taskb.model.logic;

public class Calculator {
    public static final double ZERO = 0;
    public static final String ERROR_MESSAGE = "Invalid data ...";
    public static final char DIVIDE = '/';
    public static final char REMAINDER = '%';
    public static final char PLUS = '+';
    public static final char MINUS = '-';
    public static final char MULTIPLY = '*';

    public static String calculate(double x ,double y, char sign) {
        String ans = "";
        switch (sign) {
            case PLUS:
                ans += add(x, y);
                break;
            case MINUS:
                ans += subtract(x, y);
                break;
            case MULTIPLY:
                ans += multiply(x, y);
                break;
            case DIVIDE:
                ans += divide(x, y);
                break;
            case REMAINDER:
                ans += findRemainder(x, y);
                break;
        }
        return ans;
    }
    public static double add(double x, double y) {
        return (x + y);
    }

    public static double subtract(double x, double y) {
        return (x - y);
    }

    public static double multiply(double x, double y) {
        return (x * y);
    }

    public static String findRemainder(double x, double y) {
        String ans = ERROR_MESSAGE;
        if (y != 0) {
            ans = "";
            ans += x%y;
        }
        return ans;
    }

    public static String divide(double x, double y) {
        String ans = ERROR_MESSAGE;
        if (y != ZERO) {
            ans = "";
            ans += x/y;
        }
        return ans;
    }
}
