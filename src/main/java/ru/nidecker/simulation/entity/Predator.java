package ru.nidecker.simulation.entity;

public class Predator extends Creature {

    private int attack;

    @Override
    public void makeMove() {

    }

    public Predator() {
    }

    public Predator(int speed, int hp) {
        super(speed, hp);
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}
