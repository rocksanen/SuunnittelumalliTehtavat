package state;

public class CharmeleonState implements PokemonState{
    //jep
    private final Pokemon pokemon;

    public CharmeleonState(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public void toimi() {
        System.out.println("Charmeleon käyttää Flame Burst -hyökkäystä!");

        if (Math.random() < 0.3) {
            System.out.println("Charmeleon kehittyy Charizardiksi!");
            pokemon.asetaTila(new CharizardState(pokemon));
        }
    }
}
