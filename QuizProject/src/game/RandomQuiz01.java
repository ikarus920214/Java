package game;
import java.util.Random;

public class RandomQuiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		서로다른 3자리의 랜덤숫자 만들기
//		QuizRandom
//
//		랜덤한 세자리 수를 표시합니다.
//		단 100의 자리와 수와 10의 자리의 수 1의 자리의 수는 같아서는 안됩니다.
//
//		Ex ) 
//		101 등 안됨 : 1이 두개임
//		777 등 안됨 : 7이 세개임
//
//		224 등 안됨 : 2가 두개임
//		233 등 안됨 : 3이 두개임

		Random randomV1 = new Random();
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		while(true) {
			num1 = randomV1.nextInt(9)+1;
			num2 = randomV1.nextInt(10);
			num3 = randomV1.nextInt(10);
			if(num1 == num2 || num1 == num3 || num2 == num3) {
				continue;
				
			}else {
				break;
			}
		}

	
	int Sum = num1*100 + num2*10 + num3;
	
	System.out.print(Sum);

	}

}