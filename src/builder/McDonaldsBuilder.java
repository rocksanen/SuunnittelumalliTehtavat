package builder;

public class McDonaldsBuilder implements BurgerBuilder {

    private final StringBuilder burger;

    public McDonaldsBuilder() {
        this.burger = new StringBuilder();
    }

    public void addBun() {
        burger.append("Sämpylä\n");
    }

    public void addPatty() {
        burger.append("Pihvi\n");
    }

    public void addCheese() {
        burger.append("Koskenlaskija\n");
    }

    public void addSauce() {
        burger.append("Ketsuppi\n");
    }

    public Burger getBurger() {
        return new Burger(burger.toString());
    }
}
