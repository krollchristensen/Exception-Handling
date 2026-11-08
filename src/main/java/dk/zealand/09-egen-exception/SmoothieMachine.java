public class SmoothieMachine {
    public void addIngredient(String ingredient) throws InvalidIngredientException {
        if (ingredient.equalsIgnoreCase("bacon")) {
            throw new InvalidIngredientException("Bacon hører ikke til i en smoothie!");
        }
        System.out.println(ingredient + " tilføjet.");
    }
}
