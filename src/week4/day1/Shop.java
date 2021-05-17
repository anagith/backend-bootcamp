package week4.day1;

public class Shop {
    String name;
    String address;
    int countOfProduct;
    double priceForProduct;
    double shopBalance;

    public Shop() {
    }

    public Shop(String name, String address, int countOfProduct, double priceForProduct, double shopBalance) {
        this.name = name;
        this.address = address;
        this.countOfProduct = countOfProduct;
        this.priceForProduct = priceForProduct;
        this.shopBalance = shopBalance;
    }

    private boolean checkOrder(int count) {
        if (count <= countOfProduct) {
            return true;
        }
        return false;
    }

    public boolean wantToBuy(char ch) {
        if (ch == '1') {
            return true;
        }
        return false;
    }

    public double calculateOrder(int count) {
        return priceForProduct * count;
    }

    public void addToBalance(double shopBalance) {
        this.shopBalance = shopBalance;
    }

    public void buy(int count) {
        if (checkOrder(count)) {
            System.out.println("if you want to buy,press 1");
            Menu menu = new Menu();
            char ch = menu.scanner.next().charAt(0);
            if (wantToBuy(ch)) {
                addToBalance(calculateOrder(count));
            }
        } else {
            System.out.println("Now we don't have so much product,sorry");
        }
    }
}
