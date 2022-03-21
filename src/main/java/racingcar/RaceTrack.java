package racingcar;

import java.util.ArrayList;
import java.util.List;

public class RaceTrack {
    private final Cars cars;

    public RaceTrack(String carNames) {
        List<Car> list = makeCarList(carNames);
        cars = new Cars(list);
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
        return cars.getCars();
    }
}
