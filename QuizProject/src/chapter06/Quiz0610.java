package chapter06;

import java.util.Scanner;

public class Quiz0610 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("0���� ū 5���� ������ �Է����ּ���.");
		int count = 0;
		while(count < 5) {
			int num1 = sc.nextInt();
			if(num1 > 0) {
				sum = num1 + sum;
				count++;
			}else {
				System.out.println("0���� ū ���� �Է����ּ���.");
			}
		}
		System.out.println("������ ���� : " + sum + "�Դϴ�.");
			
	}
}