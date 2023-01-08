package ru.ifmo.se.pokemon.Pokemons;

import ru.ifmo.se.pokemon.Pokemons.Ralts;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Moves.Status.Swagger;
import ru.ifmo.se.pokemon.Moves.Status.HealPulse;
import ru.ifmo.se.pokemon.Moves.Status.Charm;

public class Kirlia extends Ralts {
    public Kirlia(String name, int level) {
        super(name, level);
        setStats(38, 35, 35,65, 55, 50);
        setType(Type.PSYCHIC, Type.FAIRY);
        setMove(new Swagger(), new HealPulse(), new Charm());
    }
}