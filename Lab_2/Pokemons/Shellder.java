package ru.ifmo.se.pokemon.Pokemons;

import ru.ifmo.se.pokemon.Moves.Special.HydroPump;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Moves.Status.RestShellder;
import ru.ifmo.se.pokemon.Moves.Status.Swagger;

public class Shellder extends Pokemon {
    public Shellder(String name, int level) {
        super(name, level);
        setStats(30, 65, 100,45, 25, 40);
        setType(Type.WATER);
        setMove(new HydroPump(),new Swagger(), new RestShellder() );
    }
}