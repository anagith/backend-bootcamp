package week5.day1;

import week5.day1.models.*;

import java.util.Random;

public class Battle {
    Warrior firstWarrior;
    Warrior secondWarrior;


    public Battle(int a) {
        Battle battle = initSoldiers(a);
        beginBattle(battle);
    }

    public Battle initSoldiers(int a) {
        if (a == 1) {
            this.firstWarrior = new SwordsMan();
            System.out.println("you're a swordsman");
        } else if (a == 2) {
            this.firstWarrior = new Archer();
            System.out.println("you're an archer");
        } else if (a == 3) {
            this.firstWarrior = new Mage();
            System.out.println("you're a mage");
        }
        chooseEnemy();
        return this;
    }

    private void chooseEnemy() {
        Random random = new Random();
        int b = random.nextInt(3);
        switch (b) {
            case 0: {
                this.secondWarrior = new SwordsMan();
                System.out.println("your opponent is a swordsman " + "\n");
                break;
            }
            case 1: {
                this.secondWarrior = new Archer();
                System.out.println("your opponent is an archer" + "\n");
                break;
            }
            case 2: {
                this.secondWarrior = new Mage();
                System.out.println("your opponent is a mage" + "\n");
                break;
            }
        }
    }

    public void beginBattle(Battle battle) {
        int playerDice = throwDice();
        int opponentDice = throwDice();
        System.out.println("player's dice " + playerDice);
        System.out.println("opponent's dice " + opponentDice);
        System.out.println();
        if (playerDice >= opponentDice) {
            startWith(battle, firstWarrior, secondWarrior);
        } else {
            startWith(battle, secondWarrior, firstWarrior);
        }
        checkWinner();
    }

    private int throwDice() {
        return Dice.throwDice() + 1;
    }

    private void startWith(Battle battle, Warrior firstWarrior, Warrior secondWarrior) {
        while (battle.firstWarrior.getHealthPool() > 0 && battle.secondWarrior.getHealthPool() > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (battle.firstWarrior.getHealthPool() < 0 || secondWarrior.getHealthPool() < 0) {
                break;
            }
            System.out.println(battle.secondWarrior.getName() + "'s healthPool " + secondWarrior.getHealthPool());
            firstWarrior.attack(secondWarrior);
            System.out.println(battle.secondWarrior.getName() + "'s healthPool " + secondWarrior.getHealthPool());
            System.out.println();
            if (battle.secondWarrior.getHealthPool() < 0 || firstWarrior.getHealthPool() < 0) {
                break;
            }
            System.out.println(battle.firstWarrior.getName() + "'s healthPool " + firstWarrior.getHealthPool());
            secondWarrior.attack(firstWarrior);
            System.out.println(battle.firstWarrior.getName() + "'s healthPool " + firstWarrior.getHealthPool());
            System.out.println();
        }
    }

    private void checkWinner() {
        if (firstWarrior.getHealthPool() > 0) {
            System.out.println("you won");
        } else {
            System.out.println("opponent won");
        }
    }
}
