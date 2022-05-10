package anubhav.assignment5.org;

public class Main {
    public static void main(String[] args) {
        Data obj1=new Data();
        obj1.getInstanceVariables();

        //        obj1.printValues();
        //        Not allowed in Java

        Singleton obj2=Singleton.getInstance("SurajKumar");
        obj2.getName();
    }
}
