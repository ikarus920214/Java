package chapter06;

import java.util.Scanner;

public class Quiz0605 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է����ּ���.");
		int sum1 = 0;
		
		while(true) {
			int num1 = sc.nextInt();
			if(num1 != 0) {
				sum1 = sum1 + num1;
				
			}else {
				System.out.println("������ ����" + sum1 + "�Դϴ�");
				break;
			}
			
			
		}
		


	}

}
