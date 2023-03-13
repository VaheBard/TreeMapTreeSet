import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Raphael", "'Van der Vaart'", 34));
        people.add(new Person("Johan", "'Sebastian Bach'", 45));
        people.add(new Person("Volfgang", "'Amadeus Mozart'", 36));
        people.add(new Person("Jap", "'Van fon der Saar'", 25));
        people.add(new Person("Karen", "'Ter-Balyants'", 34));
        people.add(new Person("Ivan", "'Ivanov'", 28));

        Collections.sort(people);
        System.out.println("After sorting by default method\n" + people);

        Collections.sort(people, new PersonsSurnameIncludeWordsComparator(4));
        System.out.println("\nAfter sorting by my comparator method\n" + people);
    }
}
