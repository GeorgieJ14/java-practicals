package java_aoop_practicals;

import static java.lang.Math.PI;
import static java.lang.Math.sqrt;
import java.util.ArrayList;

public class JavaNewFeatures {

    public enum Day {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,
        SATURDAY};
    
    public static void demonstrateGenericsForEach() {
        ArrayList<String> words = new ArrayList<String>();
        words.add("Hello, ");
        words.add("World!");
        String stuckTogetherWords = "";
        for (String s: words)
            stuckTogetherWords += s;
        System.out.println("The words stuck together make: " +
            stuckTogetherWords);
    }
    
    public static void demonstrateEnums() {
        Day day = Day.FRIDAY;
        System.out.print("Today is " + day);
        if (day.compareTo(Day.WEDNESDAY) > 0)
            System.out.println(", after WEDNESDAY");
    }

    /**
     * demonstrateVarArgsAutoUnboxing
     * takes ints and prints out their sum
     *
     * @param ints a number of integers to be added together
     * @pre. none
     * @post. a message indicating the sum of ints has
     * been displayed on the screen
     */
    public static void demonstrateVarArgsAutoUnboxing (Integer... ints) {
        System.out.println("The sum of the ints is "+
            (ints[0]+ints[1]+ints[2]));
    }
    
    public static void demonstrateAssertsStaticImports() {
        assert (sqrt(PI) > 4) : "Crash!!";
    }

    public static void main(String[] args) {
        demonstrateGenericsForEach();
        demonstrateEnums();
        demonstrateVarArgsAutoUnboxing(7,8,9);
        demonstrateAssertsStaticImports();
    }
}
