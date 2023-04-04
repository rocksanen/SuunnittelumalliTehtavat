package builder;

public interface BurgerBuilder {

    void addBun();
    void addPatty();
    void addCheese();
    void addSauce();
    Burger getBurger();
}
