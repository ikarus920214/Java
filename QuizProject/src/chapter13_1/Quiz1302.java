
//문제2
//char형 1차원 배열을 선언과 동시에 'Good time' 문장으로 초기화하고
// 저장된 내용을 출력하라.

package chapter13_1;

public class Quiz1302 {

	public static void main(String[] args) {
		char[] arr = { 'G', 'o', 'o', 'd',' ', 't', 'i', 'm', 'e' };

		//System.out.println(arr); //답은 맞지만 배열이기때문에 밑에것
		for(int i=0;i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}

}
