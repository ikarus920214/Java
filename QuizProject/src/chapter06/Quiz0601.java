package chapter06;

import java.util.Scanner;

public class Quiz0601 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" 두 개의 정수를 입력해주세요.");
		System.out.println("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.println("두 번쨰 정수 : ");
		int num2 = sc.nextInt();
		int num3 = num1 - num2;
		System.out.printf(" %d - %d = %d 입니다.\n", num1, num2, (num3 < 0) ? -num3 : num3 );
		// if (num3 <0) {
		// num3 = num3 *-1
	    // }

	}

}
