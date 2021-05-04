package racingcar.domain;

public class MovedTotal {
    private int value;

    public MovedTotal(int value) {
        this.value = value;
    }

    public MovedTotal() {
        this.value = 0;
    }

    public MovedTotal add(){
        return new MovedTotal(this.value + 1);
    }

    public int getValue() {
        return value;
    }
}
