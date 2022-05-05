package anubhav.assignment3.org;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    static  int calculateMedian(ArrayList<Integer> timeTakenToPing){
        int length = timeTakenToPing.size();
        Collections.sort(timeTakenToPing);
        if(length%2==1){
                return timeTakenToPing.get(length/2);
        }

        return timeTakenToPing.get(length/2) + timeTakenToPing.get((length/2)-1);

    }
    static int fetchPingTime(String request){
        int time = 0;
        int i = request.length()-1;
        while(i>0 && request.charAt(i)!='='){
            i--;
        }
        i++;
        while(i<request.length() && request.charAt(i)!='m'){
            int digit = request.charAt(i)-'0';
            time = time*10 + digit;
            i++;
        }
        return time;
    }

    // method for finding the ping statics of website
    static void commands(ArrayList<String> commandList)
            throws Exception{
        // creating the sub process, execute system command
        ProcessBuilder build = new ProcessBuilder(commandList);
        Process process = build.start();

        // to read the output
        BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
        BufferedReader error = new BufferedReader(new InputStreamReader(process.getErrorStream()));

        String s = null;
        System.out.println("Standard Output: ");
        ArrayList<Integer> timeTakenForPing = new ArrayList<Integer>();
        while((s = input.readLine()) != null){
            System.out.println(s);
            if(s.length()>0){
                int time = fetchPingTime(s);
                timeTakenForPing.add(time);
            }
        }
        System.out.println("error (if any): ");
        while((s = error.readLine()) != null)
        {
            System.out.println(s);
        }

        int median = calculateMedian(timeTakenForPing);
        if(median == -1)
            System.out.println("Unable to reach the host");
        else
            System.out.println("Median Time taken to ping host: " + median);

    }

    public static void main(String[] args) throws Exception {
        ArrayList<String> commandList = new ArrayList<>();
        commandList.add("ping");
        commandList.add("www.facebook.com");
        Main.commands(commandList);
    }
}
