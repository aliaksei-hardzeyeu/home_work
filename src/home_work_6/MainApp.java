package home_work_6;

import java.util.*;

public class MainApp {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ArrayList arrayList = (ArrayList) MainApp.fillCollection(new ArrayList<>(), 1_000_000, "Person");
        long finish = System.currentTimeMillis();
        System.out.println("ArrayList filling took " + (finish - start));

        start = System.currentTimeMillis();
        arrayList.sort(new PersonPasswordComparator().thenComparing(new PersonNickComparator()));
        finish = System.currentTimeMillis();
        System.out.println("ArrayList sorting by 2 comparators took " + (finish - start));

        Iterator<Person> iter = arrayList.iterator();
        start = System.currentTimeMillis();
        while (iter.hasNext()) {
               iter.next();
        }
        finish = System.currentTimeMillis();
        System.out.println("ArrayList iterating by iterator all elements took " + (finish - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            arrayList.get(i);
        }
        finish = System.currentTimeMillis();
        System.out.println("ArrayList iterating by for_i all elements took " + (finish - start));

        start = System.currentTimeMillis();
        while (iter.hasNext()) {
            iter.next();
            iter.remove();
        }
        finish = System.currentTimeMillis();
        System.out.println("ArrayList iterator removing all elements took " + (finish - start));

//        start = System.currentTimeMillis();
//        for (int i = 999999; i >= 0; i--) {
//            arrayList.remove(i);
//        }
//        finish = System.currentTimeMillis();
//        System.out.println("ArrayList for_i removing all elements took " + (finish - start));

    }


    /**
     * @param collection тип коллекции
     * @param number     количество объектов
     * @param type       тип объекта
     * @return возвращает заполненную коллекцию
     */
    static Collection<?> fillCollection(Collection<? super Creature> collection, int number, String type) {
        if (type.equals("Person")) {
            for (int i = 0; i < number; i++) {
                collection.add(personGenerator());
            }
        } else if (type.equals("Animal")) {
            for (int i = 0; i < number; i++) {
                collection.add(animalGenerator());
            }
        }
        return collection;
    }

    /**
     * Генерирует объект Person, задаёт password и nick
     *
     * @return объект Person
     */
    static Person personGenerator() {

        Person person = new Person();
        int passwordSize = (int) (Math.random() * 5) + 5;
        char[] password = new char[passwordSize];
        Random random = new Random();
        String setOfCharactersForPassword = "1234567890qwertyuioplkjhgfdsazxcvbnmQWERTYUIOPLKJHGFDSAZXCVBNM";

        for (int i = 0; i < passwordSize; i++) {
            int randomInt = random.nextInt(setOfCharactersForPassword.length());
            char randomChar = setOfCharactersForPassword.charAt(randomInt);
            password[i] = randomChar;
        }
        person.setPassword(new String(password));

        String setOfCharactersForNick = "qwertyuioplkjhgfdsazxcvbnmQWERTYUIOPLKJHGFDSAZXCVBNM";
        int nickSize = (int) (Math.random() * 10) + 4;
        char[] nick = new char[nickSize];

        for (int i = 0; i < nickSize; i++) {
            int randomInt = random.nextInt(setOfCharactersForNick.length());
            char randomChar = setOfCharactersForNick.charAt(randomInt);
            nick[i] = randomChar;
        }
        person.setNick(new String(nick));

        return person;
    }

    /**
     * Генерирует объект Animal, задаёт age и nick
     *
     * @return объект Animal
     */
    static Animal animalGenerator() {
        Animal animal = new Animal();

        int age = (int) (Math.random() * 14) + 1;
        animal.setAge(age);

        Random random = new Random();
        String setOfCharactersForNick = "qwertyuioplkjhgfdsazxcvbnmQWERTYUIOPLKJHGFDSAZXCVBNM";
        int nickSize = (int) (Math.random() * 10) + 4;
        char[] nick = new char[nickSize];

        for (int i = 0; i < nickSize; i++) {
            int randomInt = random.nextInt(setOfCharactersForNick.length());
            char randomChar = setOfCharactersForNick.charAt(randomInt);
            nick[i] = randomChar;
        }
        animal.setNick(new String(nick));

        return animal;
    }

}


