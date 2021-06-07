package home_work_6;

public class Creature implements Comparable {
    private String nick;

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public Creature() {
    }

    /**
     * МЕТОД ТОЛЬКО ДЛЯ ТОГО, ЧТОБЫ ЗАПОЛНЕНИЕ TREESETа В МЭЙНЕ РАБОТАЛО
     *
     * @param o
     * @return
     */
    @Override
    public int compareTo(Object o) {
        return 1;
    }
}
