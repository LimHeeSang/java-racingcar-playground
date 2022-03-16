package stringcalculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringOperation {
    private final StringCalculator stringCalculator = new StringCalculator();

    @Test
    @DisplayName("빈 문자열 또는 null값일 경우 0을 반환")
    void check_empty_or_null_string() {
        String emptyString = "";
        String nullString = null;

        int emptyResult = stringCalculator.isEmptyOrNullString(emptyString);
        int nullResult = stringCalculator.isEmptyOrNullString(nullString);
        int excepted = 0;

        Assertions.assertThat(emptyResult).isEqualTo(excepted);
        Assertions.assertThat(nullResult).isEqualTo(excepted);
    }

    @Test
    @DisplayName("문자열에서 각 숫자들을 파싱하여 Integer 리스트에 담아서 반환")
    void parse_string_to_integer_list() {
        String text = "1,2:3";
        List<Integer> expected = Arrays.asList(1, 2, 3);

        List<Integer> actual = stringCalculator.parseStringToIntegerList(text);

        for (int i = 0; i < expected.size(); i++) {
            Assertions.assertThat(actual.get(i)).isEqualTo(expected.get(i));
        }
    }

    @Test
    @DisplayName("Integer list에서 각 숫자의 합을 반환")
    void add_integer_list() {
        List<Integer> list = Arrays.asList(1, 2, 3);
        int sum = stringCalculator.sumOfIntegerList(list);

        Assertions.assertThat(sum).isEqualTo(6);
    }
}
