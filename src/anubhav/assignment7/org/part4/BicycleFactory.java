package anubhav.assignment7.org.part4;

public class BicycleFactory implements CycleFactory{

    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
}
