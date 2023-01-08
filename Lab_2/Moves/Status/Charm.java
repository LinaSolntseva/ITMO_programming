package ru.ifmo.se.pokemon.Moves.Status;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Charm extends StatusMove {
    public Charm() {
        super(Type.FAIRY, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.ATTACK, -2);
    }

    @Override
    protected String describe() {
        return "использует Charm";
    }
}
