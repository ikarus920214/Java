package game;
import java.util.Random;
import java.util.Scanner;

public class RPS_Game {

	public static void main(String[] args) {
		// 와일문 true로 묶어서 생성 else if 0 입력시 break;
		// 랜덤수 2+1 생성
		// 1,2,3 에 가위 , 바위 , 보 선언
		// 스캐너로 1.2.3 중 하나 입력. switch case 써서 하면될듯
		// 디폴트로 잘못 입력했다고 적기.
		// 승부 출력 승리/패배/무승부
		//
		Scanner sc = new Scanner(System.in);

		Random r = new Random();
		int com;

		// 1 = 가위 2 바위 3 보

		while (true) {

			com = r.nextInt(3) + 1;
			System.out.println("무엇을 내겠습니까?(1: 가위 2:바위 3:보 0:종료) : ");
			int user = sc.nextInt();
			if (user > 3 || user < 0) {
				System.out.println("잘못 입력하셨습니다");

			} else if (com == 1 && user == 1) {
				System.out.println("사용자 : 가위, 컴퓨터 : 가위");
				System.out.println("비겼습니다.");

			} else if (com == 1 && user == 2) {
				System.out.println("사용자 : 바위, 컴퓨터 : 가위");
				System.out.println("이겼습니다.");

			} else if (com == 1 && user == 3) {
				System.out.println("사용자 : 보, 컴퓨터 : 가위");
				System.out.println("졌습니다.");

			} else if (com == 2 && user == 1) {
				System.out.println("사용자 : 가위, 컴퓨터 : 바위");
				System.out.println("졌습니다.");

			} else if (com == 2 && user == 2) {
				System.out.println("사용자 : 바위, 컴퓨터 : 바위");
				System.out.println("비겼습니다.");

			} else if (com == 2 && user == 3) {
				System.out.println("사용자 : 보, 컴퓨터 : 바위");
				System.out.println("이겼습니다.");

			} else if (com == 3 && user == 1) {
				System.out.println("사용자 : 가위, 컴퓨터 : 보");
				System.out.println("이겼습니다.");

			} else if (com == 3 && user == 2) {
				System.out.println("사용자 : 바위, 컴퓨터 : 보");
				System.out.println("졌습니다.");

			} else if (com == 3 && user == 3) {
				System.out.println("사용자 : 보, 컴퓨터 : 보");
				System.out.println("비겼습니다.");

			} else if (user == 0) {
				break;
			}
		}

	}

}
