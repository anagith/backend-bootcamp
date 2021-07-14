package week5.day1.models;

public abstract class Shield {

    private int defencePoint;

    public abstract int returnHit();
    public int getDefencePoint() {
        return defencePoint;
    }

    public void setDefencePoint(int defencePoint) {
        this.defencePoint = defencePoint;
    }
}
