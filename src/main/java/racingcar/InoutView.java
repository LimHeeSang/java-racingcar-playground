package racingcar;

import java.util.Scanner;

public class InoutView {
    private final Scanner scanner = new Scanner(System.in);

    public String getCarNames() {
        return scanner.nextLine();
    }

    public int getTryNumber() {
        return scanner.nextInt();
    }
}
