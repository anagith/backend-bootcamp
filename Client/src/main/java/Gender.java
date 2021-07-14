import java.util.Random;

public enum Gender {
    MALE,
    FEMALE;

    public static Gender getRandomGender() {
        Random random = new Random();
        int i = random.nextInt();
        if (i % 2 == 0) {
            return Gender.MALE;
        }
        return Gender.FEMALE;
    }
}
