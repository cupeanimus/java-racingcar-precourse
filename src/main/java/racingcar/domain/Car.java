package racingcar.domain;

public class Car {
    private Name name;
    private MovedTotal movedTotal;
    private Round round;
    private boolean isWinner;

    public Car(String name) {
        this.name = new Name(name);
        this.movedTotal = new MovedTotal(0);
        this.round = new Round(0);
    }

    public Car(String name, int movedTotal, int round) {
        this.name = new Name(name);
        this.movedTotal = new MovedTotal(movedTotal);
        this.round = new Round(round);
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

    private String getResult() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(name.getValue());
        buffer.append(" : ");
        for (int i = 0; i < movedTotal.getValue(); i++) {
            buffer.append("-");
        }
        return buffer.toString();
    }

    public boolean isWinner() {
        return isWinner;
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

    public void checkWinner(int max) {
        this.isWinner = movedTotal.getValue() == max ? true : false;
    }




}
