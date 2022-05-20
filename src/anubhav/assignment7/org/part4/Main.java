package anubhav.assignment7.org.part4;

public class Main {

    public  static void rideCycle(CycleFactory factory){
        Cycle cycle = factory.getCycle();
        cycle.ride();
    }

    public static void main(String[] args) {
        rideCycle(new UnicycleFactory());
        rideCycle(new BicycleFactory());
        rideCycle(new TricycleFactory());
    }
}
