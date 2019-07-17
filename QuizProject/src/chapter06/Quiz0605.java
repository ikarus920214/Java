package chapter06;

import java.util.Scanner;

public class Quiz0605 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요.");
		int sum1 = 0;
		
		while(true) {
			int num1 = sc.nextInt();
			if(num1 != 0) {
				sum1 = sum1 + num1;
				
			}else {
				System.out.println("정수의 합은" + sum1 + "입니다");
				break;
			}
			
			
		}
		


	}

}
