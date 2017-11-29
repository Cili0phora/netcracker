package Repository.Comparator;

import Repository.Person;

public class SortByAge implements IPersonComparator {
    @Override
    public int compare(Person p1, Person p2) {
        return Integer.compare(p1.getAge(), p2.getAge());
    }
}
