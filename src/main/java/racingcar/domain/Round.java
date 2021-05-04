package racingcar.domain;

public class Round {

    private MovedTotal movedTotal;

    public Round(MovedTotal movedTotal) {
        this.movedTotal = movedTotal;
    }

    public Round() {
        this.movedTotal = new MovedTotal();
    }

    public Round next(){
        int num = createNum();
        if (isMovable(num)){
            this.movedTotal = movedTotal.add();
        }
        return this;
    }

    public Round next(int num){
        if (isMovable(num)){
            this.movedTotal = movedTotal.add();
        }
        return this;
    }

    private boolean isMovable(int num) {
        return num >= 4 && num <= 9;
    }

    private int createNum() {
        return (int) (Math.random()*9);
    }

    public MovedTotal getMovedTotal() {
        return movedTotal;
    }
}
