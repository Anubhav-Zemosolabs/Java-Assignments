package anubhav.assignment9.org;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularPatternExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Initialize the regular expression
        String regex = "[A-Z]+[a-zA-Z0-9._ ]*[.]+";

        //Taking Input from the user
        String sentence;
        System.out.print("Enter the sentence: ");
        sentence = sc.nextLine();

        //checking that user input matches to the regular expression
        boolean isMatches=(Pattern.matches(regex, sentence));
        // boolean result = matcher.matches();
        System.out.println("Is sentence start with Camel Case and ending with period? " + isMatches);
    }
}
