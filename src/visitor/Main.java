package visitor;

public class Main {


    public static void main(String[] args){

        Pokemon pokemon = new Pokemon();
        BonusVisitor visitor = new BonusVisitor();

        for (int i = 0; i < 100; i++) {
            pokemon.hyökkää(visitor);
        }

    }
}
