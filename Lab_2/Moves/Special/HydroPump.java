package ru.ifmo.se.pokemon.Moves.Special;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class HydroPump extends SpecialMove {
    public HydroPump() {
        super(Type.WATER, 110, 80);
    }

    @Override
    protected String describe() {
        return "использует Hydro Pump";
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        super.applyOppDamage(pokemon, v);
    }
}
