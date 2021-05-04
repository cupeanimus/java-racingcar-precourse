package racingcar;

import racingcar.domain.Racing;

import java.util.Arrays;
import java.util.Scanner;

public class RacingCar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분");
        String names = sc.next();
        System.out.println("시도할 횟수는 몇 회 인가요?");
        int totalRound = sc.nextInt();
        play(names,totalRound);
    }

    private static void play(String names, int totalRound) {
        Racing racing = Racing.setUp(Arrays.asList(names.split(",")));
        for (int i = 0; i < totalRound; i++) {
            racing.next();
        }
        racing.printWinner();
    }
}
