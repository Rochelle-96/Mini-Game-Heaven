package PlayGame;

import games.GameOfBaseball.Baseball;
import games.GameOfGugu.Gugudan;
import games.GameOfRockPaperScissors.RSPMain;
import setting.GameDisplay;

import java.util.Scanner;

public class GameTool {
    Scanner sc = new Scanner(System.in);
    GameDisplay gameDisplay = new GameDisplay();
    Baseball baseball = new Baseball();
    Gugudan gameOfGugu = new Gugudan();
    RSPMain rspMain = new RSPMain();

    private int count = 0;

    public void GameTool(int select){
        switch (select) {
            case 1: // 숫자야구게임 선택
                gameDisplay.whenSelectBaseball();
                if (sc.nextInt() == 1) {
                    gameDisplay.explainYesGameOfBaseball();
                } else {
                    gameDisplay.explainNoGameOfBaseball();
                }
                gameDisplay.startgame();
                baseball.game();
                //숫자야구 게임넣음 됨
                break;
            case 2: // 구구단게임 선택
                gameDisplay.whenSelectGameOfGugu();
                if(sc.nextInt() == 1) {
                    gameDisplay.explainYesGameOfGugu();
                } else {
                    gameDisplay.explainNoGameOfGugu();
                }
                gameDisplay.startgame();
                gameOfGugu.game();
                //구구단 게임 넣음 됨
                break;
            case 3 : // 가위바위보게임 선택
                gameDisplay.whenSelectGameOfRockPaperScissors();
                if(sc.nextInt() == 1) {
                    gameDisplay.explainYesGameOfRockPaperScissors();
                } else {
                    gameDisplay.explainNoGameOfRockPaperScissors();
                }
                gameDisplay.startgame();
                rspMain.game();
                //묵찌빠 게임 넣음 됨
                break;
        }
    }

    public int getCount(){
        return this.count;
    }

    public void setCount(int count){
        this.count += count;
    }
}
