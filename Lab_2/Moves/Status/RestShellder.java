package ru.ifmo.se.pokemon.Moves.Status;

import ru.ifmo.se.pokemon.*;

public class RestShellder extends StatusMove {
    public RestShellder() {
        super(Type.PSYCHIC, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        double plusHP = pokemon.getHP();
        pokemon.setMod(Stat.HP, (int) plusHP-30);
        Effect effect= (new Effect()).condition(Status.SLEEP).turns(2);
        pokemon.setCondition(effect);
    }

    @Override
    protected String describe() {
        return "использует Rest";
    }
}