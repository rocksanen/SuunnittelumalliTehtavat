package visitor;

public interface PokemonVisitor{

    void visit(CharmanderState state);
    void visit(CharmeleonState state);
    void visit(CharizardState state);
}
