package game;
import java.util.Scanner;

public class MindReader {

	public static void main(String[] args) {
//		���Ӽ��� :
//			���� ������ ���ڸ� ��ǻ�Ͱ� �����.
//			���� ������ ���ں��� ũ�� h ��� �Է��Ѵ�.
//			���� ������ ���ں��� ������ l �̶�� �Է��Ѵ�.
//			���� ������  ���ڿ� ������ y ��� �Է��Ѵ�.
// 		������ + ū�� / 2  = �߰���
		// ������ ū���� �������� ����
		Scanner sc = new Scanner(System.in);

		// ���̰� ���ϱ�.

		int avg = 50;
		int high = 101;
		int low = 0;

		System.out.println("0 ����  100 ������ �� �߿� �ϳ��� �����ϼ���.");
		System.out.println("��(��)�� ������ ���ڰ� ������ ���ں��� ũ�� h�� �Է��ϼ���.");
		System.out.println("��(��)�� ������ ���ڰ� ������ ���ں��� ������ l�� �Է��ϼ���");
		System.out.println("��(��)�� ���ڸ� ����ٸ� y�� �Է��� �ּ���.");

		for (int i = 1; i < 10; i++) {

			System.out.printf("����� ������ ���ڴ� %d �Դϱ�?\n", avg);
			String str = sc.next();
			if (str.equalsIgnoreCase("y")) {
				System.out.println("�����Դϴ�." + i + "ȸ��");
				break;
			} else if (str.equalsIgnoreCase("h")) {
				high = avg;
				avg = (low + high) / 2;
				continue;
			} else if (str.equalsIgnoreCase("l")) {
				low = avg;
				avg = (low + high) / 2;

				continue;
			}

		}

	}

}
