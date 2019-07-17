package game;
import java.util.Random;
import java.util.Scanner;

public class HighLow {

	public static void main(String[] args) {
		// 랜덤수를 뽑는다
		// while(true) 박고 count 6회부터 --로 0되면 게임 over
		//
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int i = 6;
		int count = 6;
		System.out.println("나는 지금 0부터 100 사이의 값 중에 하나를 생각하겠습니다.");
		System.out.println("당신은 그 숫자를 6회안에 맞추시면 됩니다.");
		int com = r.nextInt(101);

		for (i = 6; i >= 1; i--) {
			System.out.println("몇이라고 생각합니까? (0 to 100)");
			int user = sc.nextInt();
			count--;
			if (com == user) {
				System.out.printf("%d 는 정답입니다. 축하합니다.\n", user);
			} else if (com > user) {
				System.out.printf("%d 는 제가 정한 수보다 작습니다.\n", user);
				System.out.printf("%d 의 기회가 남았습니다.\n", count);

			} else if (com < user) {
				System.out.printf("%d 는 제가 정한 수 보다 큽니다.\n", user);
				System.out.printf("%d 의 기회가 남았습니다.\n", count);

			}

		}System.out.println("게임을 더 진행하시겠습니까? (y/n)");
		String str = sc.next();
		if (!str.equalsIgnoreCase("y")) {
			System.out.println("Good bye~");
			count =6;
			i = 6;
		}
	}

}
