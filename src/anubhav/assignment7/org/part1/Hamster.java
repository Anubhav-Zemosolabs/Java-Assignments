package anubhav.assignment7.org.part1;

public class Hamster extends PrintInformation implements Rodent{
    public Hamster() {
        super(Hamster.class.getSimpleName(),"class");
    }

    @Override
    public void location() {
        new PrintInformation("Central europe to western siberia","location");

    }

    @Override
    public void eat() {
        new PrintInformation("roots, tubers, and bulbs","eat");
    }

    @Override
    public void tail() {
        new PrintInformation("scantily haired","tail");
    }

}
