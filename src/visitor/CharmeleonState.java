package visitor;

public class CharmeleonState implements PokemonState {
    private final Pokemon pokemon;

    public CharmeleonState(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public void toimi(PokemonVisitor visitor) {
        System.out.println("Charmeleon käyttää Flame Burst -hyökkäystä!");
        visitor.visit(this);

        if (Math.random() < 0.3) {
            System.out.println("Charmeleon kehittyy Charizardiksi!");
            pokemon.asetaTila(new CharizardState(pokemon));
        }
    }
}
