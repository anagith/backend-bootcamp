package week5.day1.models;

public class Archer extends Soldier {
    public Archer() {
        this.defence=20;
        this.healthPool=100;
    }
    public int getHealthPool() {
        return healthPool;
    }

    public void setHealthPool(int healthPool) {
        this.healthPool = healthPool;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }
}
