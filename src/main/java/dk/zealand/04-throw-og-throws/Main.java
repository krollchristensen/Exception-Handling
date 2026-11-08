import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            runSimulation();
        } catch (IOException e) {
            System.out.println("Fejl i main: " + e.getMessage());
            e.printStackTrace(); // Til udvikling, ikke direkte til slutbrugeren
        }
    }

    static void runSimulation() throws IOException {
        loadData();
    }

    static void loadData() throws IOException {
        throw new IOException("Kunne ikke hente data");
    }
}
