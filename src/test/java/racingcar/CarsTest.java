package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class CarsTest {
    @Test
    void findWinner() {
        Car k1 = new Car("k1", 1);
        Car k5 = new Car("k5", 3);
        Car pobi = new Car("pobi", 3);

        Cars cars = new Cars(Arrays.asList(k1, k5, pobi));
        List<Car> result = cars.findWinner();
        Assertions.assertThat(result).containsExactly(k5, pobi);
    }
}
