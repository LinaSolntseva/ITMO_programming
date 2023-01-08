package ru.ifmo.se.pokemon.Pokemons;

import ru.ifmo.se.pokemon.Moves.Special.Confusion;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Moves.Status.Swagger;
import ru.ifmo.se.pokemon.Moves.Status.HealPulse;
import ru.ifmo.se.pokemon.Moves.Status.Charm;

public class Gardevoir extends Kirlia {
    public Gardevoir(String name, int level) {
        super(name, level);
        setStats(68, 65, 65,125, 115, 80);
        setType(Type.PSYCHIC, Type.FAIRY);
        setMove(new Swagger(), new HealPulse(), new Charm(), new Confusion());
    }
}