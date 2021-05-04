package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class WinnerTest {

    @DisplayName("우승자 선정")
    @Test
    void WinnerTest(){
        Winner winner = new Winner();
        List<Car> cars = Arrays.asList(
                new Car("pobi",5,5)
                , new Car("crong",4,5)
                , new Car("honux",5,5));

        Racing racing = new Racing(new Cars(cars));
        racing.setWinners();

        for (Car car : cars) {
            winner.add(car);
        }

        assertThat(winner.getWinners()).containsExactlyInAnyOrder("pobi","honux");

    }

}
