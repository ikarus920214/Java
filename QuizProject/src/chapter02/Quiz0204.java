package chapter02;

import java.util.Scanner;

public class Quiz0204 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� ���ڸ� �Է��ϼ���.");
		System.out.println("ù ��° ���� : ");
		int num1 = sc.nextInt();
		System.out.println("�� ��° ���� : ");
		int num2 = sc.nextInt();
		
		int big;
		
		big = (num1 > num2) ? num1 : num2;
		
		System.out.println("ū ���� " + big + " �Դϴ�.");

	}

}
