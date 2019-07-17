package chapter13_2;

public class Quiz1307 {

	public static void main(String[] args) {

		// 가로가 4 세로가 2인 배열 작성

		int num1[][] = new int[2][4];
		int num2[][] = new int[4][2];
		int x = 1;
//		우선 아래와 같은 형태의 좌측배열 A를 선언한다.
		for (int i = 0; i < num1.length; i++) {
			for (int j = 0; j < num1[i].length; j++) {
				num1[i][j] = x;
				x++;
				System.out.print(num1[i][j] + "\t");
			}
			System.out.println();
		}
		for (int i = 0; i < num2.length; i++) {
			for (int j = 0; j < num2[i].length; j++) {
				num2[i][j] = num1[j][i];
				System.out.print(num2[i][j] + "\t");
			}
			System.out.println();
		}

	}
//		A배열의 초기값을 이용
//		우측배열 B를 초기화하는 프로그램을 작성하시오

}
