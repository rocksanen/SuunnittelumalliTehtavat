package visitor;

public class BonusVisitor implements PokemonVisitor{


    @Override
    public void visit(CharmanderState state) {

        System.out.println("Charmander receives 5 bonus points.");
    }

    @Override
    public void visit(CharmeleonState state) {

        System.out.println("Charmeleon receives 10 bonus points.");
    }

    @Override
    public void visit(CharizardState state) {

        System.out.println("Charizard receives 15 bonus points.");
    }
}
