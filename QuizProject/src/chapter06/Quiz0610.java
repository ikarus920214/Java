package chapter06;

import java.util.Scanner;

public class Quiz0610 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("0보다 큰 5개의 정수를 입력해주세요.");
		int count = 0;
		while(count < 5) {
			int num1 = sc.nextInt();
			if(num1 > 0) {
				sum = num1 + sum;
				count++;
			}else {
				System.out.println("0보다 큰 수를 입력해주세요.");
			}
		}
		System.out.println("정수의 합은 : " + sum + "입니다.");
			
	}
}