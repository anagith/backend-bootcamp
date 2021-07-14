public class Person {
    private int id;
    private String name;
    private String surname;
    private Gender gender;
    private boolean isAdult;

    public Person(int id, String name, String surname, Gender gender, boolean isAdult) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.isAdult = isAdult;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }
}
