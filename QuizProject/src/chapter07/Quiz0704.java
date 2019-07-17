package chapter07;

import java.util.Scanner;

public class Quiz0704 {

	public static void main(String[] args) {
		// 섭씨를 입력 받아 화씨로 변환 리턴함수
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("섭씨를 입력해 주세요.");
		int num1 = sc.nextInt();
		
		Double Fah;
		Fah = illo(num1);
				System.out.println("화씨는 : " + Fah + "입니다.");
				
		System.out.println("화씨를 입력해 주세요.");
		
		int num2 =sc.nextInt();
		
		Double Cel;
		Cel = illo2(num2);
		System.out.println("섭씨는 : " + Cel + "입니다.");

	}
	
	public static Double illo(int num) {
		Double Fah = 1.8 * num + 32;
		return Fah;
		
		
	}
	
	public static Double illo2(int num) {
		Double Cel = (num - 32)/1.8;
		return Cel;
	}

}
