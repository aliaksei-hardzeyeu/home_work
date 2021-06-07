package home_work_6;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Person extends Creature {

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

    @Override
    public String toString() {
        return "Person{" +
                "nick='" + nick + '\'' +
                ", password='" + password + '\'' +
                '}' + '\n';
    }


    /**
     * МЕТОД ТОЛЬКО ДЛЯ ТОГО, ЧТОБЫ ЗАПОЛНЕНИЕ TREESETа В МЭЙНЕ РАБОТАЛО
     * @param o
     * @return
     */

}
