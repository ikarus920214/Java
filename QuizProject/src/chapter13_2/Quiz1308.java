package chapter13_2;

import java.util.Scanner;

public class Quiz1308 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//성적관리 프로그램을 작성한다.
		//국어, 영어, 수학, 국사 4과목
		// 학생은 이순신, 강감찬, 을지문덕, 권율 4명이다.
		//4 by 4 배열을  선언
		int num[][] = new int[4][4];
		
		for(int i = 0; i < num.length; i++) {
			int sum1 = 0;
			for(int j = 0; j < num[i].length; j++) {
				int score = sc.nextInt();
				num[i][j] = score;
				
			}
		}
		//사용자로부터 4사람의 4과목 점수를 입력
		// 다음의 형태로 값을 저장하고 출력
		
		
		


	}

}
