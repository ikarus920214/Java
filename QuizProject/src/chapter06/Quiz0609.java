package chapter06;

import java.util.Scanner;

public class Quiz0609 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 하나 입력하세요.");
		int num1 = sc.nextInt();
		
//		for(int num2 = num1; num2 == num1; num1--) {
//			for(int j = 9; j >= 1; j--)
//				System.out.println(num1 + " X " + j + " = " + num2 * j);
		
			for(int j = 9; j >= 1; j--)
				System.out.println(num1 + " X " + j + " = " + num1 * j);

		}

	}


