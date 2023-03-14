import java.util.Comparator;

public class PersonsSurnameIncludeWordsComparator implements Comparator<Person> {
    private final int maxAmountOfWordsInSurname;
    public PersonsSurnameIncludeWordsComparator(int maxAmountOfWordsInSurname) {
        this.maxAmountOfWordsInSurname = maxAmountOfWordsInSurname;
    }

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getSurnameSetLength() >= maxAmountOfWordsInSurname && o2.getSurnameSetLength() >= maxAmountOfWordsInSurname) {
            return Integer.compare(o2.getAge(), o1.getAge());
        } else {
            if (o1.getSurnameSetLength() < o2.getSurnameSetLength()) {
                return 1;
            } else if (o1.getSurnameSetLength() > o2.getSurnameSetLength()) {
                return -1;
            } else {
                return Integer.compare(o2.getAge(), o1.getAge());
            }
        }
    }
}
