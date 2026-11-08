import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Indtast en divisor: ");
        String input = scanner.nextLine();
        try {
            int divisor = Integer.parseInt(input);
            System.out.println("100 / " + divisor + " = " + (100 / divisor));
        } catch (NumberFormatException e) {
            System.out.println("Du skal skrive et heltal.");
        } catch (ArithmeticException e) {
            System.out.println("Du kan ikke dividere med nul.");
        }
    }
}
