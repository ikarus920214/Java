package chapter06;

import java.util.Scanner;

public class Quiz0601 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" �� ���� ������ �Է����ּ���.");
		System.out.println("ù ��° ���� : ");
		int num1 = sc.nextInt();
		System.out.println("�� ���� ���� : ");
		int num2 = sc.nextInt();
		int num3 = num1 - num2;
		System.out.printf(" %d - %d = %d �Դϴ�.\n", num1, num2, (num3 < 0) ? -num3 : num3 );
		// if (num3 <0) {
		// num3 = num3 *-1
	    // }

	}

}
