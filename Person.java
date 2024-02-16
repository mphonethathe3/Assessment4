import java.util.Arrays;

public class Person {
    private String name;
    private int age;
    private String gender;
    private String[] interests;

    public Person(String name, int age, String gender, String[] interests) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.interests = interests;
    }

    public String hello() {
        return "Hello, my name is " + name + ". I am " + age + " years old. My interests are: " + Arrays.toString(interests);
    }

    public static void main(String[] args) {
        Person person = new Person(
                "Ryuk",
                35,
                "male",
                new String[]{"being a hardarse", "agile", "SSD hard drives"}
        );
        String greeting = person.hello();
        System.out.println(greeting);
    }
}
