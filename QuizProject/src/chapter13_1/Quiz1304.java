package chapter13_1;

import java.util.Scanner;

public class Quiz1304 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar1 = new int[10];
		
		int odd = 0;
		int even = ar1.length -1;
		System.out.println("�� 10���� ������ �Է��Ͻÿ�.");

		for (int i = 0; i < ar1.length; i++) {
			int num = sc.nextInt();
			if(num % 2 != 0) {
				ar1[odd] = num;
				odd++;
			}else {
				ar1[even] = num;
				even--;
			}
		}
		System.out.print("��� : ");
		for (int i=0; i<ar1.length; i++) {
			System.out.print(ar1[i] + " ");
		}
		System.out.println();
		

	}

}
