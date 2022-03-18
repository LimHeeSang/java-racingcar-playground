package racingcar;

public class Car {
    public static final int START_POSITION = 1;
    public static final int MAX_CAR_NAME_LENGTH = 5;
    public static final int RACE_CONDITION_VALUE = 4;

    private final String name;
    private int position;

    public Car(String name) {
        validateConstructor(name);
        this.name = name;
        this.position = START_POSITION;
    }

    private void validateConstructor(String name) {
        if (name.length() > MAX_CAR_NAME_LENGTH) {
            throw new IllegalArgumentException("자동차 이름은 5글자를 초과할 수 없습니다.");
        }
    }

    public int makeRandomInt() {
        return (int) (Math.random() * 9 + 1);
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public int race() {
        int randomInt = makeRandomInt();
        if (randomInt >= RACE_CONDITION_VALUE) {
            position++;
        }

        return position;
    }

    public boolean isEqualPosition(int position) {
        return this.position == position;
    }
}
