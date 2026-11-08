public class Main {
    public static void main(String[] args) {
        String input = "banana";
        int level = Integer.parseInt(input); // Kaster NumberFormatException
        System.out.println("Level: " + level);
        System.out.println("Spillet fortsætter!");
    }
}
