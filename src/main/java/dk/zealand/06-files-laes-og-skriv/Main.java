import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        Path path = Path.of("scores.txt");
        try {
            Files.writeString(path, "Player1: 1500\n");
            System.out.println("Gemt i: " + path.toAbsolutePath());
            System.out.println("Indhold: " + Files.readString(path));
        } catch (IOException e) {
            System.out.println("Filfejl: " + e.getMessage());
        }
    }
}
