package week4.day2;

public class Store {
    private int countOfWorkers;
    private String name;
    private int phoneNumber;
    private int[] productNumbers;

    public Store() {
    }

    public Store(int countOfWorkers, String name, int phoneNumber, int[] productNumbers) {
        this.countOfWorkers = countOfWorkers;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.productNumbers = productNumbers;
    }

    public int getCountOfWorkers() {
        return countOfWorkers;
    }

    public void setCountOfWorkers(int countOfWorkers) {
        if (countOfWorkers < 2 || countOfWorkers > 50) {
            System.out.println("invalid count of workers");
            return;
        }
        this.countOfWorkers = countOfWorkers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 3) {
            System.out.println("invalid store name");
            return;
        }
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    private boolean checkNumber(int phoneNumber) {
        String phoneNumberString = String.valueOf(phoneNumber);
        if (phoneNumberString.length() != 8) {
            return false;
        }
        for (int i = 0; i < phoneNumberString.length(); i++) {
            if (phoneNumberString.charAt(i) < 48 || phoneNumberString.charAt(i) > 57) {
                return false;
            }
        }
        return true;
    }

    public void setPhoneNumber(int phoneNumber) {
        if (!checkNumber(phoneNumber)) {
            System.out.println("invalid phone number");
            return;
        }
        this.phoneNumber = phoneNumber;
    }

    public void sellProduct(int productNumber) {
        for (int i = 0; i < productNumbers.length; i++) {
            if (i == productNumber) {
                System.out.println("product exists");
            } else {
                System.out.println("product doesn't exist");
            }
        }
    }

    public int[] getProductNumbers() {
        return productNumbers;
    }

    public void setProductNumbers(int[] productNumbers) {
        this.productNumbers = productNumbers;
    }
}
