package chapter07;

import java.util.Scanner;

public class Quiz0704 {

	public static void main(String[] args) {
		// ������ �Է� �޾� ȭ���� ��ȯ �����Լ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��� �ּ���.");
		int num1 = sc.nextInt();
		
		Double Fah;
		Fah = illo(num1);
				System.out.println("ȭ���� : " + Fah + "�Դϴ�.");
				
		System.out.println("ȭ���� �Է��� �ּ���.");
		
		int num2 =sc.nextInt();
		
		Double Cel;
		Cel = illo2(num2);
		System.out.println("������ : " + Cel + "�Դϴ�.");

	}
	
	public static Double illo(int num) {
		Double Fah = 1.8 * num + 32;
		return Fah;
		
		
	}
	
	public static Double illo2(int num) {
		Double Cel = (num - 32)/1.8;
		return Cel;
	}

}
