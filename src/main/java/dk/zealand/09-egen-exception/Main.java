public class Main {
    public static void main(String[] args) {
        SmoothieMachine machine = new SmoothieMachine();
        try {
            machine.addIngredient("Banan");
            machine.addIngredient("Bacon");
        } catch (InvalidIngredientException e) {
            System.out.println("Afvist: " + e.getMessage());
        }
    }
}
