package racingcar;

import java.util.List;

public class RacingCarController {
    InputView inputView = new InputView();
    ResultView resultView = new ResultView();
    Cars cars;
    RaceTrack raceTrack;

    public void startRacingCar() {
        List<String> carNames = inputView.introduce();
        int raceAttempt = inputView.inputRaceAttempt();

        cars = new Cars(carNames);
        raceTrack = new RaceTrack(cars);

        List<String> winnerCarNames = raceTrack.startRace(raceAttempt);
        resultView.printFinalResult(winnerCarNames);
    }

    public static void main(String[] args) {
        RacingCarController controller = new RacingCarController();
        controller.startRacingCar();
    }
}
