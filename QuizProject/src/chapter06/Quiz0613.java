package chapter06;

public class Quiz0613 {

	public static void main(String[] args) {

		//��ø for�� ��� ������ ��ü�� ����ϴ� ���α׷� �ۼ�
		// ������, ������ �Ѵ� ���
		for(int i = 1; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
				System.out.printf("%d X %d = %d\t", j, i, j*i);
			}
		System.out.println();
			
		}
		
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.printf("%d X %d = %d\t", i, j, i*j);
			}
			System.out.println();
		}
		

	}

}
