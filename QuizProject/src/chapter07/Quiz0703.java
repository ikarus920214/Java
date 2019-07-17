package chapter07;

public class Quiz0703 {

	public static void main(String[] args) {
		// 세 개의 정수를 인자로 전달 받아서 그중 가장 작은 수를 반환하는 함수를 정의하라
		illo(3, 4, 5);
		int sml;
		sml = illo(3, 4, 5);
		System.out.println("작은 값은 : " + sml);
		
		

	}
	
	public static int illo(int num1, int num2, int num3) {
		int add1 = (num1 > num2)? num2 : num1;
		int add2 = (num3 > add1)? add1 : num2;
		
		return add2;
		
	}

}
