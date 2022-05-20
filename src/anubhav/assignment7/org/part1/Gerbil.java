package anubhav.assignment7.org.part1;

public class Gerbil extends PrintInformation implements Rodent{
    public Gerbil() {
        super(Gerbil.class.getSimpleName(),"class");
    }

    @Override
    public void location() {
        new PrintInformation("Mongolia","location");

    }

    @Override
    public void eat() {
        new PrintInformation("seeds, roots, nuts, green plant parts","eat");

    }

    @Override
    public void tail() {
        new PrintInformation("Bushy","tail");

    }
}
