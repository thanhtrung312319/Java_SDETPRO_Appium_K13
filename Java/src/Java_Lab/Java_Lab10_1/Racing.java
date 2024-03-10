package Java_Lab.Java_Lab10_1;
import java.util.ArrayList;
import java.util.Arrays;

import static Java_Lab.Java_Lab10_1.Animal.Builder;
import static Java_Lab.Java_Lab10_1.Animal.animalSpeed;

public class Racing {

    public static void main(String[] args){
        Animal horse = new Builder().setName("Horse").setSpeed(animalSpeed(75)).setFlyable(false).build();
        Animal tiger = new Builder().setName("Tiger").setSpeed(animalSpeed(100)).setFlyable(false).build();
        Animal egle = new Builder().setName("Egle").setSpeed(animalSpeed(60)).setFlyable(true).build();
        Animal winner = new RanceController().getWinner(Arrays.asList(horse, tiger, egle));
        System.out.println(winner);
    }
}
