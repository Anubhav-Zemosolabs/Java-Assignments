package anubhav.assignment8.org;
public class Exceptionthrough {

    public void through(int i) throws Exception1, Exception3, Exception2 {
        if(i==1) {
            System.out.println("Exception 1 thrown");
            throw new Exception1();
        }
        else if(i==2){
            System.out.println("Exception 2 thrown");
            throw new Exception2();
        }
        else if(i==3){
            System.out.println("Exception 3 thrown");
            throw new Exception3();
        }
        else {
            System.out.println("i out of range");
            throw new NullPointerException();
        }
    }
}