package ru.ifmo.se.pokemon.Pokemons;

import ru.ifmo.se.pokemon.Moves.Physical.PoisonJab;
import ru.ifmo.se.pokemon.Moves.Special.HydroPump;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Moves.Status.Swagger;
import ru.ifmo.se.pokemon.Moves.Status.RestCloyster;
public class Cloyster extends Shellder {
    public Cloyster(String name, int level) {
        super(name, level);
        setStats(50, 95, 180,85, 45, 70);
        setType(Type.WATER, Type.ICE);
        setMove(new HydroPump(),new Swagger(), new RestCloyster(), new PoisonJab());
    }
}