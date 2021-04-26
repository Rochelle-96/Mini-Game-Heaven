package games.GameOfBaseball;

public class Strike {
    private int firstNumber;
    private int secondNumber;
    private int thirdNumber;

    public Strike(int firstNumber, int secondNumber, int thirdNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
    }

    public int getStrikeCount(int num1, int num2, int num3) {
        int strike = 0;
        if (num1 == firstNumber) {
            strike++;
        }

        if (num2 == secondNumber) {
            strike++;
        }

        if (num3 == thirdNumber) {
            strike++;
        }

        return strike;
    }
}
