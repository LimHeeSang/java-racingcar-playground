package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PositionTest {
    @Test
    void create() {
        Position position = new Position(3);
        Assertions.assertThat(position).isEqualTo(new Position(3));
    }

    @Test
    @DisplayName("위치값이 음수일 때 검증")
    void valid_position() {
        Assertions.assertThatThrownBy(() -> new Position(-1)).isInstanceOf(IllegalArgumentException.class);
    }
}
