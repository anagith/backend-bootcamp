package week5.day1.models;

public class Archer extends Warrior {
    private Shield shield = new BlockingShield();
    private final String name="Archer";
    public Archer() {
        this.setHealthPool(100);
        this.setDefence(shield);
        this.setDamage(30);
    }

    public String getName() {
        return name;
    }

    public Shield getDefence() {
        return this.shield;
    }

    public void setShield(BlockingShield shield) {
        this.shield = shield;
    }


}
