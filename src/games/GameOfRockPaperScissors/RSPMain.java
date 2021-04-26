package games.GameOfRockPaperScissors;


import PlayGame.GameCount;
import PlayGame.GameTool;
import setting.GameInterface;

import java.util.Random;
import java.util.Scanner;

public class RSPMain implements GameInterface {
    GameCount gameCount = new GameCount();

    public void game() {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        RSPMessage rspmessage = new RSPMessage();
        RSPCalculate rspcalculate = new RSPCalculate();
        RSPCount rpscount = new RSPCount();


        rspmessage.intro();

        for(int i = 1; i <= 3; i++ ){

            rspmessage.computerRSP();
            int computerRSP = random.nextInt(2) + 1;

            rspmessage.myRSP();
            int myRSP = sc.nextInt();

            rspcalculate.RSPcalculation(computerRSP, myRSP);
        }

        if(rpscount.getCount() == 3){
            rspmessage.winMessage();
            count(1);
        } else {
            rspmessage.loseMessage();
        }


    }

    @Override
    public void count(int gamePoint) {
        gameCount.setCount(gamePoint);
    }

}
