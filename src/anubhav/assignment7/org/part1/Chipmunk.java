package anubhav.assignment7.org.part1;

public class Chipmunk extends PrintInformation implements Rodent{
    public Chipmunk() {
        super(Chipmunk.class.getSimpleName(),"class");
    }

    @Override
    public void location() {
        new PrintInformation("North America","location");
    }

    @Override
    public void eat() {
        new PrintInformation("Omnivorous diet","eat");
    }

    @Override
    public void tail() {
        new PrintInformation("Fuzzy, Bushy Tail","tail");

    }

}

