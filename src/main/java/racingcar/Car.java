package racingcar;

public class Car {
    private final String name;

    public Car(String name) {
        validateConstructor(name);
        this.name = name;
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
}
