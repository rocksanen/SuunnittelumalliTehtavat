package state;

public class Pokemon {

    //jep
    private PokemonState currentState;

    public Pokemon() {
        currentState = new CharmeleonState(this);
    }

    public void asetaTila(PokemonState tila) {
        currentState = tila;
    }

    public void hyökkää() {
        currentState.toimi();
    }
}
