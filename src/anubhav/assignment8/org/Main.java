package anubhav.assignment8.org;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Exceptionthrough exp=new Exceptionthrough();
        Scanner sc=new Scanner(System.in);
        String int_var;
        while(true)
        {
            int_var=sc.nextLine();
            if(is_Integer(int_var))
                break;
            else{
                System.out.println("Enter a digit between 1 and 3");
            }
        }
        try{
            exp.through(Integer.parseInt(int_var));
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

    private static boolean is_Integer(String int_var) {
        try {
            Integer.parseInt(int_var);
            if(Integer.parseInt(int_var)>3)
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

