package chapter13_2;

import java.util.Scanner;

public class Quiz1308 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//�������� ���α׷��� �ۼ��Ѵ�.
		//����, ����, ����, ���� 4����
		// �л��� �̼���, ������, ��������, ���� 4���̴�.
		//4 by 4 �迭��  ����
		int num[][] = new int[4][4];
		
		for(int i = 0; i < num.length; i++) {
			int sum1 = 0;
			for(int j = 0; j < num[i].length; j++) {
				int score = sc.nextInt();
				num[i][j] = score;
				
			}
		}
		//����ڷκ��� 4����� 4���� ������ �Է�
		// ������ ���·� ���� �����ϰ� ���
		
		
		


	}

}
