package racingcar;

import java.util.List;

public class RacingMain {
    public static void main(String[] args) {
        String carNames = InputView.getCarNames();
        int tryNumber = InputView.getTryNumber();

        RaceTrack raceTrack = new RaceTrack(carNames, tryNumber);
        ResultView.startPrint(raceTrack.getCars());

        while (!raceTrack.isEnd()) {
            List<Car> carList = raceTrack.race(new RandomMovingStrategy());
            ResultView.printCars(carList);
        }
        ResultView.printWinner(raceTrack.getWinners());
    }
}
