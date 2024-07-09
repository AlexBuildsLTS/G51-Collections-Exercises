package se.alex.lexicon;

import java.util.ArrayList;
import java.util.List;

public class AddThursdayToList {
    public static void main(String[] args) {
        // Create a new list to hold the days of the week, excluding Thursday
        List<String> daysOfWeek = new ArrayList<>();

        // Populate the list with the days of the week
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        // Inserted Thursday into the correct position
        daysOfWeek.add(3, "Thursday");


        System.out.println("Days of the week: " + daysOfWeek);
    }
}
