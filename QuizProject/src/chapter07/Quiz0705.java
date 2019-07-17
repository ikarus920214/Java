package chapter07;

import java.util.Scanner;

public class Quiz0705 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1, num2, num3, sum1;

		System.out.println("세 개의 정수를 입력해주세요.");

		// 세번째 인수가 1,2,3,4 이외의 수면 다시 전체입력.
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		switch (num3) {
		case 1 :
			// sum1 = num1 + num2;
			System.out.printf("%d + %d = %d 입니다.\n", num1, num2, (num1 + num2));
			break;
		case 2 :
		//	sum1 = num1 - num2;
			System.out.printf("%d - %d = %d 입니다.\n",  num1, num2,(num1 - num2));
			break;
		case 3 :
			//sum1 = num1 * num2;
			System.out.printf("%d * %d = %d 입니다.\n", num1, num2, (num1*num2));
			break;
		case 4 :
			//sum1 = num1 / num2;
			System.out.printf("%d / %d = %d 입니다.\n", num1, num2, (num1/num2));
			break;
		default:
			System.out.println("숫자를 다시 입력해주세요.");
		}

	}
}
