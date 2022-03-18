package racingcar;

import java.util.List;

public class RaceTrack {
    private int raceAttempt;
    private final Cars cars;

    public RaceTrack(Cars cars) {
        this.cars = cars;
    }

    public List<String> startRace() {
        cars.raceByAttempt(raceAttempt);
        int maxPosition = cars.getMaxPosition();
        return cars.getEqualPositionCarNames(maxPosition);
    }
}
