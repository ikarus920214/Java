package chapter13_1;

import java.util.Scanner;

public class Quiz1303 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] ar1 = new int[10];
		System.out.println("10���� ������ �Է��ϼ���.");
		for (int i = 0; i < 10; i++) {
			ar1[i] = sc.nextInt();
		}
		System.out.println("Ȧ��");
		for (int i = 0; i < 10; i++) {
			if ((ar1[i]) % 2 != 0) {
				System.out.print(ar1[i] + " ");
			}
		}
		System.out.println("");
		System.out.println("¦��");
		for (int i = 0; i < 10; i++) {
			if ((ar1[i]) % 2 == 0) {
				System.out.print(ar1[i] + " ");
			}
		}

	}

}
