import java.util.*;

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

        people.sort((o1, o2) -> {
            int a = 5; /*here we set max amount of words in surname,
                         if the words in surname will be less than this digit
                         the comparison will be based on the number of words in the surname,
                         else comparison will be based on age*/
            if (o1.getSurnameSetLength() > a && o2.getSurnameSetLength() > a) {
                return o2.getSurnameSetLength() - o1.getSurnameSetLength();
            }
            return o2.getAge() - o1.getAge();
        });
        System.out.println("\nAfter sorting by my comparator method\n" + people);
    }
}
