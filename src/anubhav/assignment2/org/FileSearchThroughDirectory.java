package anubhav.assignment2.org;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class FileSearchThroughDirectory{

    private String fileNameToSearch;
    private List<String> result = new ArrayList<String>();

    public void setFileNameToSearch(String fileNameToSearch){
        this.fileNameToSearch=fileNameToSearch;
    }

    public String getFileNameToSearch(){
        return fileNameToSearch;
    }

    public List<String> getResult() {
        return result;
    }


    public static void main(String[] args){
        FileSearchThroughDirectory fileSearch = new FileSearchThroughDirectory();
        fileSearch.searchDirectory(new File("/home"), "test.txt");

        int fileSize = fileSearch.getResult().size();
        //checking the file size if it is zero then it will show not found
        if(fileSize == 0){
            System.out.println("\nNo result found!");
        }else{
            System.out.println("\nFound " + fileSize + " result!\n");
            for (String matched : fileSearch.getResult()){
                System.out.println("Found : " + matched);
            }
        }
    }

    public void searchDirectory(File directory, String fileNameToSearch){
        setFileNameToSearch(fileNameToSearch);
        if(directory.isDirectory()){
            search(directory);
        }
        else{
            System.out.println("Directory is not present");
        }
    }

    public void search(File file){
        if(file.isDirectory()){
            System.out.println("Searching File ..." + file.getAbsoluteFile());
        }
        //Do you have permission to read this directory?
        if(file.canRead()){
            for(File name : file.listFiles()){
                if(name.isDirectory()){
                    search(name);
                }
                else{
                    if(getFileNameToSearch().equalsIgnoreCase(name.getName())){
                        result.add(name.getAbsoluteFile().toString());
                    }
                }
            }
        }
        else {
            System.out.println(file.getAbsoluteFile() + "Permission Denied");
        }
    }
}