package chapter06;

public class Quiz0613 {

	public static void main(String[] args) {

		//중첩 for문 사용 구구단 전체를 출력하는 프로그램 작성
		// 가로형, 세로형 둘다 출력
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
