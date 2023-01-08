package ru.ifmo.se.pokemon.Pokemons;

import ru.ifmo.se.pokemon.Moves.Status.HealPulse;
import ru.ifmo.se.pokemon.Moves.Status.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Ralts extends Pokemon {
    public Ralts(String s, int i) {
        super(s, i);
        setStats(28, 25, 25, 45, 35, 40);
        setType(Type.PSYCHIC, Type.FAIRY);
        setMove(new HealPulse(), new Swagger());
    }
}