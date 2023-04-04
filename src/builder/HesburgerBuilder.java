package builder;

public class HesburgerBuilder implements BurgerBuilder{

    private final Burger burger;

    public HesburgerBuilder() {
        this.burger = new Burger();
    }

    public void addBun() {
        burger.addIngredient(new Bun("Sämpylä"));
    }

    public void addPatty() {
        burger.addIngredient(new HamburgerPatty("Pihvi"));
    }

    public void addCheese() {
        burger.addIngredient(new CheddarCheese("Sissijuusto"));
    }

    public void addSauce() {
        burger.addIngredient(new Ketchup("Ketsuppi"));
    }

    public Burger getBurger() {
        return burger;
    }
}
