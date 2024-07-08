package se.alex.lexicon;

import java.util.List;
import java.util.ArrayList;

public class ExerciseTwo {
    public static void main(String[] args) {
        // Create a new ArrayList to store the days of the week
        List<String> dayOfWeek = new ArrayList<>();

        // Populate the list with days of weeks
        dayOfWeek.add("Monday");
        dayOfWeek.add("Tuesday");
        dayOfWeek.add("Wednesday");
        dayOfWeek.add("Thursday");
        dayOfWeek.add("Friday");
        dayOfWeek.add("Saturday");
        dayOfWeek.add("Sunday");

        // Iterate through the list and print out each element separately
        for (String day : dayOfWeek) {
            System.out.println(day);
        }
    }
}
