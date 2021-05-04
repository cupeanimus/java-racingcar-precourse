package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Winner {
    private List<String> winners = new ArrayList<>();

    public void add(Car car) {
        if (car.isWinner()){
            winners.add(car.getName().getValue());
        }
    }

    public List<String> getWinners() {
        return winners;
    }
}
