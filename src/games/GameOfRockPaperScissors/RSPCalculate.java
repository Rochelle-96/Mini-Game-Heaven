package games.GameOfRockPaperScissors;

public class RSPCalculate {
    RSPCount rspcount = new RSPCount();
    int count = 0;

    public void RSPcalculation(int computerRSP, int myRSP){

        switch(computerRSP){
            case 1 : // 컴퓨터가 묵냄
                if(myRSP == 1){
                    System.out.println("비기셨습니다.");
                    break;
                } else if(myRSP == 2){
                    System.out.println("졌습니다.");
                    break;
                } else if( myRSP == 3){
                    System.out.println("이겼습니다.");
                    count += 1;
                    rspcount.setCount(count);
                    break;
                } else {
                    System.out.println("잘못눌렀으면 진겁니다!");
                }

            case 2 : // 컴퓨터가 찌냄
                if(myRSP == 2){
                    System.out.println("비기셨습니다.");
                    break;
                } else if(myRSP == 3){
                    System.out.println("졌습니다.");
                    break;
                } else if( myRSP == 1){
                    System.out.println("이겼습니다.");
                    count += 1;
                    rspcount.setCount(count);
                    break;
                } else {
                    System.out.println("잘못눌렀으면 진겁니다!");
                }

            case 3 : // 컴퓨터가 빠냄
                if(myRSP == 3){
                    System.out.println("비기셨습니다.");
                    break;
                } else if(myRSP == 1){
                    System.out.println("졌습니다.");
                    break;
                } else if( myRSP == 2){
                    System.out.println("이겼습니다.");
                    count += 1;
                    rspcount.setCount(count);
                    break;
                } else {
                    System.out.println("잘못눌렀으면 진겁니다!");
                }
        }
    }
}
