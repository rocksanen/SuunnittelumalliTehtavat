package builder;

import java.util.ArrayList;
import java.util.List;

public class Burger {

    private List<Ingredient> ingredients;
    private String burgerString;

    public Burger() {
        this.ingredients = new ArrayList<>();
    }

    public Burger(String burgerString) {
        this.burgerString = burgerString;
    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public String toString() {
        if (burgerString != null) {
            return burgerString;
        }
        StringBuilder sb = new StringBuilder();
        for (Ingredient ingredient : ingredients) {
            sb.append(ingredient.getName()).append("\n");
        }
        return sb.toString();
    }
}
