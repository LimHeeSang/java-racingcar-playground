package stringcalculator;

import java.util.Optional;

public class StringCalculator {

    public StringCalculator() {
    }

    public int isEmptyOrNullString(String text) {
        if (isNullOfString(text)) {
            return 0;
        }
        if (text.isEmpty()) {
            return 0;
        }
        return -1;
    }

    private boolean isNullOfString(String check) {
        return check == null;
    }
}
