package stringcalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    public int checkEmptyOrNullString(String text) {
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

    public int sumOfIntegerList(List<Integer> list) {
        int sum = 0;
        for (int temp : list) {
            sum += temp;
        }
        return sum;
    }

    public Optional<String> parseCustomDelimiter(String text) {
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
        if (m.find()) {
            String customDelimiter = m.group(1);
            return Optional.of(customDelimiter);
        }
        return Optional.empty();
    }


}
