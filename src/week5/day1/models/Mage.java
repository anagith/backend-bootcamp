package week5.day1.models;

public class Mage extends Warrior {
    private Shield shield = new MagicShield();
    private final String name="Mage";
    public Mage() {
        this.setHealthPool(50);
        this.setDefence(shield);
        this.setDamage(50);
    }

    public String getName() {
        return name;
    }

    public Shield getDefence() {
        return this.shield;
    }
    public void setShield(MagicShield shield) {
        this.shield = shield;
    }

}
