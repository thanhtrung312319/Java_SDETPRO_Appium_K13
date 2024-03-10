package Java_Lab.Java_Lab10_1;

import java.security.PrivateKey;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class RanceController {

    public Animal getWinner(List<Animal> animalList){
        Animal winner = null;
        List<Animal> validAnimal = getValidAnimal(animalList);
        for (Animal animal : animalList){
            if (winner == null || animal.getSpeed() > winner.getSpeed()){
                winner = animal;
            }
        }
        return winner;
    }
    private List<Animal> getValidAnimal(List<Animal> animalList){
        List<Animal> validAnimal = new ArrayList<>();
        for (Animal animal : animalList){
            if(!animal.isFlyable()){
                validAnimal.add(animal);
            }
        }
        return validAnimal;
    }
}
