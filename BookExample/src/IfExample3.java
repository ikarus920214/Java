
public class IfExample3 {

	public static void main(String[] args) {
		int score = 100;
		int grade;
		if (score >= 90) {
			grade = 'A';
			System.out.println("학점은 A 입니다.");
		}
		else if (score >= 80) {
			grade = 'B';
			System.out.println("학점은 B 입니다.");
		}
		else if (score >= 70) {
			grade = 'C';
			System.out.println("학점은 C 입니다.");
		}
		else if (score >= 60) {
			grade = 'D';
			System.out.println("학점은 D 입니다.");
		}
		else {
			grade = 'F';
			System.out.println("학점은 F 입니다.");
		}


	}

}
