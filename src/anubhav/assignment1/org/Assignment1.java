package anubhav.assignment1.org;

import java.util.Scanner;

public class Assignment1 {
    public static boolean findMissing(String str){

        // replace("[^a-z]","") : first eliminating all the characters except alphabet letters from the input string.
        // replaceAll("(.)(?=.*\\1)", ""): removing duplicate characters.
        // check the resultant string has all the characters of not by comparing with length == 26.
        return str.toLowerCase().replace("[^a-z]","").replaceAll("(.)(?=.*\\1)", "").length()==26;

        // Big-O-Complexity of this approach also tends to O(n) because checking the presence of each character in string, so it will take O(n) time.
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Enter the input string:\t");
        str = sc.nextLine(); //taking input from the user
        boolean res = findMissing(str);
        System.out.println("Is string " + str + " contain all letters present in string: " + res);
    }
}
