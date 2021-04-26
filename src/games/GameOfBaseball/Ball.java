package games.GameOfBaseball;

public class Ball {
    private int firstNumber;
    private int secondNumber;
    private int thirdNumber;

    public Ball(int firstNumber, int secondNumber, int thirdNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
    }

    public int getBallCount(int num1, int num2, int num3) {
        int ball = 0;
        if (num1 == secondNumber || num1 == thirdNumber) {
            ball++;
        }

        if (num2 == firstNumber || num2 == thirdNumber) {
            ball++;
        }

        if (num3 == firstNumber || num3 == secondNumber) {
            ball++;
        }

        return ball;
    }
}
