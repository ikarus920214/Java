
public class IfExample3 {

	public static void main(String[] args) {
		int score = 100;
		int grade;
		if (score >= 90) {
			grade = 'A';
			System.out.println("������ A �Դϴ�.");
		}
		else if (score >= 80) {
			grade = 'B';
			System.out.println("������ B �Դϴ�.");
		}
		else if (score >= 70) {
			grade = 'C';
			System.out.println("������ C �Դϴ�.");
		}
		else if (score >= 60) {
			grade = 'D';
			System.out.println("������ D �Դϴ�.");
		}
		else {
			grade = 'F';
			System.out.println("������ F �Դϴ�.");
		}


	}

}
