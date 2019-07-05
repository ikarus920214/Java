package chapter02;

import java.util.Scanner;

public class Quiz0205 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("두 개의 숫자를 입력하세요.");
		System.out.println("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.println("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		int result;
		
		
		result = (num1 * num2 > 0) ?  num1 * num2  : num1 * -num2;
		// 삼항연산자 (조건식) ? 결과 1 : 결과 2, 조건식이 참이면 결과1,조건식이 거짓이면 결과2 선택
		System.out.printf("%d * %d 의 절대값은 %d 입니다\n", num1, num2, result);
		

	}

}
