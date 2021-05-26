package week5.day1.models;

public class MagicShield extends Shield {
    public MagicShield() {
        this.setDefencePoint(50);
    }

    @Override
    public int returnHit() {
        return getDefencePoint() / 100;
    }
}
