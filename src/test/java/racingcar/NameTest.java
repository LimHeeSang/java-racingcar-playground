package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NameTest {
    @Test
    @DisplayName("자동차 이름이 5글자를 초과하는지 검증")
    void valid_car_name() {
        Assertions.assertThatThrownBy(() -> new Car("sonata")).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("차이름은 존재하는지 검증")
    void valid_car_emptyName() {
        Assertions.assertThatThrownBy(() -> new Car("")).isInstanceOf(IllegalArgumentException.class);
    }
}
