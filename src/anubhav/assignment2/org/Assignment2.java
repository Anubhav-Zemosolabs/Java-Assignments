package anubhav.assignment2.org;

import java.io.File;
//use to take inputs
import java.util.Scanner;


//declared main()
public class Assignment2 {
    private void searchFile()
    {

        // address of files or folder where to search
        File file = new File("/home/anubhav");
        //string to store the name of the file
        String str ;
        //  Scanner is declare
        Scanner in = new Scanner(System.in);
        // do while is used to run the program again and again
        do{
            int flag =0;
            System.out.println("ENTER THE NAME OF FILE OR FOLDER:\t");
            //take input
            str =in.nextLine();
            //list of file is stored in string
            String[] files = file.list();
            //continuous check each file or folder
            for (String string : files){

                //check the name of file present or not and store in boolean str1
                Boolean str1 = str.equals(string);

                // str1 is true then print the following
                if (str1){
                    flag = 1;
                    System.out.println("File Found : ");
                    System.out.println(string);
                    //print the address of the file
                    System.out.println("Path : "+ file.getAbsolutePath());
                    break;
                }
            }
            //if file not found
            if(flag == 0)
            {
                System.out.println("File not find : Reenter the name of the file.");
            }
        } while(true);

    }

    public static void main(String[] args){
        //object of Demo class is created
        Assignment2 obj =new Assignment2();
        //calling the findFile()
        obj.searchFile();
    }
}