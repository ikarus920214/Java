//
//Number 클래스의 추상 메서드 호출의 예
//
public class C1_NumberMethod {

	public static void main(String[] args) {
		Integer num1 = new Integer(29);
		System.out.println(num1.intValue());
		System.out.println(num1.doubleValue());	// int이지만 double형도 들어가있다.
		
		Double num2 = new Double(3.14);	
		System.out.println(num2.intValue());	// 더블이지만 int형도 들어가있다.
		System.out.println(num2.doubleValue());

	}

}
