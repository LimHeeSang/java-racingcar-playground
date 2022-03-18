package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    @DisplayName("자동차 이름이 5글자를 초과하면 예외")
    void car() {
        Assertions.assertThatThrownBy(() -> new Car("abcdef"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("0~9사이의 랜덤값 반환")
    void makeRandom() {
        Car car = new Car("pobi");
        int actual = car.makeRandomInt();
        org.junit.jupiter.api.Assertions.assertTrue(actual >= 0 && actual <= 9);
    }
}
