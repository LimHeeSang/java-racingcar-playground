package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarTest {
    Car testCar = new Car("pobi");

    @Test
    @DisplayName("자동차 이름이 5글자를 초과하면 예외")
    void car() {
        Assertions.assertThatThrownBy(() -> new Car("abcdef"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("0~9사이의 랜덤값 반환")
    void makeRandom() {
        int actual = testCar.makeRandomInt();
        assertTrue(actual >= 0 && actual <= 9);
    }

    @Test
    @DisplayName("구한 랜덤값이 4이상일 때 전진")
    void race() {
        int previousPosition = testCar.getPosition();
        int nextPosition = testCar.race();
        assertTrue(nextPosition == previousPosition || nextPosition == previousPosition + 1);
    }
}
