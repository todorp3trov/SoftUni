package Pokemon_Trainer;

import java.util.ArrayList;
import java.util.List;

class Trainer {
    private String name;
    private int badges;
    private List<Pokemon> pokemon;

    public Trainer(String name) {
        this.name = name;
        this.badges = 0;
        this.pokemon = new ArrayList<>();
    }

    public int getBadges() {
        return badges;
    }

    public void addPokemon(Pokemon pokemon) {
        this.pokemon.add(pokemon);
    }

    private boolean containsPokemonWithGivenElement(String element) {
        for (Pokemon pokemon : this.pokemon) {
            if (pokemon.getElement().equals(element)) {
                return true;
            }
        }
        return false;
    }

    public void fight(String element) {
        if (containsPokemonWithGivenElement(element)) {
            badges++;
            return;
        }

        for (int i = pokemon.size() - 1; i >= 0; i--) {
            pokemon.get(i).loseHp();
            if (pokemon.get(i).getHealth() <= 0) {
                this.pokemon.remove(pokemon.get(i));
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%s %d %d", name, badges, pokemon.size());
    }
}
