package games.GameOfBaseball;


import PlayGame.GameCount;
import setting.GameInterface;

import java.util.Random;
import java.util.Scanner;

public class Baseball implements GameInterface {
    int point = 0;
    GameCount gameCount = new GameCount();

    @Override
    public void game() {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int firstNumber = random.nextInt(8) + 1;
        int secondNumber = random.nextInt(8) + 1;
        int thirdNumber = random.nextInt(8) + 1;
        Strike strike = new Strike(firstNumber, secondNumber, thirdNumber);
        Ball ball = new Ball(firstNumber, secondNumber, thirdNumber);

        while (true) {
            if ((firstNumber != secondNumber) && (firstNumber != thirdNumber) && (secondNumber != thirdNumber)) {
                break;
            } else if ((firstNumber == secondNumber) && (firstNumber == thirdNumber) && (secondNumber == thirdNumber)) {
                continue;
            }
        }

        for (int i = 10; i > 0; i--) {
            System.out.println("총 " + i + "번의 기회가 남았습니다.");

            System.out.println("첫 번째 숫자 : ");
            int num1 = sc.nextInt();

            System.out.println("두 번째 숫자 : ");
            int num2 = sc.nextInt();

            System.out.println("세 번째 숫자 : ");
            int num3 = sc.nextInt();

            int strikeCount = strike.getStrikeCount(num1, num2, num3);
            int ballCount = ball.getBallCount(num1, num2, num3);

            if (strikeCount == 3) {
                System.out.println("정답입니다.");
                point++;
                count(1);
                break;
            }

            System.out.println(strikeCount + " Strike, " + ballCount + " ball 입니다.");
            if(strikeCount == 3){
                point++;
                count(1);
            }

        }

    }

    @Override
    public void count(int gamePoint) {
        gameCount.setCount(gamePoint);
    }
}
