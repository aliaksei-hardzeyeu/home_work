package home_work_6;

import java.util.Collection;
import java.util.Random;

public class Person implements Comparable{

    private String nick;
    private String password;

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person(String nick, String password) {
        this.nick = nick;
        this.password = password;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "nick='" + nick + '\'' +
                ", password='" + password + '\'' +
                '}' + '\n';
    }

    /**
     * Генерирует объект Person, задаёт password и nick
     * @return объект Person
     */
    public static Person personGenerator() {

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

    /**
     * МЕТОД ТОЛЬКО ДЛЯ ТОГО, ЧТОБЫ ЗАПОЛНЕНИЕ TREESETа В МЭЙНЕ РАБОТАЛО
     * @param o
     * @return
     */
    @Override
    public int compareTo(Object o) {
        return 1;
    }
}
