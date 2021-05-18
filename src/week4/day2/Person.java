package week4.day2;

public class Person {
    private String firstName;
    private String lastName;
    private String passportID;
    private int age;
    private String sex;
    private String nationality;

    public Person() {
    }

    public Person(String firstName, String lastName, String passportID, int age, String sex, String nationality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportID = passportID;
        this.age = age;
        this.sex = sex;
        this.nationality = nationality;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() < 3 || firstName.length() > 15) {
            return;
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() < 6 || firstName.length() > 20) {
            return;
        }
        this.lastName = lastName;
    }

    public String getPassportID() {
        return passportID;
    }

    private boolean checkPassportID(String passportID)
    {
        if (passportID.length() != 8) {
            return false;
        }
        if (!passportID.substring(0, 2).equals("AN")) {
            return false;
        }
        for (int i = 2; i < passportID.length(); i++) {
            if (passportID.charAt(i) < 48 || passportID.charAt(i) > 57) {
                return false;
            }
        }
        return true;
    }
    public void setPassportID(String passportID) {
        if(!checkPassportID(passportID))
        {
            return;
        }
        this.passportID = passportID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18 || age > 99) {
            return;
        }
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if ((!sex.equalsIgnoreCase("female")) && (!sex.equalsIgnoreCase("male"))) {
            return;
        }
        this.sex = sex;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void display() {
        System.out.println("Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", passportID=" + passportID +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", nationality='" + nationality + '\'' +
                '}');
    }

}
