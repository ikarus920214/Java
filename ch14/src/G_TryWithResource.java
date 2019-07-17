import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class G_TryWithResource {

	public static void main(String[] args) {
		Path file = Paths.get("D:\\ikarus920214\\java\\Study\\Simple.txt");

		try (BufferedWriter writer = Files.newBufferedWriter(file);) {
			writer.write('A'); // IOException �߻� ����
			writer.write('Z'); // IOException �߻� ����
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
