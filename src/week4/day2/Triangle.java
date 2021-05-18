package week4.day2;

public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle() {
    }

    public Triangle(int sideA, int sideB, int sideC) {
        this.setSideA(sideA);
        this.setSideB(sideB);
        this.setSideC(sideC);
    }

    public int getSideA() {
        return sideA;
    }

    private boolean isTriangleValid() {
        if (sideA > sideA + sideB &&
                sideB > sideA + sideC &&
                sideC > sideA + sideB) {
            return false;
        }
        return true;
    }

    public boolean check() {
        return isTriangleValid();
    }

    public double func() {
        if (isTriangleValid()) {
            if (isRightAngle() != -1) {
                if (isRightAngle() == sideA) {
                    return (double) sideB * sideC / 2;
                } else if (isRightAngle() == sideB) {
                    return (double) sideA * sideC / 2;
                } else {
                    return (double) sideA * sideB / 2;
                }
            }
            return sideA + sideB + sideC;
        }
        return -1;
    }


    private int isRightAngle() {
        if (Math.pow(sideA, 2) == Math.pow(sideB, 2) + Math.pow(sideC, 2)) {
            return sideA;
        }
        if (Math.pow(sideB, 2) == Math.pow(sideA, 2) + Math.pow(sideC, 2)) {
            return sideB;
        }
        if (Math.pow(sideC, 2) == Math.pow(sideB, 2) + Math.pow(sideA, 2)) {
            return sideC;
        }
        return -1;
    }

    private boolean checkSide(int side) {
        if (side < 1 || side > 20) {
            return false;
        }
        return true;
    }

    public void setSideA(int sideA) {
        if (!checkSide(sideA)) {
            System.out.println("sideA is invalid");
            return;
        }
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (!checkSide(sideB)) {
            System.out.println("sideB is invalid");
            return;
        }
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        if (!checkSide(sideC)) {
            System.out.println("sideC is invalid");
            return;
        }
        this.sideC = sideC;
    }
}
