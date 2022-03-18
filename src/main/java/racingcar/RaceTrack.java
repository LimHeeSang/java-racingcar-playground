package racingcar;

import java.util.List;

public class RaceTrack {
    private final Cars cars;

    public RaceTrack(Cars cars) {
        this.cars = cars;
    }

    public int getMaxPosition() {
        return cars.getMaxPosition();
    }


    public List<String> startRace() {
        int maxPosition = getMaxPosition();
        return cars.getEqualPositionCarNames(maxPosition);
    }
}
