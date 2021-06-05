package home_work_6;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        PersonPasswordComparator comp1 = new PersonPasswordComparator();
        PersonNickComparator comp2 = new PersonNickComparator();
//
//        System.out.println(Person.fillCollection(new ArrayList<>(), 1_0) + "\n**********");
//        System.out.println(Person.fillCollection(new LinkedList<>(), 1_0) + "\n**********");
//        System.out.println(Person.fillCollection(new HashSet<>(), 1_0) + "\n**********");
        System.out.println(Person.fillCollection(new TreeSet<>(comp1.thenComparing(comp2)), 1_0) + "\n**********");

        }
    }

