package week5.day1.models;

public class BlockingShield extends Shield{
    public BlockingShield() {
        this.setDefencePoint(80);
    }

    @Override
    public int returnHit() {
        return 0;
    }
}
