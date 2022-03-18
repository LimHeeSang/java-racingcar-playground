package racingcar;

public class Car {
    private final String name;
    private int position;

    public Car(String name) {
        validateConstructor(name);
        this.name = name;
        this.position = 0;
    }

    private void validateConstructor(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5글자를 초과할 수 없습니다.");
        }
    }

    public int makeRandomInt() {
        // 0 <= int < 1
        return (int) (Math.random() * 9 + 1);
    }

    public int getPosition() {
        return position;
    }

    public int race() {
        int randomInt = makeRandomInt();
        if (randomInt >= 4) {
            position++;
        }

        return position;
    }
}
