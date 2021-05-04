package racingcar.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class RacingTest {


    @DisplayName("경주 자동차 생성")
    @Test
    void createCarsTest(){

        Racing racing = Racing.setUp(Arrays.asList("pobi","crong","honux"));

        assertThat(racing.getCars().getCars().get(0).getName().getValue()).isEqualTo("pobi");
        assertThat(racing.getCars().getCars().get(0).getName().getValue()).isEqualTo("pobi");
    }

    @DisplayName("생성시 중복 이름 있을 때")
    @Test
    void createDuplicatedNameTest(){
        assertThatIllegalArgumentException().isThrownBy(() -> Racing.setUp(Arrays.asList("pobi","crong","pobi")));
    }

    @DisplayName("주어진 횟수만큼 게임 진행")
    @Test
    void racingStrartTest(){
        int round = 5;
        Racing racing = Racing.setUp(Arrays.asList("pobi","crong","honux"));
        for (int i = 0; i < round; i++) {
            racing.next();
        }
        assertThat(racing.getCars().getCars().get(0).getRound().getValue()).isEqualTo(5);

    }

    @DisplayName("결과 출력")
    @Test
    void printRacingWinnerTest(){
        List<Car> cars = Arrays.asList(
                new Car("pobi",5,5)
                , new Car("crong",4,5)
                , new Car("honux",5,5));

        Racing racing = new Racing(new Cars(cars));
        racing.printWinner();

    }



    //해당 메서드를 어떻게 검증해야할지 잘 모르겠음
//    @DisplayName("다음 횟수 진행")
//    @Test
//    void nextRoundTest(){
//        Racing racing = Racing.setUp(Arrays.asList("pobi","crong","honux"));
//        racing.next();
//    }
//
//    @DisplayName("실행 결과 출력")
//    @Test
//    void printResult(){
//        Racing racing = Racing.setUp(Arrays.asList("pobi","crong","honux"));
//        racing.printResult();
//    }




}
