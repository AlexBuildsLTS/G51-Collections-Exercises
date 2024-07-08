package se.alex.lexicon;

import java.util.ArrayList;
import java.util.List;

public class ExerciseFour {
    public static void main(String[] args) {
        // Create a new ArrayList to store the days of the week
        List<String> daysOfWeek = new ArrayList<>();

        // Populate the list with days of weeks
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        // Create a sublist of the first three elements
        List<String> firstThreeDays = daysOfWeek.subList(0, 3);

        // Print out the sublist
        System.out.println(firstThreeDays);
    }
}
