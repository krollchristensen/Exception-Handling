import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Indtast level: ");
            String input = scanner.nextLine();
            try {
                int level = Integer.parseInt(input);
                if (level < 0) {
                    System.out.println("Level må ikke være negativt.");
                    continue;
                }
                System.out.println("Level " + level + " loaded!");
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ugyldigt tal. Prøv igen.");
            }
        }
    }
}
