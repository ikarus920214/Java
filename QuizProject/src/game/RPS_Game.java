package game;
import java.util.Random;
import java.util.Scanner;

public class RPS_Game {

	public static void main(String[] args) {
		// ���Ϲ� true�� ��� ���� else if 0 �Է½� break;
		// ������ 2+1 ����
		// 1,2,3 �� ���� , ���� , �� ����
		// ��ĳ�ʷ� 1.2.3 �� �ϳ� �Է�. switch case �Ἥ �ϸ�ɵ�
		// ����Ʈ�� �߸� �Է��ߴٰ� ����.
		// �º� ��� �¸�/�й�/���º�
		//
		Scanner sc = new Scanner(System.in);

		Random r = new Random();
		int com;

		// 1 = ���� 2 ���� 3 ��

		while (true) {

			com = r.nextInt(3) + 1;
			System.out.println("������ ���ڽ��ϱ�?(1: ���� 2:���� 3:�� 0:����) : ");
			int user = sc.nextInt();
			if (user > 3 || user < 0) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�");

			} else if (com == 1 && user == 1) {
				System.out.println("����� : ����, ��ǻ�� : ����");
				System.out.println("�����ϴ�.");

			} else if (com == 1 && user == 2) {
				System.out.println("����� : ����, ��ǻ�� : ����");
				System.out.println("�̰���ϴ�.");

			} else if (com == 1 && user == 3) {
				System.out.println("����� : ��, ��ǻ�� : ����");
				System.out.println("�����ϴ�.");

			} else if (com == 2 && user == 1) {
				System.out.println("����� : ����, ��ǻ�� : ����");
				System.out.println("�����ϴ�.");

			} else if (com == 2 && user == 2) {
				System.out.println("����� : ����, ��ǻ�� : ����");
				System.out.println("�����ϴ�.");

			} else if (com == 2 && user == 3) {
				System.out.println("����� : ��, ��ǻ�� : ����");
				System.out.println("�̰���ϴ�.");

			} else if (com == 3 && user == 1) {
				System.out.println("����� : ����, ��ǻ�� : ��");
				System.out.println("�̰���ϴ�.");

			} else if (com == 3 && user == 2) {
				System.out.println("����� : ����, ��ǻ�� : ��");
				System.out.println("�����ϴ�.");

			} else if (com == 3 && user == 3) {
				System.out.println("����� : ��, ��ǻ�� : ��");
				System.out.println("�����ϴ�.");

			} else if (user == 0) {
				break;
			}
		}

	}

}
