package Java_Lab.Java_Lab8_2;

import java.security.SecureRandom;

public class Dog extends Animal{
    private final int dogMaxSpeed = 60;

    public Dog(){
        this.speed = new SecureRandom().nextInt(dogMaxSpeed +1);

    }
}
