package week4.day4.language;

public class ProgrammingLanguage implements Language {
    private String name;
    @Override
    public String getName() {
        System.out.println("Programming language");
        return name;
    }
}
