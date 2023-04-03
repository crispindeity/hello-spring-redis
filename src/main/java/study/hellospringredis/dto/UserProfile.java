package study.hellospringredis.dto;

public class UserProfile {

    private final String name;
    private final int age;

    public UserProfile(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
