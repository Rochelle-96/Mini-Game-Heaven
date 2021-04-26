package setting;


public class GameDisplay {

	public void showIntro() { // 인트로 메세지. 여기 천천히나오게 꾸밀거임.
		System.out.println("");

	}

	public void showExplainRuleGameOfBaseball() { // 게임 어떻게돌아가는지 설명
		System.out.println("어서오세요. 이 게임의 룰을 알려드리겠습니다. ");
		System.out.println("이 게임은 한개의 스테이지를 클리어 할때마다 한개씩 동그라미를 지우게 됩니다.");
		System.out.println("또, 선택한 스테이지를 클리어하지 못하면 게임은 끝이납니다.");
		System.out.println("그리고, 각 스테이지마다 일정 시간이 주어지는데 그 시간안에 끝내지 못할 경우에도 게임이 끝이납니다.");
		System.out.println("준비 되셨나요?");
		System.out.println("1. Yes / 2. No");
	}

	public void showNoExplainRule() { // 설명 듣기 X
		System.out.println("이 설명을 들은 이상 그냥 게임을 끝낼 수 없어. 그럼 시작하도록하지." + "\n");

	}

	public void showYesExplainRule() { // 설명 듣기 O
		System.out.println("그럼 게임을 시작하도록 하지." + "\n");

	}

	public void showMenu() { // 게임 메뉴 선택지
		System.out.println("=========================================================");
		System.out.println("|							        					|");
		System.out.println("|	1. 숫자야구게임	2. 2초구구단   3. 가위바위보	4. 종료	|");
		System.out.println("|							        					|");
		System.out.println("=========================================================");
	}


	public void whenSelectBaseball() {
		System.out.println("야구 게임을 선택했군. 그럼 게임을 시작해보도록 할까?");
		System.out.println("시작하기에 앞서 게임 설명을 들으시겠습니까?");
		System.out.println("1. Yes / 2. No");
	}
	
	public void explainYesGameOfBaseball () {
		System.out.println("숫자야구게임은 입력받은 숫자와 정답변수 3개를 순서대로 비교하는 게임이다.");
		System.out.println("숫자 번호와 자리가 모두 같으면 Strike, 숫자 번호만 같으면 Ball이다.");
		System.out.println("그럼 게임설명을 들었으니 시작하도록 하자." + "\n");
	}
	
	public void explainNoGameOfBaseball () {
		System.out.println("좋아. 어떤게임인지 아는것 같군. 시작하도록 하자." + "\n");
	}

	public void whenSelectGameOfGugu() {
		System.out.println("2초 구구단 게임을 선택했군. 그럼 게임을 시작해보도록 할까?");
		System.out.println("시작하기에 앞서 게임 설명을 들으시겠습니까?");
		System.out.println("1. Yes / 2. No");
	}

	public void explainYesGameOfGugu() {
		System.out.println("");
		System.out.println("");
		System.out.println("" + "\n");
	}

	public void explainNoGameOfGugu(){
		System.out.println("좋아. 어떤게임인지 아는것 같군. 시작하도록 하자.");
	}
	
	public void whenSelectGameOfRockPaperScissors() {
		System.out.println("끝말잇기 게임을 선택했군. 그럼 게임을 시작해보도록 할까?");
		System.out.println("시작하기에 앞서 게임 설명을 들으시겠습니까?");
		System.out.println("1. Yes / 2. No");
	}

	public void explainYesGameOfRockPaperScissors(){
		System.out.println("");
		System.out.println("");
		System.out.println("" + "\n");
	}

	public void explainNoGameOfRockPaperScissors(){
		System.out.println("좋아. 어떤게임인지 아는것 같군. 시작하도록 하자.");
	}

	public void startgame(){
		System.out.println("<<게임을 시작하겠습니다.>>");
	}

	public void winMessage(){
		System.out.println("미니게임천당을 지배하셨습니다.");
	}

	public void loseMessage(){
		System.out.println("미니게임천당을 지배하는데 실패하셨습니다.");
	}
}
// 목요일 시험
// 18일 한시가닝찍 끝나고 월요일 한시간늦게끝남
// 각 게임 넣기
// 1번 선택하면 다음엔 선택못하게
// 설명 못쓴거 마저 써넣기