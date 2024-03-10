package Java_Lab.Java_Lab10_1;

import java.security.SecureRandom;

public class Animal {
    private int speed;
    private String name;
    private boolean flyable;

    protected Animal(Builder builder) {
        this.name = builder.name;
        this.flyable = builder.flyable;
        this.speed = builder.speed;
    }

    // READ-ONLY
    public String getName() {
        return name;
    }

    public boolean isFlyable() {
        return flyable;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "speed=" + speed +
                ", name='" + name + '\'' +
                ", flyable=" + flyable +
                '}';
    }

    public static class Builder {
        private int speed;
        private String name;
        private boolean flyable;

        public Builder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }


        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setFlyable(boolean flyable) {
            this.flyable = flyable;
            return this;
        }

        public Animal build() {
            return new Animal(this);
        }
    }
    protected static int animalSpeed(int maxSpeed){
        return new SecureRandom().nextInt(maxSpeed) + 1;
    }
}
