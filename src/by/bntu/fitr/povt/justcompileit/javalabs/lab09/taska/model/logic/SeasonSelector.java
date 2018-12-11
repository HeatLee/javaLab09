package by.bntu.fitr.povt.justcompileit.javalabs.lab09.taska.model.logic;

import java.util.Arrays;

public class SeasonSelector {
    public static Integer[] WINTER_MONTHS = {12,1,2};
    public static Integer[] SPRING_MONTHS = {3,4,5};
    public static Integer[] SUMMER_MONTHS = {6,7,8};
    public static Integer[] AUTUMN_MONTHS = {9,10,11};
    public static String FIRST_SEASON = "winter";
    public static String SECOND_SEASON = "spring";
    public static String THIRD_SEASON = "summer";
    public static String FOURTH_SEASON = "autumn";
    public static String ERROR_MESSAGE = "Invalid data!!!";
    public static String RETURN_MESSAGE = "Season : ";

    public  static String selectSeason(int monthNumber){
        String answer = ERROR_MESSAGE;
        if (Arrays.asList(WINTER_MONTHS).contains(monthNumber)) {
            answer = FIRST_SEASON;
        } else if (Arrays.asList(SPRING_MONTHS).contains(monthNumber)) {
            answer = SECOND_SEASON;
        } else if (Arrays.asList(SUMMER_MONTHS).contains(monthNumber)) {
            answer = THIRD_SEASON;
        } else if (Arrays.asList(AUTUMN_MONTHS).contains(monthNumber)) {
            answer = FOURTH_SEASON;
        }
        return RETURN_MESSAGE + answer + "\n";
    }
}
