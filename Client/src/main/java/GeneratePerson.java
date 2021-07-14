import com.github.javafaker.Faker;

import java.util.Random;

public class GeneratePerson {
    private static final Faker instance = Faker.instance();

    public static PersonRequest generate() {
        int age = 3 + new Random().nextInt(60);
        return new PersonRequest(
                instance.name().firstName(),
                instance.name().lastName(),
                Gender.getRandomGender(),
                age
        );
    }
}
