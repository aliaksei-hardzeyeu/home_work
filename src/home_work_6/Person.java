package home_work_6;

import java.util.*;

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

    @Override
    public String toString() {
        return "Person{" +
                "nick='" + nick + '\'' +
                ", password='" + password + '\'' +
                '}' + '\n';
    }

    @Override
    public int compareTo(Object o) {
        return 1;
    }
}
