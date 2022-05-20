package anubhav.assignment7.org.part1;

public class RandomRodentAssigner {
    public Rodent RandomAssigner(){
        int randomNumber = (int)(Math.random()*5);
        return switch(randomNumber){
            case 0 -> new Gerbil();
            case 1 -> new Chipmunk();
            case 3 -> new Mouse();
            default -> new Hamster();
        };
    }
}
