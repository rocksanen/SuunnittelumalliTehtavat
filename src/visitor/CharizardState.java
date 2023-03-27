package visitor;

public class CharizardState implements PokemonState {

    private final Pokemon pokemon;

    public CharizardState(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public void toimi(PokemonVisitor visitor) {
        System.out.println("Charizard käyttää Fire Blast -hyökkäystä!");
        visitor.visit(this);

        if (Math.random() < 0.3) {
            System.out.println("Charizard kehittyy Charmanderiksi!");
            pokemon.asetaTila(new CharmanderState(pokemon));
        }
    }
}
