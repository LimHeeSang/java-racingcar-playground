package stringcalculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class StringOperation {
    @Test
    @DisplayName("빈 문자열 또는 null값일 경우 0을 반환")
    void check_empty_or_null_string() {
        String emptyString = "";
        String nullString = null;

        StringCalculator stringCalculator = new StringCalculator();
        int emptyResult = stringCalculator.isEmptyOrNullString(emptyString);
        int nullResult = stringCalculator.isEmptyOrNullString(nullString);
        int excepted = 0;

        Assertions.assertThat(emptyResult).isEqualTo(excepted);
        Assertions.assertThat(nullResult).isEqualTo(excepted);
    }
}
