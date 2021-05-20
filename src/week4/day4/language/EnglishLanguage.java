package week4.day4.language;

public class EnglishLanguage implements Language {
     private String name;
    @Override
    public String getName() {
        System.out.println("english language");
        return name;
    }
}
