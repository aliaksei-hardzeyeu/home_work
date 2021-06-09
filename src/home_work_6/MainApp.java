package home_work_6;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainApp {
    public static void main(String[] args) {
        collectionPersonFunctions(fillCollectionWithPerson(new HashSet<>(), 1_000_000));
        collectionPersonFunctions(fillCollectionWithPerson(new TreeSet<>(), 1_000_000));
        collectionPersonFunctions(fillCollectionWithPerson(new ArrayList<>(), 1_000_000));
        collectionPersonFunctions(fillCollectionWithPerson(new LinkedList<>(), 1_000_000));

        collectionAnimalFunctions(fillCollectionWithAnimal(new HashSet<>(), 1_000_000));
        collectionAnimalFunctions(fillCollectionWithAnimal(new TreeSet<>(), 1_000_000));
        collectionAnimalFunctions(fillCollectionWithAnimal(new ArrayList<>(), 1_000_000));
        collectionAnimalFunctions(fillCollectionWithAnimal(new LinkedList<>(), 1_000_000));
    }

    /**
     * Метод выполняет все действия с коллекциями, содержащими Person
     *
     * @param collection заданная коллекция
     */
    static void collectionPersonFunctions(Collection<Person> collection) {
        List<Person> collection2 = Stream.of(new Person[]{}).collect(Collectors.toList());
        Set<Person> collection3 = Stream.of(new Person[]{}).collect(Collectors.toSet());

        if (collection.getClass().getSimpleName().contains("List")) {
            List<Person> list = (List<Person>) collection;
            collection2 = list.stream().collect(Collectors.toList());

            long start = System.currentTimeMillis();
            Collections.sort(list, new PersonPasswordComparator().thenComparing(new PersonNickComparator()));
            long finish = System.currentTimeMillis();
            System.out.println("Операция СОРТИРОВКА " + collection.getClass().getSimpleName() + " 2МЯ КОМПАРАТОРАМИ ЗАНЯЛА " + (finish - start) + " МС");
        } else {
            collection3.addAll(collection);
            long start = System.currentTimeMillis();
            List<Person> setList = new ArrayList<>(collection);
            Collections.sort(setList, new PersonPasswordComparator().thenComparing(new PersonNickComparator()));
            long finish = System.currentTimeMillis();
            System.out.println("Операция СОРТИРОВКА " + collection.getClass().getSimpleName() + " 2МЯ КОМПАРАТОРАМИ заняла " + (finish - start) + " МС");
        }

        Iterator<Person> iter1 = collection.iterator();
        long start = System.currentTimeMillis();

        while (iter1.hasNext()) {
            iter1.next();
        }

        long finish = System.currentTimeMillis();
        System.out.println("Операция ИТЕРИРОВАНИЕ " + collection.getClass().getSimpleName() + " С ПОМОЩЬЮ ИТЕРАТОРА заняла " + (finish - start) + " МС");

        start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {

        }

        finish = System.currentTimeMillis();
        System.out.println("Операция ИТЕРИРОВАНИЕ " + collection.getClass().getSimpleName() + " С ПОМОЩЬЮ FOR_I заняла " + (finish - start) + " МС");

        Iterator<Person> iter2 = collection.iterator();
        start = System.currentTimeMillis();
        while (iter2.hasNext()) {
            iter2.next();
            iter2.remove();
        }

        finish = System.currentTimeMillis();
        System.out.println("Операция УДАЛЕНИЕ ВСЕХ ЭЛЕМЕНТОВ " + collection.getClass().getSimpleName() + " С ПОМОЩЬЮ ИТЕРАТОРА заняла " + (finish - start) + " МС");

        if (collection2.size() != 0) {
            start = System.currentTimeMillis();
            for (int i = collection2.size() - 1; i >= 0; i--) {
                collection2.remove(i);
            }

            finish = System.currentTimeMillis();
            System.out.println("Операция УДАЛЕНИЕ ВСЕХ ЭЛЕМЕНТОВ " + collection2.getClass().getSimpleName() + " С ПОМОЩЬЮ FOR_I заняла " + (finish - start) + " МС");
        } else {
            start = System.currentTimeMillis();
            collection3.removeIf(person -> (person != null));

            finish = System.currentTimeMillis();
            System.out.println("Операция УДАЛЕНИЕ ВСЕХ ЭЛЕМЕНТОВ " + collection3.getClass().getSimpleName() + " С ПОМОЩЬЮ REMOVE_IF заняла " + (finish - start) + " МС");
        }
        System.out.println("**********************************************************");
    }

    /**
     * Метод выполняет все действия с коллекциями, содержащими Animal
     *
     * @param collection заданная коллекция
     */
    static void collectionAnimalFunctions(Collection<Animal> collection) {
        List<Animal> collection2 = Stream.of(new Animal[]{}).collect(Collectors.toList());
        Set<Animal> collection3 = Stream.of(new Animal[]{}).collect(Collectors.toSet());

        if (collection.getClass().getSimpleName().contains("List")) {
            List<Animal> list = (List<Animal>) collection;
            collection2 = list.stream().collect(Collectors.toList());

            long start = System.currentTimeMillis();
            Collections.sort(list, new AnimalAgeComparator().thenComparing(new AnimalNickComparator()));
            long finish = System.currentTimeMillis();
            System.out.println("Операция СОРТИРОВКА " + collection.getClass().getSimpleName() + " 2МЯ КОМПАРАТОРАМИ заняла " + (finish - start) + " МС");
        } else {
            collection3.addAll(collection);
            long start = System.currentTimeMillis();
            List<Animal> setList = new ArrayList<>(collection);
            Collections.sort(setList, new AnimalAgeComparator().thenComparing(new AnimalNickComparator()));
            long finish = System.currentTimeMillis();
            System.out.println("Операция СОРТИРОВКА " + collection.getClass().getSimpleName() + " 2МЯ КОМПАРАТОРАМИ заняла " + (finish - start) + " МС");
        }

        Iterator<Animal> iter1 = collection.iterator();
        long start = System.currentTimeMillis();

        while (iter1.hasNext()) {
            iter1.next();
        }

        long finish = System.currentTimeMillis();
        System.out.println("Операция ИТЕРИРОВАНИЕ " + collection.getClass().getSimpleName() + " С ПОМОЩЬЮ ИТЕРАТОРА заняла " + (finish - start) + " МС");

        start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {

        }

        finish = System.currentTimeMillis();
        System.out.println("Операция ИТЕРИРОВАНИЕ " + collection.getClass().getSimpleName() + " С ПОМОЩЬЮ FOR_I заняла " + (finish - start) + " МС");

        Iterator<Animal> iter2 = collection.iterator();
        start = System.currentTimeMillis();
        while (iter2.hasNext()) {
            iter2.next();
            iter2.remove();
        }

        finish = System.currentTimeMillis();
        System.out.println("Операция УДАЛЕНИЕ ВСЕХ ЭЛЕМЕНТОВ " + collection.getClass().getSimpleName() + " С ПОМОЩЬЮ ИТЕРАТОРА заняла " + (finish - start) + " МС");

        if (collection2.size() != 0) {
            start = System.currentTimeMillis();
            for (int i = collection2.size() - 1; i >= 0; i--) {
                collection2.remove(i);
            }

            finish = System.currentTimeMillis();
            System.out.println("Операция УДАЛЕНИЕ ВСЕХ ЭЛЕМЕНТОВ " + collection2.getClass().getSimpleName() + " С ПОМОЩЬЮ FOR_I заняла " + (finish - start) + " МС");
        } else {
            start = System.currentTimeMillis();
            collection3.removeIf(Animal -> (Animal != null));

            finish = System.currentTimeMillis();
            System.out.println("Операция УДАЛЕНИЕ ВСЕХ ЭЛЕМЕНТОВ " + collection3.getClass().getSimpleName() + " С ПОМОЩЬЮ REMOVE_IF заняла " + (finish - start) + " МС");
        }
        System.out.println("**********************************************************");
    }

    /**
     * Генерирует объекты Person со случайными password и nick
     * Заполняет указанную коллекцию указанным количеством объектов Person
     *
     * @param collection тип коллекции
     * @param number     количество объектов
     * @return заполненная коллекция
     */
    static Collection<Person> fillCollectionWithPerson(Collection<Person> collection, int number) {
        System.out.println("#################РАБОТАЕМ С PERSON#################");

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

        long start = System.currentTimeMillis();
        for (int i = 0; i < number; i++) {
            collection.add(personSupplier.get());
        }
        long finish = System.currentTimeMillis();
        System.out.println("Операция ЗАПОЛНЕНИЕ " + collection.getClass().getSimpleName() + " заняла " + (finish - start) + " МС");
        return collection;
    }

    /**
     * Генерирует объекты Animal со случайными age и nick
     * Заполняет указанную коллекцию указанным количеством объектов Animal
     *
     * @param collection тип коллекции
     * @param number     количество объектов
     * @return заполненная коллекция
     */
    static Collection<Animal> fillCollectionWithAnimal(Collection<Animal> collection, int number) {
        System.out.println("#################РАБОТАЕМ С ANIMAL#################");

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

        long start = System.currentTimeMillis();
        for (int i = 0; i < number; i++) {
            collection.add(animalSupplier.get());
        }
        long finish = System.currentTimeMillis();
        System.out.println("Операция ЗАПОЛНЕНИЕ " + collection.getClass().getSimpleName() + " заняла " + (finish - start) + " МС");
        return collection;
    }

}


