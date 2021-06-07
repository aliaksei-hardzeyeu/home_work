package home_work_6;

import java.util.Collection;
import java.util.Random;

public class Animal extends Creature {

    private int age;
    private String nick;

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
}
