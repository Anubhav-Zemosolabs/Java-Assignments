package anubhav.assignment7.org.part4;

public class TricycleFactory implements CycleFactory{
    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
}
