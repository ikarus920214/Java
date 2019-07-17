// ����ũ�μ���Ʈ�� : ������ 10���� ���� �����ʹ� ������ �԰��� �ؼ��ؾ� �մϴ�.
//					  Printable �� ������ �ּ���.
// �Ʒ����ѱ�, MS Word : �μ�� print �� ȣ���ϸ� �Ǵ±���. �˰ڽ��ϴ�.
// �Ｚ, ���� : �����ʹ� Printable �������̽� �԰ݿ� ���缭 ����ڽ��ϴ�.


interface Printable {
	void print(String doc);
}

class PrnDrvSamsung implements Printable {
	public void print(String doc) {
		System.out.println(doc + " \nFrom Samsung : Black-White Ver");
	}
}

class PrnDrvEpson implements Printable {
	public void print(String doc) {
		System.out.println(doc + "\nFrom Epson : Black-White Ver");
	}
}

public class Polymorphism2_1 {

	public static void main(String[] args) {
		String doc = "�����ͷ� ����� �մϴ�.";

		Printable prn1 = new PrnDrvSamsung();
		prn1.print(doc);

		Printable prn2 = new PrnDrvEpson();
		prn2.print(doc);
	}

}