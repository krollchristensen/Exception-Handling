import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileService service = new FileService(new FileRepository());
        try {
            System.out.println(service.getFileContent("data.txt"));
        } catch (IOException e) {
            System.out.println("Kunne ikke læse filen: " + e.getMessage());
        }
    }
}
