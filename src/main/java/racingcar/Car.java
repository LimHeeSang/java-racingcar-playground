package racingcar;

public class Car {
    private final Name name;
    private Position position;

    public Car(String name) {
        this.position = new Position();
        this.name = new Name(name);
    }
}
