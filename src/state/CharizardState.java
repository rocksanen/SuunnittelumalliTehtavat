package state;

public class CharizardState implements PokemonState{

    //jep
    private final Pokemon pokemon;

    public CharizardState(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public void toimi() {
        System.out.println("Charizard käyttää Fire Blast -hyökkäystä!");

        if (Math.random() < 0.3) {
            System.out.println("Charizad kehittyy Charmanderiksi!");
            pokemon.asetaTila(new CharmanderState(pokemon));
        }
    }
}
