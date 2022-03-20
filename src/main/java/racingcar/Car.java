package racingcar;

import java.util.Random;

public class Car {
    private final Name name;
    private Position position;

    public Car(String name) {
        this.position = new Position();
        this.name = new Name(name);
    }

    public Position getPosition() {
        return position;
    }

    public Position move(MovingStrategy movingStrategy) {
        if (movingStrategy.movable()) {
            position = position.increase();
        }
        return getPosition();
    }


}
