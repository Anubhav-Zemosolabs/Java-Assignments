package anubhav.assignment8.org;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ExceptionHandlingExample exp=new ExceptionHandlingExample();
        Scanner sc=new Scanner(System.in);
        String inputString;
        while(true)
        {
            inputString = sc.nextLine();
            if(isInteger(inputString))
                break;
            else{
                System.out.println("Enter a digit between 1 and 3");
            }
        }
        try{
            exp.ExceptionType(Integer.parseInt(inputString));
        }
        catch(Exception e)
        {
            System.out.println("Exception caught");
            System.out.println(e);
        }
        finally {
            System.out.println("Finally block Executed");
        }
    }

    private static boolean isInteger(String input_string) {
        try {
            // for converting string into integer
            Integer.parseInt(input_string);
            if(Integer.parseInt(input_string)>3)
            {
                return false;
            }
            return true;
        }
        catch(NumberFormatException e)
        {
            System.out.println("Number Format Exception");
            return false;
        }
    }
}

