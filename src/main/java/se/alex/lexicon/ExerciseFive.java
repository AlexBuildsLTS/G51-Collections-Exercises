package se.alex.lexicon;

import java.util.HashSet;
import java.util.Set;


public class ExerciseFive {
    public static void main(String[] args) {

        // creating a new hashSet to store days of the week
        Set<String> daysOfWeek = new HashSet<String>();

        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        System.out.println(daysOfWeek);




    }
}
