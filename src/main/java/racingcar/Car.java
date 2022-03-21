package racingcar;

public class Car {
    private final Name name;
    private Position position;

    public Car(String name) {
        this(name, 0);
    }

    public Car(String name, int position) {
        this.name = new Name(name);
        this.position = new Position(position);
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

    public boolean isMaxPositionThan(Position maxPosition) {
        return position.isMaxThan(maxPosition);
    }

    public boolean isEqualPosition(Position maxPosition) {
        return position.equals(maxPosition);
    }
}
