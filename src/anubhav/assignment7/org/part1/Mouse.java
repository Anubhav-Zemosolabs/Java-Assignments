package anubhav.assignment7.org.part1;

public class Mouse extends PrintInformation implements Rodent{
    public Mouse() {
        super(Mouse.class.getSimpleName(),"class");
    }

    @Override
    public void location() {
        new PrintInformation("all continents","location");
    }

    @Override
    public void eat() {
        new PrintInformation("Seeds and insects","eat");
    }

    @Override
    public void tail() {
        new PrintInformation("Thinly furred tail","tail");
    }


}
