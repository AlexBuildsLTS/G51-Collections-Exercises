package se.alex.lexicon;

import java.util.HashSet;
import java.util.Set;

public class DaysOfWeekHashSet {
    public static void main(String[] args) {
        // Create a new hashset to hold the days of the week
        Set<String> daysOfWeek = new HashSet<>();

        // Populate the hashset with the days of the week
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");


        System.out.println("Days of the week (HashSet): " + daysOfWeek);
    }
}
