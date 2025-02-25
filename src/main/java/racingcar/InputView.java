package racingcar;

import java.util.Scanner;

abstract class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        return scanner.nextLine();
    }

    public static int getTryNumber() {
        System.out.println("시도할 회수는 몇회인가요?");
        int tryNo = scanner.nextInt();
        System.out.println();
        return tryNo;
    }
}
