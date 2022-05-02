package anubhav.assignment5.org;

public class Main {
    public static void main(String[] args) {
        data obj1=new data();
        obj1.getInstanceVariables();

        //        obj1.printValues();
        //        Not allowed in Java

        Singleton obj2=Singleton.getInstance("SurajKumar");
        obj2.getName();
    }
}
