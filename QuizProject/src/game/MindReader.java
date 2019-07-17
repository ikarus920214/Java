package game;
import java.util.Scanner;

public class MindReader {

	public static void main(String[] args) {
//		게임설명 :
//			내가 생각한 숫자를 컴퓨터가 맞춘다.
//			내가 생각한 숫자보다 크면 h 라고 입력한다.
//			내가 생각한 숫자보다 작으면 l 이라고 입력한다.
//			내가 생각한  숫자와 같으면 y 라고 입력한다.
// 		작은수 + 큰수 / 2  = 중간값
		// 변수를 큰수와 작은수로 놓고
		Scanner sc = new Scanner(System.in);

		// 사이값 구하기.

		int avg = 50;
		int high = 101;
		int low = 0;

		System.out.println("0 부터  100 사이의 값 중에 하나를 생각하세요.");
		System.out.println("제(컴)가 제시한 숫자가 생각한 숫자보다 크면 h를 입력하세요.");
		System.out.println("제(컴)가 제시한 숫자가 생각한 숫자보다 작으면 l를 입력하세요");
		System.out.println("제(컴)가 숫자를 맞췄다면 y를 입력해 주세요.");

		for (int i = 1; i < 10; i++) {

			System.out.printf("당신이 선택한 숫자는 %d 입니까?\n", avg);
			String str = sc.next();
			if (str.equalsIgnoreCase("y")) {
				System.out.println("정답입니다." + i + "회차");
				break;
			} else if (str.equalsIgnoreCase("h")) {
				high = avg;
				avg = (low + high) / 2;
				continue;
			} else if (str.equalsIgnoreCase("l")) {
				low = avg;
				avg = (low + high) / 2;

				continue;
			}

		}

	}

}
