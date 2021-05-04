package racingcar.domain;

public class IsMovable {

    boolean movable;

    public IsMovable(int randomValue) {
        this.movable = check(randomValue);
    }

    public static boolean check(int randomValue) {
        return randomValue >= 4 && randomValue <= 9;
    }

    public boolean isMovable() {
        return movable;
    }
}
