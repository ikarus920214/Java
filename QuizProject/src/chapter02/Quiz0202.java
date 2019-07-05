package chapter02;

import java.util.Scanner;

public class Quiz0202 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("제곱 값을 원하는 수를 입력하시오.");
		int num1 = sc.nextInt();
		
	
		
		System.out.printf("%d의 제곱은 %d", num1, num1 * num1);

	}

}
