package chapter13_2;

public class Quiz1307 {

	public static void main(String[] args) {

		// ���ΰ� 4 ���ΰ� 2�� �迭 �ۼ�

		int num1[][] = new int[2][4];
		int num2[][] = new int[4][2];
		int x = 1;
//		�켱 �Ʒ��� ���� ������ �����迭 A�� �����Ѵ�.
		for (int i = 0; i < num1.length; i++) {
			for (int j = 0; j < num1[i].length; j++) {
				num1[i][j] = x;
				x++;
				System.out.print(num1[i][j] + "\t");
			}
			System.out.println();
		}
		for (int i = 0; i < num2.length; i++) {
			for (int j = 0; j < num2[i].length; j++) {
				num2[i][j] = num1[j][i];
				System.out.print(num2[i][j] + "\t");
			}
			System.out.println();
		}

	}
//		A�迭�� �ʱⰪ�� �̿�
//		�����迭 B�� �ʱ�ȭ�ϴ� ���α׷��� �ۼ��Ͻÿ�

}
