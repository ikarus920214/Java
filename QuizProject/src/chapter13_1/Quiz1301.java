
//����1
//���̰� 5�� int�� �迭�� �����ؼ� ����ڷκ��� 5���� ������ �Է¹޴´�.	
//�׸��� �ִ밪, �ּҰ�, ��� ���� ���� ���϶�. 
//�Լ�(�ִ�,�ּ�,��)�� �����Ͽ� �����Ͻÿ�.

package chapter13_1;

import java.util.Scanner;

public class Quiz1301 {

	public static int max(int ar1[]) {
		int max = ar1[0];

		for (int i = 0; i < ar1.length; i++)
			if (ar1[i] > max)
				max = ar1[i];
		return max;

	}

	public static int min(int ar1[]) {
		int min = ar1[0];

		for (int i = 0; i < ar1.length; i++)
			if (ar1[i] < min)
				min = ar1[i];
		return min;

	}

	public static int sum(int ar1[]) {
		int sum = ar1[0];
		for (int i = 1; i < ar1.length; i++)
			sum = sum + ar1[i];
		return sum;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("5���� ������ �Է����ּ���.");

		int[] ar1 = new int[5];

		for (int i = 0; i < 5; i++) {
			ar1[i] = sc.nextInt();
		}

		System.out.println("�ִ밪�� : " + max(ar1));
		System.out.println("�ּҰ��� : " + min(ar1));
		System.out.println("��� ���� ���� : " + sum(ar1));

	}

}
