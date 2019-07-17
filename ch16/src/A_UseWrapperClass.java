
public class A_UseWrapperClass {

	public static void main(String[] args) {
		String a = "34";	// 문자열
		int b = 50;
		int c = Integer.parseInt(a);	// 문자열을 int형으로 변환
		int d = c + b;

		System.out.println(a + " + " + b + " + " + d);

	}

}
