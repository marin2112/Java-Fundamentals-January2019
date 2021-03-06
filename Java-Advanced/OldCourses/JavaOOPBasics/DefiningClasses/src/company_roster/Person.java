package company_roster;

public class Person {
    private static final int DEFAULT_AGE = -1;

    private String name;
    private int age;

    public Person(String name) {
        this(name, DEFAULT_AGE);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

}
