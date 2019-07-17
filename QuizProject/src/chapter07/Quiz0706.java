package chapter07;

public class Quiz0706 
{

	public static void main(String[] args) 
	{
//		조건에 맞는 수 다 찾기
//		QuizAZ
//
//		다음 식을 만족하는 모든 A와 Z를 구하는 프로그램을 작성하라
//		 AZ
//		+ZA
//		-----
//		 99
//		단, A와 Z는 서로다른 숫자이다.
		
		// A + Z = 9 인 수 단 A != Z
		
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
