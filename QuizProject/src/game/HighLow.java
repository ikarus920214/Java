package game;
import java.util.Random;
import java.util.Scanner;

public class HighLow {

	public static void main(String[] args) {
		// �������� �̴´�
		// while(true) �ڰ� count 6ȸ���� --�� 0�Ǹ� ���� over
		//
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int i = 6;
		int count = 6;
		System.out.println("���� ���� 0���� 100 ������ �� �߿� �ϳ��� �����ϰڽ��ϴ�.");
		System.out.println("����� �� ���ڸ� 6ȸ�ȿ� ���߽ø� �˴ϴ�.");
		int com = r.nextInt(101);

		for (i = 6; i >= 1; i--) {
			System.out.println("���̶�� �����մϱ�? (0 to 100)");
			int user = sc.nextInt();
			count--;
			if (com == user) {
				System.out.printf("%d �� �����Դϴ�. �����մϴ�.\n", user);
			} else if (com > user) {
				System.out.printf("%d �� ���� ���� ������ �۽��ϴ�.\n", user);
				System.out.printf("%d �� ��ȸ�� ���ҽ��ϴ�.\n", count);

			} else if (com < user) {
				System.out.printf("%d �� ���� ���� �� ���� Ů�ϴ�.\n", user);
				System.out.printf("%d �� ��ȸ�� ���ҽ��ϴ�.\n", count);

			}

		}System.out.println("������ �� �����Ͻðڽ��ϱ�? (y/n)");
		String str = sc.next();
		if (!str.equalsIgnoreCase("y")) {
			System.out.println("Good bye~");
			count =6;
			i = 6;
		}
	}

}
