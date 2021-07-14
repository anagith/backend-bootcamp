package week5.day1.models;

public class SwordsMan extends Warrior {
    private Shield shield = new BlockingShield();
    private final String name="Swordsman";

    public SwordsMan() {
        this.setHealthPool(200);
        this.setDefence(shield);
        this.setDamage(40);
    }

    public Shield getDefence() {
        return this.shield;
    }

    public String getName() {
        return name;
    }

    public void setShield(BlockingShield shield) {
        this.shield = shield;
    }
}
