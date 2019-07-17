package chapter07;

public class Quiz0702 {

	public static void main(String[] args) {
		// 세 개의 정수를 인자로 전달 받아서 그중 가장 큰 수를 반환하는 함수를 정의하라
		illo(2, 3, 4);
		int big;
		big = illo(2, 3, 4);
		System.out.println("큰 값은 : " + big);
		
		

	}
	
	public static int illo(int num1, int num2, int num3) {
		int add1 = (num1 > num2)? num1 : num2;
		int add2 = num3 > add1? num3 : add1;
		
		return add2;
		
	}

}
