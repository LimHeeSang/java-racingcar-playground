package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class RaceTrackTest {
    @Test
    @DisplayName("주어진 회수만큼 자동차 move")
    void race() {
        String carNames = "pobi,crong,honux";
        RaceTrack raceTrack = new RaceTrack(carNames);

        List<Car> result = raceTrack.race(() -> true);
        for (Car car : result) {
            Assertions.assertThat(car.getPosition()).isEqualTo(new Position(1));
        }
    }
}