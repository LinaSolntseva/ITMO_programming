package ru.ifmo.se.pokemon.Moves.Status;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;

public class Swagger extends StatusMove{
    public Swagger() {
        super(Type.NORMAL, 0, 85);
    }

    @Override
    protected String describe() {
        return "использует Swagger";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.ATTACK, +2);
        Effect.confuse(pokemon);
    }
}