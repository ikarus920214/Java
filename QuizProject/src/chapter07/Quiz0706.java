package chapter07;

public class Quiz0706 
{

	public static void main(String[] args) 
	{
//		���ǿ� �´� �� �� ã��
//		QuizAZ
//
//		���� ���� �����ϴ� ��� A�� Z�� ���ϴ� ���α׷��� �ۼ��϶�
//		 AZ
//		+ZA
//		-----
//		 99
//		��, A�� Z�� ���δٸ� �����̴�.
		
		// A + Z = 9 �� �� �� A != Z
		
		int result = 0;
		
		for(int A = 0; A < 10; A++) {
			for(int Z = 9; Z >= 0; Z--) {
				result = A + Z;
				if(result == 9) {
					if(A != Z)
					System.out.printf("A = %d Z = %d \n",A ,Z );
					
				}
			}
		}
		
		


	}

}
