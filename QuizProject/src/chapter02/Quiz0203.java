package chapter02;

import java.util.Scanner;

public class Quiz0203 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ΰ��� ������ �Է��ϼ���.");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.printf("%d ������ %d �� ���� %d �Դϴ�. \n", num1, num2, num1 / num2);
		System.out.printf("%d ������ %d �� �������� %d �Դϴ�. \n", num1, num2, num1 % num2);
		
		
		

	}

}
