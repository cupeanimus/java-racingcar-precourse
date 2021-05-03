package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RoundTest {

    @DisplayName("4~9 일때 여부 체크")
    @Test
    void isMoveTest(){
        assertFalse(new IsMovable(3).isMovable());
        assertTrue(new IsMovable(4).isMovable());
        assertTrue(new IsMovable(9).isMovable());
        assertFalse(new IsMovable(10).isMovable());
    }

}
