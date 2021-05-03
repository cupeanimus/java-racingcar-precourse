package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RandomNumberTest {

    @DisplayName("1~9 사이 숫자 생성 검증")
    @Test
    void create_roundNumTest(){
//        for (int i = 0; i < 1000; i++) {
            RandomNumber one = new RandomNumber();
            System.out.println(one.getValue());
            assertTrue(one.getValue() >= 0 && one.getValue() <= 9);
//        }
    }



}
