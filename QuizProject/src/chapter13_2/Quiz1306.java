package chapter13_2;

public class Quiz1306 {

	public static void main(String[] args) {
		// ���ΰ� 9, ���ΰ� 3�� int�� 2���� �迭�� ����
		int[][] arr1 = new int[3][9];
		
		
		for(int i = 0; i<3; i++) {
			for(int j = 0; j <9; j++) {
				arr1[i][j] = (i+2) * (j+1);
				
			}
		}
		for(int i = 0; i<arr1.length; i++) {
			for(int j = 0; j <arr1[i].length; j++) {
				System.out.printf("%d X %d = %d\t", i+2, j+1, arr1[i][j] );
			}
		}
		
		// ������ �� 2, 3, 4���� �����Ѵ�.
		// ����� �ϴ� ���α׷��� �ۼ��϶�

	}
}


