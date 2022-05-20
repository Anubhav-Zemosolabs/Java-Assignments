package anubhav.assignment7.org.part1;

import java.util.ArrayList;

public class RodentMain {
    public static void main(String[] args) {
        ArrayList<Rodent> Species = new ArrayList<>();
        for(int i=0; i<6; i++){
            Species.add(new RandomRodentAssigner().RandomAssigner());
        }
        System.out.println();
        for(int i=0; i<6; i++){
            Species.get(i).location();
            Species.get(i).eat();
            Species.get(i).tail();
            System.out.println();
        }
    }
}
