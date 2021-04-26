package PlayGame;


import setting.GameDisplay;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        GameTool gameTool = new GameTool();
        GameCount gameCount = new GameCount();
        GameDisplay gameDisplay = new GameDisplay();
        Scanner sc = new Scanner(System.in);

        gameDisplay.showIntro();

        gameDisplay.showExplainRuleGameOfBaseball();
        if (sc.nextInt() == 1) {
            gameDisplay.showYesExplainRule();
        } else {
            gameDisplay.showNoExplainRule();
        }


        for(int i = 1; i <= 3; i++) {
            gameDisplay.showMenu();
            int select = sc.nextInt();

            if(select == 4){
                break;
            }
            gameTool.GameTool(select);

        }

        if(gameCount.getCount() == 3){
            gameDisplay.winMessage();
        } else {
            gameDisplay.loseMessage();
        }
    }
}

