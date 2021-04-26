package games.GameOfRockPaperScissors;

public class RSPMessage {
    public void intro(){
        System.out.println("3번째 게임에 대해서 설명드리겠습니다.");
        System.out.println("이 게임은 가위바위보를 3번 연속으로 이겨야 승리하실 수 있습니다.");
        System.out.println("한번이라도 지거니 비기면 게임에서 패배입니다.");
        System.out.println("화이팅 하십쇼!" + "\n");
    }

    public void computerRSP(){
        System.out.println("컴퓨터가 묵찌빠를 생각하고 있습니다." + "\n");
    }

    public void myRSP(){
        System.out.print("(1)묵 (2)찌 (3)빠 선택하십시오 => ");
    }

    public void winMessage(){
        System.out.println("게임에서 승리하셨습니다.");
    }

    public void loseMessage(){
        System.out.println("게임에서 패배하셨습니다.");
    }

}
