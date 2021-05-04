package racingcar.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    private Car car;

    @BeforeEach
    void set(){
        car = new Car("pobi");
    }

    @DisplayName("이름 가진 자동차 생성")
    @Test
    void createCarTest(){

        assertThat(car.getName().getValue()).isEqualTo("pobi");
    }

    @DisplayName("이동거리 출력")
    @Test
    void print(){
        assertThat(car.getRound().getValue()).isEqualTo(0);
        assertThat(car.getMovedTotal().getValue()).isEqualTo(0);
        assertThat(car.getName().getValue()).isEqualTo("pobi");

        car.nextRound();
        assertThat(car.getRound().getValue()).isEqualTo(1);
        assertThat(car.getMovedTotal().getValue()).isGreaterThanOrEqualTo(0);
        assertThat(car.getName().getValue()).isEqualTo("pobi");
    }




}
