package racingcar;

import java.util.List;

public class ResultView {
    public void printInterimResult(Cars cars) {
        System.out.println("실행결과");
        List<String> carNames = cars.getCarNames();
        List<Integer> carPositions = cars.getCarPositions();
        int count = cars.getCarsCount();

        for (int i = 0; i < count; i++) {
            System.out.print(carNames.get(i) + " : ");
            for (int j = 0; j < carPositions.get(i); j++) {
                System.out.print("-");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void printFinalResult(List<String> winnerCarNames) {
        for (int i = 0; i < winnerCarNames.size(); i++) {
            if (i == winnerCarNames.size() - 1) {
                System.out.print(winnerCarNames.get(i));
                break;
            }
            System.out.print(winnerCarNames.get(i) + ", ");
        }
        System.out.println("가 최종 우승했습니다.");
    }
}
