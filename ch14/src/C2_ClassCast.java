class Board {
	int a = 5;
}

class PBoard extends Board {
	// int a = 5; <- ��� ����.
	int b = 10;
}

public class C2_ClassCast {

	public static void main(String[] args) {
		Board pbd1 = new PBoard();
		PBoard pbd2 = (PBoard) pbd1; // OK!

		System.out.println(".. intermediate location .. ");
		Board ebd1 = new Board();
		PBoard ebd2 = (PBoard) ebd1; // Exception!

	}

}
