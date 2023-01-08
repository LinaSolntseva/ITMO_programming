package ru.ifmo.se.pokemon.Moves.Physical;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class PoisonJab extends PhysicalMove {
    public PoisonJab() {
        super(Type.POISON, 80, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        super.applyOppDamage(pokemon, v);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if ((!pokemon.hasType(Type.POISON)) & (!pokemon.hasType(Type.STEEL))){
            if (Math.random()*100<=30){
                Effect.poison(pokemon);
            }
        }
    }

    @Override
    protected String describe() {
        return "использует Poison Jab";
    }
}
