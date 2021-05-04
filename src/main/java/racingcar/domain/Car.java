package racingcar.domain;

public class Car {
    private Name name;
    private MovedTotal movedTotal;
    private Round round;

    public Car(String name) {
        this.name = new Name(name);
        this.movedTotal = new MovedTotal(0);
        this.round = new Round(0);
    }

    public Name getName() {
        return name;
    }

    public MovedTotal getMovedTotal() {
        return movedTotal;
    }

    public Round getRound() {
        return round;
    }

    public void nextRound() {
        this.round = new Round(round.getValue() +1);
        if(isMovble()){
            this.movedTotal = movedTotal.add();
        }
    }

    private boolean isMovble() {
        int num = (int) (Math.random()*9);
        return num >= 4 && num <= 9;
    }
}
