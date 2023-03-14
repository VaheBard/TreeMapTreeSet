import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Person implements Comparable<Person> {
    private String name;
    private String surname;
    private int age;
    private final Set<String> surnameSet;
    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.surnameSet = new HashSet<>(List.of(surname.split("\\P{IsAlphabetic}+")));
    }
    public int getSurnameSetLength() {
        return surnameSet.size();
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + "-" + surname + "-" + age;
    }

    @Override
    public int compareTo(Person o) {
        if (age < o.age) {
            return -1;
        } else if (age > o.age) {
            return 1;
        } else {
            return name.compareTo(o.name);
        }
    }
}
