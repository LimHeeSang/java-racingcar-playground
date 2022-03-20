package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    @DisplayName("자동차가 전진했는지 검증")
    void move() {
        Car car = new Car("pobi");
        Position previousPosition = car.getPosition();
        Position nextPosition = car.move(() -> true);

        Assertions.assertThat(nextPosition).isEqualTo(previousPosition.increase());
    }

    @Test
    @DisplayName("자동차가 정지했는지 검증")
    void stop() {
        Car car = new Car("pobi");
        Position previousPosition = car.getPosition();
        Position nextPosition = car.move(() -> false);

        Assertions.assertThat(nextPosition).isEqualTo(previousPosition);
    }
}
