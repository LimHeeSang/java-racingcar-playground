package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> cars;

    public Cars(List<Car> list) {
        this.cars = list;
    }

    public List<Car> findWinner() {
        return findWinner(getMaxPosition());
    }

    private List<Car> findWinner(Position maxPosition) {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.isEqualPosition(maxPosition)) {
                result.add(car);
            }
        }
        return result;
    }

    private Position getMaxPosition() {
        Position maxPosition = new Position();
        for (Car car : cars) {
            if (car.isMaxPositionThan(maxPosition)) {
                maxPosition = car.getPosition();
            }
        }
        return maxPosition;
    }

    public void move(MovingStrategy movingStrategy) {
        for (Car car : cars) {
            car.move(movingStrategy);
        }
    }

    public List<Car> getCars() {
        return cars;
    }
}
