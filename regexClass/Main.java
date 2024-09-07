package regexClass;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // //Creating a Pattern through Regular Expression 
        // String regex = "Hello";
        // //String to be compared with RegEx 
        // String input = "Hello";
            
        // //Pattern Matching done using matches() method
        // System.out.println(input.matches(regex));
        // //Pattern Matching done using Pattern.matches() method
        // System.out.println(Pattern.matches(regex, input));
        // /**
        //  *  Output: true, true
        //  */

        //  String chainedString = "Lets-break-this-chain-and-be-free-!";
        //  String[] freeString = chainedString.split("-");
        //  System.out.println(freeString);
 
        ////////////////////////meta characters//////////////////////////////////
        // [xyz] matches 'x', 'y' or 'z'. [a-z] matches any letter from 'a' to 'z'.
        // b.t matches "bat", "bRt", "b8t", etc.
        // [^xyz] matches 'a', '6', etc. --> single character match karega except x,y,z
        // bat|cat matches "bat" or "cat"
        // Ma(nn|tt)er matches "Matter" or "Manner"
    }
}
