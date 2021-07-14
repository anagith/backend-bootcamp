public enum Gender {
    MALE,
    FEMALE;

    public static Gender getGender(String str) {
        if (str.equalsIgnoreCase(String.valueOf(Gender.FEMALE))) {
            return Gender.FEMALE;
        } else if (str.equalsIgnoreCase(String.valueOf(Gender.MALE))) {
            return Gender.MALE;
        }
        return null;
    }
}
