package state;

public class CharmanderState implements PokemonState{

    public CharmanderState(Pokemon pokemon) {}
    @Override
    public void toimi() {
        System.out.println("Charmander käyttää Ember-hyökkäystä ja tuhoaa koko planeetan sekä universumin. The end!!!");
        System.exit(0);
    }
}
