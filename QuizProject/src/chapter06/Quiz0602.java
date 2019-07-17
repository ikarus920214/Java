package chapter06;

import java.util.Scanner;

public class Quiz0602 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력해주세요.");
		int num1 = sc.nextInt();
		System.out.println("영어 점수를 입력해주세요.");
		int num2 = sc.nextInt();
		System.out.println("수학 점수를 입력해주세요.");
		int num3 = sc.nextInt();
		
		double num4 = ((num1 + num2 + num3) / 3 );  // int 로 하면 정수기때문에 소수점이 짤림.
		
		if (num4 >= 90) {
			System.out.println("학점은 A 입니다.");
		}else if (num4 >= 80) {
			System.out.println("학점은 B 입니다.");
		}else if (num4 >= 70) {
			System.out.println("학점은 C 입니다.");
		}else if (num4 >= 50) {
			System.out.println("학점은 D 입니다.");
		}else {
			System.out.println("학점은 F 입니다.");
		}
		

	}

}
