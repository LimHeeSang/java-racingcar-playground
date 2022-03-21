package racingcar;

import java.util.ArrayList;
import java.util.List;

public class RaceTrack {
    private final Cars cars;
    private TryNo tryNo;

    public RaceTrack(String carNames) {
        this(carNames, 0);
    }

    public RaceTrack(String carNames, int tryNumber) {
        List<Car> list = makeCarList(carNames);
        cars = new Cars(list);
        this.tryNo = new TryNo(tryNumber);
    }

    private List<Car> makeCarList(String carNames) {
        String[] names = carNames.split(",");
        List<Car> list = new ArrayList<>();
        for (String name : names) {
            list.add(new Car(name));
        }
        return list;
    }

    protected List<Car> race(MovingStrategy movingStrategy) {
        cars.move(movingStrategy);
        decreaseTryNo();
        return getCars();
    }

    private void decreaseTryNo() {
        tryNo.decrease();
    }

    public boolean isEnd() {
        return tryNo.isZero();
    }

    public List<Car> getWinners() {
        return cars.findWinner();
    }

    public List<Car> getCars() {
        return cars.getCars();
    }
}
