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

    public void printResult() {
        System.out.println(getResult());
    }

    private String getResult() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(name.getValue());
        buffer.append(" : ");
        for (int i = 0; i < movedTotal.getValue(); i++) {
            buffer.append("-");
        }
        return buffer.toString();
    }
}
