
public class D1_EnhancedFor {

	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4, 5 };

		// �迭 ��� ��ü ���
		for (int e : ar) {
			System.out.print(e + " ");
		}

		System.out.println(); // �� �ٲ��� ��������

		int sum = 0;

		// �迭 ����� ��ü �� ���
		for (int e : ar) {
			sum = sum + e;
		}

		System.out.println("sum: " + sum);

	}

}