package ru.ifmo.se.pokemon.Moves.Special;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Confusion extends SpecialMove {
    public Confusion() {
        super(Type.PSYCHIC, 50, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        super.applyOppDamage(pokemon, v);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random()*100<=10){
            Effect.confuse(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "использует Confusion";
    }
}