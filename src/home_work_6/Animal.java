package home_work_6;

import java.util.Collection;
import java.util.Random;

public class Animal {

    private int age;
    private String nick;

    public Animal(int age, String nick) {
        this.age = age;
        this.nick = nick;
    }

    public Animal() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", nick='" + nick + '\'' +
                '}' + '\n';
    }

    /**
     * Генерирует объект Animal, задаёт age и nick
     * @return объект Animal
     */
    public static Animal animalGenerator() {

        Animal animal = new Animal();
        int ageSize = (int) (Math.random() * 15) + 1;  ????????ОСТАНОВИЛСЯ ЗДЕСЬ!!!! ПЕРЕДЕЛАТЬ ИЗ ПЁРСОНА В ЭНИМАЛ
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
     * Метод заполняет переданный тип коллекции заданным количеством объектов Person
     * @param collection тип коллекции
     * @param number количество объектов
     * @return возвращает заполненную коллекцию
     */
    public static Collection<Person> fillCollection (Collection<Person> collection, int number) {
        for (int i = 0; i < number; i++) {
            collection.add(personGenerator());
        }
        return collection;
    }
}
