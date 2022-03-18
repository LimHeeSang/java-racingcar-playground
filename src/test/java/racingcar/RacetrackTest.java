package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class RacetrackTest {
    RaceTrack raceTrack;
    Cars cars = new Cars();
    String[] carNames;

    @BeforeEach
    void init() {
        carNames = new String[]{"k5", "k3", "pobi"};
        for (int i = 0; i < 3; i++) {
            cars.add(new Car(carNames[i]));
        }
        raceTrack = new RaceTrack(cars);
    }

    @Test
    @DisplayName("우승자 판단")
    void startRace() {
        List<String> winnerCarNames = raceTrack.startRace();

        for (int i = 0; i < winnerCarNames.size(); i++) {
            Assertions.assertThat(winnerCarNames.get(i)).isEqualTo(carNames[i]);
        }
    }
}
