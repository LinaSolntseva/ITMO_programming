package ru.ifmo.se.pokemon.Pokemons;

import ru.ifmo.se.pokemon.Moves.Physical.RockSlide;
import ru.ifmo.se.pokemon.Moves.Special.Flamethrower;
import ru.ifmo.se.pokemon.Moves.Status.CosmicPower;
import ru.ifmo.se.pokemon.Moves.Status.CalmMind;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Solrock extends Pokemon {
    public Solrock(String name, int level) {
        super(name, level);
        setStats(90, 95, 85,55, 65, 70);
        setType(Type.ROCK, Type.PSYCHIC);
        setMove(new RockSlide(), new CosmicPower(), new Flamethrower(), new CalmMind());
    }
}