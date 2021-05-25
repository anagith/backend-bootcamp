package week5.day1;

import week5.day1.models.Archer;
import week5.day1.models.Mage;
import week5.day1.models.Soldier;
import week5.day1.models.SwordsMan;

import java.util.Random;

public class Battle {
    Soldier firstSoldier;
    Soldier secondSoldier;
    Random random = new Random();

    public Battle initSoldiers(int a) {
        if (a == 1) {
            this.firstSoldier = new SwordsMan();
            System.out.println("you're a swordsman");
        } else if (a == 2) {
            this.firstSoldier = new Archer();
            System.out.println("you're a archer");
        } else if (a == 3) {
            this.firstSoldier = new Mage();
            System.out.println("you're a mage");
        }
        Random random = new Random();
        int b = random.nextInt(3);
        switch (b) {
            case 0: {
                this.secondSoldier = new SwordsMan();
                System.out.println("your enemy is a swordsman "+"\n");
                break;
            }
            case 1: {
                this.secondSoldier = new Archer();
                System.out.println("your enemy is an archer"+"\n");
                break;
            }
            case 2: {
                this.secondSoldier = new Mage();
                System.out.println("your enemy is a mage"+"\n");
                break;
            }
        }
        return this;
    }

    public Battle(int a) {
        Battle battle = initSoldiers(a);
        beginBattle(battle);
    }

    public void beginBattle(Battle battle) {
        while (battle.firstSoldier.getHealthPool() > 0 && battle.secondSoldier.getHealthPool() > 0) {

            if (battle.firstSoldier.getHealthPool() > 0) {
                int firstHit = random.nextInt(100);
                System.out.println("you  hit " + firstHit);
                secondSoldier.setHealthPool(secondSoldier.getHealthPool() - firstHit * firstSoldier.getDefence() / 100);
                System.out.println("his healthPool " + secondSoldier.getHealthPool());
            }
            if (battle.secondSoldier.getHealthPool() > 0) {
                int secondHit = random.nextInt(100);
                System.out.println("he  hit " + secondHit);
                firstSoldier.setHealthPool(firstSoldier.getHealthPool() - secondHit * secondSoldier.getDefence() / 100);
                System.out.println("your healthPool " + firstSoldier.getHealthPool());
            }
        }
        if (firstSoldier.getHealthPool() > 0) {
            System.out.println("you won");
        } else {
            System.out.println("he won");
        }
    }
}
