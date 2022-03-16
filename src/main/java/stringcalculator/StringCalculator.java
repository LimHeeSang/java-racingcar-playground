package stringcalculator;

import java.util.*;
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
        String[] splited = text.split(",|:");

        return changeStringArrayToIntegerList(splited);
    }

    private List<Integer> changeStringArrayToIntegerList(String[] splited) {
        List<Integer> result = new ArrayList<>();

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

    public Optional<List<Integer>> parseCustomStringToIntegerList(String text) {
        Matcher m = Pattern.compile("//.\n(.*)").matcher(text);
        String customDelimiter = parseCustomDelimiter(text).orElseThrow(NoSuchElementException::new);

        if (m.find()) {
            String[] tokens = m.group(1).split(customDelimiter);
            System.out.println(Arrays.toString(tokens));
            return Optional.of(changeStringArrayToIntegerList(tokens));
        }
        return Optional.empty();
    }
}
