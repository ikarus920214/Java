package chapter02;

import java.util.Scanner;

public class Quiz0201 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ���� ���ڸ� �Է��ϼ���.");
		System.out.println("ù ��° ���� : ");
		int num1 = sc.nextInt();
		
		System.out.println("�� ��° ����(0 �ȵ�) : ");
		int num2 = sc.nextInt();
		
		
		System.out.printf("%d + %d = %d \n", num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d \n", num1, num2, num1 - num2);
		System.out.printf("%d * %d = %d \n", num1, num2, num1 * num2);
		System.out.printf("%d / %d = %d \n", num1, num2, num1 / num2);
		
	
	}

}
