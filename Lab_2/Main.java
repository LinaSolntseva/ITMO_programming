package ru.ifmo.se.pokemon;
import ru.ifmo.se.pokemon.Pokemons.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        b.addAlly(new Solrock("1", 1));
        b.addAlly(new Shellder("2", 1));
        b.addAlly(new Cloyster("3", 1));
        b.addFoe(new Ralts("4", 1));
        b.addFoe(new Kirlia("5", 1));
        b.addFoe(new Gardevoir("6", 1));
        b.go();
    }
}