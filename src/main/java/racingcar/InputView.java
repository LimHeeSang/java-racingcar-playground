package racingcar;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private final Scanner scanner = new Scanner(System.in);

    public List<String> introduce() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String carNames = scanner.nextLine();
        String[] splitedCarNames = carNames.split(",");
        return Arrays.asList(splitedCarNames);
    }

    public int inputRaceAttempt() {
        System.out.println("시도할 회수는 몇회인가요?");
        Scanner sc = new Scanner(System.in);
        int attempt = sc.nextInt();
        System.out.println();
        return attempt;
    }
}
