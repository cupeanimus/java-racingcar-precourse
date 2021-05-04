package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RoundTest {

    @DisplayName("횟수 이동 증가 결과 체크")
    @Test
    void RoundTest(){
        Round zero = new Round();
        assertThat(zero.getMovedTotal().getValue()).isEqualTo(0);

        Round one = zero.next(4);
        assertThat(one.getMovedTotal().getValue()).isEqualTo(1);

        Round two = one.next(3);
        assertThat(two.getMovedTotal().getValue()).isEqualTo(1);
    }

    @DisplayName("움직인 횟수 증가 체크")
    @Test
    void movedTotalPlusTest(){
        //given
        MovedTotal movedTotal = new MovedTotal();
        assertThat(movedTotal.getValue()).isEqualTo(0);

        //when
        MovedTotal addedTotal = movedTotal.add();

        //then
        assertThat(addedTotal.getValue()).isEqualTo(1);
    }

    @DisplayName("4~9 일때 여부 체크")
    @Test
    void isMoveTest(){
        assertFalse(new IsMovable(3).isMovable());
        assertTrue(new IsMovable(4).isMovable());
        assertTrue(new IsMovable(9).isMovable());
        assertFalse(new IsMovable(10).isMovable());
    }



}
