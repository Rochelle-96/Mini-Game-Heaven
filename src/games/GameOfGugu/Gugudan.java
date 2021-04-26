package games.GameOfGugu;

import PlayGame.GameCount;
import setting.GameInterface;

import java.util.Random;
import java.util.Scanner;


public class Gugudan implements GameInterface {
    GameCount gameCount = new GameCount();

    public void game() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int result;
        int firstNumber; // 변수 2~9
        int secondNumber; // 곱해지는 변수 1~9
        int point = 0;

        System.out.println("2초 구구단 맞춰보셈ㅋ 하나라도 틀리면 넌 죽어있을것이다.");

        for (int i = 0; i < 5; i++) {
            System.out.println(5-i + "번 남았다.");

            firstNumber = rand.nextInt(7) + 2;
            secondNumber = rand.nextInt(8) + 1;
            long startTime = System.currentTimeMillis();

            System.out.print(firstNumber + "x" + secondNumber + " = ");
            result = sc.nextInt();
            long endTime = System.currentTimeMillis();

            if ((result == firstNumber * secondNumber) && ((endTime - startTime)/1000.0) <= 2) {
                System.out.println("올ㅋ");
                point++;
                continue;

            } else if ((endTime - startTime) / 1000.0 > 2) {
                System.out.println("??? : 왜이렇게 늦어! 생각 문제있어?");
                break;

            } else {
                // result = firstNumber * secondNumber; 안쓰는거
                System.out.println("님 머함; 빵야! 넌 죽어있다.");
                break;
            }
        }
        if(point == 5){
            count(1);
        } else {
            System.out.println("게임에서 졌습니다.");
        }

    }

    @Override
    public void count(int gamePoint) {
        gameCount.setCount(gamePoint);
    }
}


// 맞추면 5번까지 계속, 틀리면 게임 끝내는데까지 만들었음.
// 나중에 다맞추면 보너스카운터 1 추가, 틀리면 카운터 개수에 맞게 게임 끝나는 멘트 출력시키면됨.
// 2초를 생각안했다 이맨이야!

/*		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
*/
