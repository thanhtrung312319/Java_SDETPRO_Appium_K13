package Java_Lab.Java_Lab8_2;

import java.security.SecureRandom;

public class Horse extends Animal {
    private final int horseMaxSpeed = 75;

    public Horse(){
        this.speed = new SecureRandom().nextInt(horseMaxSpeed +1);
    }
}
