package home_work_6;

import java.util.Comparator;

public class AnimalNickComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getNick().compareTo(o2.getNick());
    }
}
