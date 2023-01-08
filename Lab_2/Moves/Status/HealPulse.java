package ru.ifmo.se.pokemon.Moves.Status;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

//нет метода для воздействия на союзных покемонов
public class HealPulse extends StatusMove {
    public HealPulse() {
        super(Type.PSYCHIC, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        double plusHP= pokemon.getHP();
        pokemon.setMod(Stat.HP, (int) plusHP-28);
    }

    @Override
    protected String describe() {
        return "использует Heal Pulse";
    }
}