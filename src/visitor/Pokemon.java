package visitor;

public class Pokemon {

    private PokemonState currentState;

    public Pokemon() {
        currentState = new CharmeleonState(this);
    }

    public void asetaTila(PokemonState tila) {
        currentState = tila;
    }

    public void hyökkää(PokemonVisitor visitor) {
        currentState.toimi(visitor);
    }
}
