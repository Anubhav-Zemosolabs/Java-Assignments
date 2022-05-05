package anubhav.assignment6.org;

public class Example2 {

    private int var1;
    private double var2;

    public Example2(){
        var1 = 1;
        var2 = 1.5;
    }

    public Example2(int var1, double var2){
        this.var1=var1;
        this.var2=var2;
        new Example2();
    }

    void printElement(){
        System.out.println("var1: " + var1);
        System.out.println("var2: " + var2);
    }

    public static void main(String[] args) {
          Example2 obj = new Example2(2, 2.5);
          obj.printElement();
    }
}
