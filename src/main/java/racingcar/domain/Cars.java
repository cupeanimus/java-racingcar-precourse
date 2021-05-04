package racingcar.domain;

import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    private List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setWinners() {
        int maxMovedTotal = getMaxMovedTotal();
        for (Car car : cars) {
            car.checkWinner(maxMovedTotal);
        }
    }

    private int getMaxMovedTotal() {
        int max = 0;
        for (Car car : cars) {
            max = Math.max(max, car.getMovedTotal().getValue());
        }
        return max;
    }

    public List<String> getWinners() {
        Winner winner = new Winner();
        for (Car car : cars) {
            winner.add(car);
        }
        return winner.getWinners();
    }
}
