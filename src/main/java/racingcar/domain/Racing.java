package racingcar.domain;

import java.util.*;

public class Racing {

    private Cars cars;

    public Racing(Cars cars) {
        this.cars = cars;
    }

    public static Racing setUp(List<String> names) {
        checkDuplicated(names);
        List<Car> createdCars = new ArrayList<>();
        for (String name : names) {
            createdCars.add(new Car(name));
        }
        return new Racing(new Cars(createdCars));
    }

    private static void checkDuplicated(List<String> names) {
        Set<String> namesSet = new HashSet<>(names);
        if (names.size() > namesSet.size()){
            throw new IllegalArgumentException("중복된 이름이 있습니다");
        }
    }

    public Cars getCars() {
        return cars;
    }

    public void next() {
        for (Car car : cars.getCars()) {
            car.nextRound();
            car.printResult();
        }
        System.out.println();
    }

    public void printWinner() {
        cars.setWinners();
        List<String> winners = getWinners();
        System.out.println(Arrays.toString(winners.toArray()).replaceAll("\\[|\\]","") +"가 최종 우승했습니다.");
    }

    public void setWinners(){
        cars.setWinners();
    }

    public List<String> getWinners(){
        return cars.getWinners();
    }

}
