import java.util.Scanner;

public class A1_ExceptionCase1 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		// n2 에 0을 입력하면 에러가 뜸.
		// 문자를 넣어도 에러
		System.out.print("a/b... a? ");
		int n1 = kb.nextInt();
		
		System.out.print("a/b... b? ");
		int n2 = kb.nextInt();
		
		System.out.printf("%d / %d = %d \n", n1, n2, n1/n2);
		System.out.println("Good bye~~!");

	}

}
