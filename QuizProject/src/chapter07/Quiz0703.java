package chapter07;

public class Quiz0703 {

	public static void main(String[] args) {
		// �� ���� ������ ���ڷ� ���� �޾Ƽ� ���� ���� ���� ���� ��ȯ�ϴ� �Լ��� �����϶�
		illo(3, 4, 5);
		int sml;
		sml = illo(3, 4, 5);
		System.out.println("���� ���� : " + sml);
		
		

	}
	
	public static int illo(int num1, int num2, int num3) {
		int add1 = (num1 > num2)? num2 : num1;
		int add2 = (num3 > add1)? add1 : num2;
		
		return add2;
		
	}

}
