package practice08;

public class Person {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce() {
        return String.format("My name is %s. I am %d years old.", this.name, this.age);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Person ? this.id == ((Person)obj).id : false;
    }

    @Override
    public int hashCode() {
        return this.id;
    }
}
