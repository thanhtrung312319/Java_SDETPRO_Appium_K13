package Java_Lab.Java_Lab8_2;
import java.security.SecureRandom;

    public class Tiger extends Animal {
        private final int tigerMaxSpeed = 100;

        public Tiger(){
            this.speed = new SecureRandom().nextInt(tigerMaxSpeed +1);
        }
    }

