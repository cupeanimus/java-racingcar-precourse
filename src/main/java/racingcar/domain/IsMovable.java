package racingcar.domain;

import java.util.Random;

public class IsMovable {

    boolean movable;

    public IsMovable(int randomValue) {
        this.movable = checkRange(randomValue);
    }

    public IsMovable() {
        this((int) (Math.random()*9));
    }

    private boolean checkRange(int randomValue) {
        return randomValue >= 4 && randomValue <= 9;
    }

    public boolean isMovable() {
        return movable;
    }
}
