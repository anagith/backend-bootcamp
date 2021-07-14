public class PersonRequest {
    private Action action;
    private int id;
    private String name;
    private String surname;
    private Gender gender;
    private int age;

    public PersonRequest(Action action, int id) {
        this.action = action;
        this.id = id;
    }

    public PersonRequest(String name, String surname, Gender gender, int age) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
    }

    public PersonRequest(Action action, String name, String surname, Gender gender, int age) {
        this.action = action;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
    }

    public PersonRequest(Action exit) {
        this.action = exit;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
