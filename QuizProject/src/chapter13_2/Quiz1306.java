package chapter13_2;

public class Quiz1306 {

	public static void main(String[] args) {
		// 가로가 9, 세로가 3인 int형 2차원 배열을 선언
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
		
		// 구구단 중 2, 3, 4단을 저장한다.
		// 출력을 하는 프로그램을 작성하라

	}
}


