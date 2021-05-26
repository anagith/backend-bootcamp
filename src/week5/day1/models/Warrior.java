package week5.day1.models;

import java.util.Random;

public abstract class Warrior {
    private String name;
    private int healthPool;
    private Shield defence;
    private int damage;

    public void attack(Warrior opponent) {
        Random random = new Random();
        int damage = takeDamage(opponent) + random.nextInt(10)-random.nextInt(10);
        System.out.println("hit " + damage);
        opponent.setHealthPool(opponent.getHealthPool() - damage);
        this.setHealthPool(this.getHealthPool()- this.getDamage()*opponent.getDefence().returnHit());
    }

    private int takeDamage(Warrior opponent) {
        return this.getDamage() * opponent.getPower() / 100;
    }


    public int getPower() {
        return this.getDefence().getDefencePoint();
    }


    public int getHealthPool() {
        return healthPool;
    }

    public void setHealthPool(int healthPool) {
        if(healthPool<0)
        {
            this.healthPool=0;
        }
        else {
            this.healthPool = healthPool;
        }
    }

    public Shield getDefence() {
        return defence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDefence(Shield defence) {
        this.defence = defence;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
