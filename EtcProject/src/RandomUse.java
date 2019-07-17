import java.util.Random;

public class RandomUse {

	public static void main(String[] args) {
		
		// Type #1
		Random randomV1 = new Random();
		
		System.out.println(randomV1.nextBoolean()); // 참거짓 랜덤
		System.out.println(randomV1.nextFloat());   // Float범위내 값 랜덤
		System.out.println(randomV1.nextInt());		// int 값 랜덤
		System.out.println(randomV1.nextInt(100)); // range : 0 ~ 99 사이 정수 랜덤
		
		// Type #2 : 1~100 사이의 값 출력
		double randomV2 = Math.random();
		System.out.println("1 : " + randomV2);
		int intVal = (int)(randomV2 * 100) + 1;
		System.out.println("2 : " + intVal);
		
		// (int)(Math.random() * (최대값 - 최소값 + 1)) + 최소값
                                   
	}

}
