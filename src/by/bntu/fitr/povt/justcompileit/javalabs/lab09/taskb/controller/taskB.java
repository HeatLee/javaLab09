package by.bntu.fitr.povt.justcompileit.javalabs.lab09.taskb.controller;

import by.bntu.fitr.povt.justcompileit.javalabs.lab09.taskb.util.Choise;
import by.bntu.fitr.povt.justcompileit.javalabs.lab09.taskb.util.UserInput;
import by.bntu.fitr.povt.justcompileit.javalabs.lab09.taskb.view.Printer;
import by.bntu.fitr.povt.justcompileit.javalabs.lab09.taskb.model.logic.Calculator;

public class taskB {
    public static final boolean DEFAULT_RUN = true;
    public static final String INPUT_MESSAGE_1 = "Input first number: ";
    public static final String INPUT_MESSAGE_2 = "Input second number: ";
    public static final String INPUT_MESSAGE_3 = "Input arithmetic sign: ";
    public static final String OUTPUT = "Answer: ";

    public static void main(String[] args) {
        boolean running = DEFAULT_RUN;
        while (running) {
            double x = UserInput.nextDouble(INPUT_MESSAGE_1);
            double y = UserInput.nextDouble(INPUT_MESSAGE_2);
            char sign = UserInput.nextSign(INPUT_MESSAGE_3);

            String answer = Calculator.calculate(x, y, sign);
            Printer.print(OUTPUT + answer + "\n");

            running = Choise.exiting();
        }
    }
}