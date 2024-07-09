package se.alex.lexicon;

import java.util.ArrayList;
import java.util.List;

public class DaysOfWeekIteration {
    public static void main(String[] args) {
        // Create a new list to hold the days of the week
        List<String> daysOfWeek = new ArrayList<>();


        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        // Iterate through the list
        System.out.println("Days of the week:");
        for (String day : daysOfWeek) {
            System.out.println(day);
        }
    }
}
