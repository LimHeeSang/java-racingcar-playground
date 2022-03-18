package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> list = new ArrayList<>();

    public void add(Car car) {
        list.add(car);
    }

    public int getMaxPosition() {
        int maxPosition = 0;
        for (Car car : list) {
            if (maxPosition < car.getPosition()) {
                maxPosition = car.getPosition();
            }
        }
        return maxPosition;
    }

    public List<String> getEqualPositionCarNames(int position) {
        List<String> carNames = new ArrayList<>();
        for (Car car : list) {
            if (car.isEqualPosition(position)) {
                carNames.add(car.getName());
            }
        }
        return carNames;
    }

    public void raceByAttempt(int attempt) {
        for (int i = 0; i < attempt; i++) {
            for (Car car : list) {
                car.race();
            }
        }
    }
}
