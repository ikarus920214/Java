package chapter07;

import java.util.Scanner;

public class Quiz0705 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1, num2, num3, sum1;

		System.out.println("�� ���� ������ �Է����ּ���.");

		// ����° �μ��� 1,2,3,4 �̿��� ���� �ٽ� ��ü�Է�.
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		switch (num3) {
		case 1 :
			// sum1 = num1 + num2;
			System.out.printf("%d + %d = %d �Դϴ�.\n", num1, num2, (num1 + num2));
			break;
		case 2 :
		//	sum1 = num1 - num2;
			System.out.printf("%d - %d = %d �Դϴ�.\n",  num1, num2,(num1 - num2));
			break;
		case 3 :
			//sum1 = num1 * num2;
			System.out.printf("%d * %d = %d �Դϴ�.\n", num1, num2, (num1*num2));
			break;
		case 4 :
			//sum1 = num1 / num2;
			System.out.printf("%d / %d = %d �Դϴ�.\n", num1, num2, (num1/num2));
			break;
		default:
			System.out.println("���ڸ� �ٽ� �Է����ּ���.");
		}

	}
}
