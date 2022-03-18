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
            for (int j = 0; j < carPositions.size(); i++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
