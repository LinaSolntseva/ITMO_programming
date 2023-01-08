package ru.ifmo.se.pokemon.Moves.Physical;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class RockSlide extends PhysicalMove {
    public RockSlide() {
        super(Type.ROCK, 75, 90);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        super.applyOppDamage(pokemon, v);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random()*100<=30){
            Effect.flinch(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "использует Rock Slide";
    }
}