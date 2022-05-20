package anubhav.assignment11.org;
import java.io.*;
import java.util.*;

public class CountOccurrencesOfCharacter {
    public static void main(String[] args) {
        Scanner infile;
        try {
            infile = new Scanner(new File("/home/anubhav/Documents/coding/OOPs_Concepts/JavaModuleAssignments/src/anubhav/assignment11/org/textFile.txt"));
            String string;
            HashMap<Character,Integer> charCountMap = new HashMap<Character, Integer>();
            while(infile.hasNext()) {
                string = infile.next();
               // System.out.println(string);
                char[] strArray = string.toCharArray();

                // checking each char of strArray
                for (char c : strArray) {
                    if (charCountMap.containsKey(c)) {

                        // If char is present in charCountMap,
                        // incrementing it's count by 1
                        charCountMap.put(c, charCountMap.get(c) + 1);
                    }
                    else {
                        // If char is not present in charCountMap,
                        // putting this char to charCountMap with 1 as it's value
                        charCountMap.put(c, 1);
                    }
                }
            }
            infile.close();

            PrintWriter pw = new PrintWriter("/home/anubhav/Documents/coding/OOPs_Concepts/JavaModuleAssignments/src/anubhav/assignment11/org/characterOccurrencesOutputFile.txt");
            // Printing the charCountMap
            for (Map.Entry entry : charCountMap.entrySet()) {
                pw.println(entry.getKey() + " " + entry.getValue());
            }
            pw.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
