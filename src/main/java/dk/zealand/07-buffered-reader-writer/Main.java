import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        Path path = Path.of("players.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            writer.write("Anwar"); writer.newLine();
            writer.write("Sarah"); writer.newLine();
            writer.write("Mark"); writer.newLine();
        } catch (IOException e) {
            System.out.println("Skrivefejl: " + e.getMessage());
            return;
        }

        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Læsefejl: " + e.getMessage());
        }
    }
}
