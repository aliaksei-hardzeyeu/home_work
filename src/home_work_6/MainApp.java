package home_work_6;

import java.util.*;
import java.util.function.Supplier;

public class MainApp {
    public static void main(String[] args) {
//        long start = System.currentTimeMillis();
//        MainApp.fillCollectionWithPerson(new ArrayList<>(), 1_000_000);
//        long finish = System.currentTimeMillis();
//        System.out.println("ArrayList filling took " + (finish - start));

//        start = System.currentTimeMillis();
//        arrayList.sort(new PersonPasswordComparator().thenComparing(new PersonNickComparator()));
//        finish = System.currentTimeMillis();
//        System.out.println("ArrayList sorting by 2 comparators took " + (finish - start));
//
//        Iterator<Person> iter = arrayList.iterator();
//        start = System.currentTimeMillis();
//        while (iter.hasNext()) {
//               iter.next();
//        }
//        finish = System.currentTimeMillis();
//        System.out.println("ArrayList iterating by iterator all elements took " + (finish - start));
//
//        start = System.currentTimeMillis();
//        for (int i = 0; i < 1_000_000; i++) {
//            arrayList.get(i);
//        }
//        finish = System.currentTimeMillis();
//        System.out.println("ArrayList iterating by for_i all elements took " + (finish - start));
//
//        start = System.currentTimeMillis();
//        while (iter.hasNext()) {
//            iter.next();
//            iter.remove();
//        }
//        finish = System.currentTimeMillis();
//        System.out.println("ArrayList iterator removing all elements took " + (finish - start));
//
//        start = System.currentTimeMillis();
//        for (int i = 999999; i >= 0; i--) {
//            arrayList.remove(i);
//        }
//        finish = System.currentTimeMillis();
//        System.out.println("ArrayList for_i removing all elements took " + (finish - start));
        System.out.println(MainApp.fillCollectionWithPerson(new TreeSet<>(), 13));
        System.out.println(MainApp.fillCollectionWithAnimal(new HashSet<>(), 2));
    }


    /**
     * Генерирует объекты Person со случайными password и nick
     * Заполняет указанную коллекцию указанным количеством объектов Person
     *
     * @param collection тип коллекции
     * @param number количество объектов
     * @return заполненная коллекция
     */
    static Collection<Person> fillCollectionWithPerson(Collection<Person> collection, int number) {

        Supplier<Person> personSupplier = () -> {

            int passwordSize = (int) (Math.random() * 5) + 5;
            char[] passwordChar = new char[passwordSize];
            Random random = new Random();
            String setOfCharactersForPassword = "1234567890qwertyuioplkjhgfdsazxcvbnmQWERTYUIOPLKJHGFDSAZXCVBNM";

            for (int i = 0; i < passwordSize; i++) {
                int randomInt = random.nextInt(setOfCharactersForPassword.length());
                char randomChar = setOfCharactersForPassword.charAt(randomInt);
                passwordChar[i] = randomChar;
            }
            String password = String.valueOf(passwordChar);

            String setOfCharactersForNick = "qwertyuioplkjhgfdsazxcvbnmQWERTYUIOPLKJHGFDSAZXCVBNM";
            int nickSize = (int) (Math.random() * 10) + 4;
            char[] nickChar = new char[nickSize];

            for (int i = 0; i < nickSize; i++) {
                int randomInt = random.nextInt(setOfCharactersForNick.length());
                char randomChar = setOfCharactersForNick.charAt(randomInt);
                nickChar[i] = randomChar;
            }
            String nick = String.valueOf(nickChar);

            return new Person(password, nick);
        };

        for (int i = 0; i < number; i++) {
            collection.add(personSupplier.get());
        }
        return collection;
    }

    /**
     * Генерирует объекты Animal со случайными age и nick
     * Заполняет указанную коллекцию указанным количеством объектов Animal
     *
     * @param collection тип коллекции
     * @param number количество объектов
     * @return заполненная коллекция
     */
    static Collection<Animal> fillCollectionWithAnimal(Collection<Animal> collection, int number) {

        Supplier<Animal> animalSupplier = () -> {
            int age = (int) (Math.random() * 14) + 1;

            Random random = new Random();
            String setOfCharactersForNick = "qwertyuioplkjhgfdsazxcvbnmQWERTYUIOPLKJHGFDSAZXCVBNM";
            int nickSize = (int) (Math.random() * 10) + 4;
            char[] nickChar = new char[nickSize];

            for (int i = 0; i < nickSize; i++) {
                int randomInt = random.nextInt(setOfCharactersForNick.length());
                char randomChar = setOfCharactersForNick.charAt(randomInt);
                nickChar[i] = randomChar;
            }

            String nick = String.valueOf(nickChar);

            return new Animal(age, nick);
        };

        for (int i = 0; i < number; i++) {
            collection.add(animalSupplier.get());
        }
        return collection;
    }

}


