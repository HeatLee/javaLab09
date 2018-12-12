package by.bntu.fitr.povt.justcompileit.javalabs.lab09.additionaltask.view;

public class Printer {

    public static void showMenu(String[] items, String menuTitle) {
        System.out.print(menuTitle + "\n");
        for (int i = 0; i < items.length; i++) {
            System.out.print(String.format("%d. " + items[i] + ";\n", (i+1)));
        }
    }
    public static void print(String msg) {
        System.out.print(msg);
    }
}
