package chapter07;

public class Quiz0701 {

	public static void main(String[] args) {
		//������ ������ ���ڷ� ���� �޾Ƽ� ����� ��ȯ�ϴ� �Լ��� �����ض�
		double result;
		result = illo(4, 5, 6);
		
		System.out.println("��� ���� : " + result/3);
		

	}
	
	public static double illo(double num1, double num2, double num3) {
		double addResult =  num1 + num2 + num3;
		return addResult;
		
	}

}
