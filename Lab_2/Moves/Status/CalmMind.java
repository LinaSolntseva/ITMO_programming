package ru.ifmo.se.pokemon.Moves.Status;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class CalmMind extends StatusMove {
    public CalmMind() {
        super(Type.PSYCHIC, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPECIAL_DEFENSE, 1);
        pokemon.setMod(Stat.SPECIAL_ATTACK, 1);
    }

    @Override
    protected String describe() {
        return "использует Calm Mind";
    }
}
