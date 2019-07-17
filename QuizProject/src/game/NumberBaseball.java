package game;

import java.util.Random;
import java.util.Scanner;

public class NumberBaseball {

	public static void main(String[] args) {
		Random randomV1 = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자로 하는 야구게임시작");

		int com1 = 0;
		int com2 = 0;
		int com3 = 0;
		int count = 1;

		while (true) {
			com1 = randomV1.nextInt(9) + 1;
			com2 = randomV1.nextInt(10);
			com3 = randomV1.nextInt(10);
			if (com1 == com2 || com1 == com3 || com2 == com3) {
				continue;

			} else {
				break;
			}
		}
		int com = com1 * 100 + com2 * 10 + com3;

		while (true) {
			int strike = 0;
			int ball = 0;

			System.out.println("세자리 숫자를 입력하세요" + count + "회");

			int user1 = sc.nextInt();
			int user2 = sc.nextInt();
			int user3 = sc.nextInt();
			count++;
			System.out.printf("%d:%d:%d\n", user1, user2, user3);

			if (com1 == user1) {
				strike++;
			} else if (com1 == user2) {
				ball++;
			} else if (com1 == user3) {
				ball++;
			}
			if (com2 == user1) {
				ball++;
			} else if (com2 == user2) {
				strike++;
			} else if (com2 == user3) {
				ball++;
			}
			if (com3 == user1) {
				ball++;
			} else if (com3 == user2) {
				ball++;
			} else if (com3 == user3) {
				strike++;
			}
			System.out.println(com);
			System.out.printf("%d Strike   %d Ball\n", strike, ball);
			if (strike == 3) {
				System.out.println("YOU WIN!!!");
				break;

			}
		}

	}

}
