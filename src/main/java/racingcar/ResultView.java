package racingcar;

import java.util.List;

public class ResultView {
    public static void startPrint(List<Car> cars) {
        System.out.println("실행 결과");
        printCars(cars);
    }

    public static void printCars(List<Car> cars) {
        for (Car car : cars) {
            System.out.print(car.getName() + " : ");
            printDash(car);
        }
        System.out.println();
    }

    private static void printDash(Car car) {
        for (int i = 0; i < car.getIntPosition(); i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void printWinner(List<Car> winners) {
        StringBuilder sb = new StringBuilder();
        for (Car winner : winners) {
            sb.append(winner.getName()).append(", ");
        }
        System.out.println(sb.substring(0, sb.length() - 2).concat("가 최종 우승했습니다."));
    }
}
