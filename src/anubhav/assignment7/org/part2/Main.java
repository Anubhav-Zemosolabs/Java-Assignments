package anubhav.assignment7.org.part2;

public class Main {
    public static void main(String[] args) {
        //Upcasting of a child instance to a parent object is not allowed
        //UniCycle instance1= (Cycle) new UniCycle();
        //BiCycle instance2=(Cycle) new BiCycle();
        //TriCycle instance3=(Cycle) new TriCycle();

        Cycle instance1=new Unicycle();
        Cycle instance2=new Bicycle();
        Cycle instance3=new Tricycle();
        instance1.balance();
        instance2.balance();
        instance3.balance();

        System.out.println();

        Unicycle instance4 = new Unicycle();
        Bicycle instance5 = new Bicycle();
        Tricycle instance6 = new Tricycle();

        instance4.balance();
        instance5.balance();
        instance6.balance();

        System.out.println();
        Cycle instance7 = new Cycle();
        instance7.balance();
    }
}
