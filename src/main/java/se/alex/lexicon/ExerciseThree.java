package se.alex.lexicon;

import java.util.ArrayList;
import java.util.List;

public class ExerciseThree {
    public static void main(String[] args) {
        // Create a new ArrayList to store the days of the week excluding Thursday
        List<String> daysOfWeek = new ArrayList<>();
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        // Insert Thursday into the correct position (index 3)
        daysOfWeek.add(3, "Thursday");

        // Print out the list
        System.out.println(daysOfWeek);
    }
}
