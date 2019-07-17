package chapter07;

public class Quiz0701 {

	public static void main(String[] args) {
		//세개의 정수를 인자로 전달 받아서 평균을 반환하는 함수를 정의해라
		double result;
		result = illo(4, 5, 6);
		
		System.out.println("평균 값은 : " + result/3);
		

	}
	
	public static double illo(double num1, double num2, double num3) {
		double addResult =  num1 + num2 + num3;
		return addResult;
		
	}

}
