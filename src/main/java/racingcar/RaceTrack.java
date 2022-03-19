package racingcar;

import java.util.List;

public class RaceTrack {
    private final Cars cars;

    public RaceTrack(Cars cars) {
        this.cars = cars;
    }

    public List<String> startRace(int raceAttempt) {
        cars.raceByAttempt(raceAttempt);
        int maxPosition = cars.getMaxPosition();
        return cars.getEqualPositionCarNames(maxPosition);
    }
}
