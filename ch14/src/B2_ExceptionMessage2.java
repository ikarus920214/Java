
public class B2_ExceptionMessage2 {

	public static void md1(int n) {
		md2(n, 0); // �� �������� md2�� ���� ���ܰ� �Ѿ�´�.
	}

	public static void md2(int n1, int n2) {
		int r = n1 / n2; // ���� �߻� ����
	}

	public static void main(String[] args) {
		try {
			md1(3); // �� �������� md1�κ��� ���ܰ� �Ѿ�´�.
		} catch (Throwable e) {
			// System.out.println(e.getMessage()); // ���� ����ǥ��
			e.printStackTrace();
		}
		System.out.println("Good bye~~!");
	}

}
