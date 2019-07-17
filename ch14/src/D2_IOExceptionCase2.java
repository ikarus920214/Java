import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class D2_IOExceptionCase2 {

	public static void main(String[] args) {
		Path file = Paths.get("D:\\ikarus920214\\java\\study\\Simple.txt");
		BufferedWriter writer = null;

		try {
			// �Ʒ� ���忡�� IOException �߻� ����
			writer = Files.newBufferedWriter(file); // IOException �߻� ����
			
			writer.write('A'); // IOException �߻�����
			writer.write('Z'); // IOException �߻�����

			if (writer != null)
				writer.close(); // IOException �߻� ����
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}