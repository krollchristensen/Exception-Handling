import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Starter division...");
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Division fejlede.");
        } finally {
            System.out.println("Finally: oprydning forsøges.");
        }

        Path path = Path.of("data.txt");
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            System.out.println("Første linje: " + reader.readLine());
        } catch (IOException e) {
            System.out.println("Kunne ikke læse data.txt: " + e.getMessage());
        }
    }
}
