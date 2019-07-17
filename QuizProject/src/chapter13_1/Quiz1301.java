
//문제1
//길이가 5인 int형 배열을 선언해서 사용자로부터 5개의 정수를 입력받는다.	
//그리고 최대값, 최소값, 모든 수의 합을 구하라. 
//함수(최대,최소,합)를 정의하여 구현하시오.

package chapter13_1;

import java.util.Scanner;

public class Quiz1301 {

	public static int max(int ar1[]) {
		int max = ar1[0];

		for (int i = 0; i < ar1.length; i++)
			if (ar1[i] > max)
				max = ar1[i];
		return max;

	}

	public static int min(int ar1[]) {
		int min = ar1[0];

		for (int i = 0; i < ar1.length; i++)
			if (ar1[i] < min)
				min = ar1[i];
		return min;

	}

	public static int sum(int ar1[]) {
		int sum = ar1[0];
		for (int i = 1; i < ar1.length; i++)
			sum = sum + ar1[i];
		return sum;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("5개의 정수를 입력해주세요.");

		int[] ar1 = new int[5];

		for (int i = 0; i < 5; i++) {
			ar1[i] = sc.nextInt();
		}

		System.out.println("최대값은 : " + max(ar1));
		System.out.println("최소값은 : " + min(ar1));
		System.out.println("모든 수의 합은 : " + sum(ar1));

	}

}
