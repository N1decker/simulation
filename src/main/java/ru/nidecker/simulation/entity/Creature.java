package ru.nidecker.simulation.entity;

public abstract class Creature extends Entity {

    private int speed;
    private int hp;

    public abstract void makeMove();

    public Creature() {
    }

    public Creature(int speed, int hp) {
        this.speed = speed;
        this.hp = hp;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
