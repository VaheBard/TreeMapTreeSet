import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Raphael", "'Van der Vaart'", 34));
        people.add(new Person("Johan", "'Sebastian Bach'", 45));
        people.add(new Person("Volfgang", "'Amadeus Mozart'", 36));
        people.add(new Person("Jap", "'Van fon der Saar'", 25));
        people.add(new Person("Karen", "'Ter-Balyants'", 34));
        people.add(new Person("Ivan", "'Ivanov'", 28));
        people.add(new Person("Klim", "Omelyanovich", 10));
        people.add(new Person("Emiliya", "Satanova", 6));

        System.out.println("List of all persons:\n" + people);
        Predicate<Person> predicate = person -> person.getAge() < 18;
        people.removeIf(predicate);
        System.out.println("List persons over 18 years old:\n" + people);
    }
}
