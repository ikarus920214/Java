//����ڷκ��� ���� ������� ������ �Է¹��� �� ����� ���Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//��� ������ �Է��� �� ����ڷκ��� �Է¹޴´�.
//�Է¹��� ���ڸ�ŭ ������ �Է¹޴´�.(1������ 3�̶�� �Է��ߴٸ� 3���� ������ �Է¹޾ƾ� �Ѵ�)
//�Է¹��� ���ڵ��� ��հ��� ���Ͽ� ����Ѵ�. ��հ��� �Ҽ��� ���ϱ��� ����ؾ� �Ѵ�.

package chapter06;

import java.util.Scanner;

public class Quiz0606 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է��� ������ ������ �Է����ּ���.");
		int num1 = sc.nextInt();
		double result = 0;

		for (int i = 0; i < num1; i++) {
			int num2 = sc.nextInt();
			result = result + num2;

		}
		result = result / num1;
		System.out.println("�Է��� ���� �����" + result + "�Դϴ�.");

	}

}