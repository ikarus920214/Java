package chapter06;

import java.util.Scanner;

public class Quiz0602 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ������ �Է����ּ���.");
		int num1 = sc.nextInt();
		System.out.println("���� ������ �Է����ּ���.");
		int num2 = sc.nextInt();
		System.out.println("���� ������ �Է����ּ���.");
		int num3 = sc.nextInt();
		
		double num4 = ((num1 + num2 + num3) / 3 );  // int �� �ϸ� �����⶧���� �Ҽ����� ©��.
		
		if (num4 >= 90) {
			System.out.println("������ A �Դϴ�.");
		}else if (num4 >= 80) {
			System.out.println("������ B �Դϴ�.");
		}else if (num4 >= 70) {
			System.out.println("������ C �Դϴ�.");
		}else if (num4 >= 50) {
			System.out.println("������ D �Դϴ�.");
		}else {
			System.out.println("������ F �Դϴ�.");
		}
		

	}

}
