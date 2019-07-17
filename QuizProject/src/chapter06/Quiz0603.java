package chapter06;

import java.util.Scanner;

public class Quiz0603 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 하나를 입력해주세요.");
		int num1 = sc.nextInt();
		int num2 = 1;
		
		while(num1 > 1) {
			num2 *= num1;
			System.out.print(num1 + "*");
			num1--;
		}
		System.out.println(num1 + "의팩토리얼은" + num2 + "입니다.");
		

	}

}
