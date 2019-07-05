package chapter02;

import java.util.Scanner;

public class Quiz0204 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("두 개의 숫자를 입력하세요.");
		System.out.println("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.println("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		int big;
		
		big = (num1 > num2) ? num1 : num2;
		
		System.out.println("큰 수는 " + big + " 입니다.");

	}

}
