package racingcar.domain;


public class RandomNumber {

    private int value;

    public RandomNumber(){
        this(createRandomNumber());
    }

    public RandomNumber(int value) {
        this.value = value;
    }

    private static int createRandomNumber() {
        return (int) (Math.random()*9);
    }

    public int getValue() {
        return value;
    }
}
