package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> list = new ArrayList<>();
    private final ResultView resultView = new ResultView();

    public Cars(List<String> carNames) {
        for (String carName : carNames) {
            list.add(new Car(carName));
        }
    }

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
        resultView.printInterimResult(this);
        for (int i = 0; i < attempt; i++) {
            for (Car car : list) {
                car.race();
            }
            resultView.printInterimResult(this);
        }
    }

    public List<String> getCarNames() {
        List<String> names = new ArrayList<>();
        for (Car car : list) {
            names.add(car.getName());
        }
        return names;
    }

    public List<Integer> getCarPositions() {
        List<Integer> positions = new ArrayList<>();
        for (Car car : list) {
            positions.add(car.getPosition());
        }
        return positions;
    }

    public int getCarsCount() {
        return list.size();
    }
}
