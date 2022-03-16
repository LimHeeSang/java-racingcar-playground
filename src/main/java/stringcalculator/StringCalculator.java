package stringcalculator;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
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

    public List<Integer> parseStringToIntegerList(String text) {
        List<Integer> result = new ArrayList<>();
        String[] splited = text.split(",|:");

        for (String split : splited) {
            result.add(Integer.parseInt(split));
        }
        return result;
    }
}
