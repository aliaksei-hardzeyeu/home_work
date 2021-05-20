package home_work_4;
/**
 * Строки. Все методы пишутся в одном классе:
 * 1.* Написать метод String toString(int number).
 * 1.1 В данном методе произвести конвертацию переданного числа в число прописью. Числа от - 999 999 999 до 999 999 999
 * 1.2 Пример передали: 223. Получили "Двести двадцать три"
 * 2.* Написать метод String toString(double number).
 * 2.1 В данном методе произвести конвертацию переданного числа в число прописью. Выводить до сотых, без округления.
 * 2.2 Пример передали: 223.1599999. Получили "Двести двадцать три целых пятнадцать сотых".

/**3.1 В данном методе посчитать количество прошедших недель по переданному числу дней.
 3.2 Пример передали: 5. Получили "0 недель"
 3.3 Пример передали: 14. Получили "2 недели"
 3.4 Пример передали: 177. Получили "25 недель"*/
/**4. Написать метод String toHoursMinuteSecondMillisecond(long millisecond, boolean shortFormat).
 4.1 В данном методе конвертируют переданные миллисекунды в количество часов, минут, секунд и миллисекунд.
 4.2 В зависимости от параметра shortFormat возвращать либо короткое написание в формате HH:mm:ss.SSS, где HH - это часы,
 mm - это минуты, ss - это секунды, SSS - это миллисекунды. Либо полное написание
 4.3 Пример передали: 7789001, true. Получили 02:09:49.001 - прошу обратить что в цифрах могут быть ведущие нули: "02", "09"
 4.4 Пример передали: 7789001, false. Получили 2 часа 9 минут 49 секунд 1 миллисекунда*/

import java.util.Formatter;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Regex {
    public static String toWeek(int day) {
        int week = day / 7;
        String weekString = String.valueOf(week);
        String result = "";

        String pattern1 = "0$|5$|6$|7$|8$|9$|10$";
        String pattern2 = "1$";
        String pattern3 = "2$|3$|4$";

        Pattern pat1 = Pattern.compile(pattern1);
        Matcher match1 = pat1.matcher(weekString);

        Pattern pat2 = Pattern.compile(pattern2);
        Matcher match2 = pat2.matcher(weekString);

        Pattern pat3 = Pattern.compile(pattern3);
        Matcher match3 = pat3.matcher(weekString);

        if (match1.find())
            result = weekString + " недель";
        else if (match2.find())
            result = weekString + " неделя";
        else if (match3.find())
            result = weekString + " недели";

        return result;
    }

    public static String toHoursMinuteSecondMillisecond(long millisecond, boolean shortFormat) {
        String s;
        long hour = millisecond / 3_600_000;
        long minute = (millisecond - (hour * 3_600_000)) / 60_000;
        long second = (millisecond - (hour * 3_600_000) - minute * 60_000) / 1000;
        long ms = millisecond - hour * 3_600_000 - minute * 60_000 - second * 1000;

        if (shortFormat) {
            s = String.format("%02d:%02d:%02d.%03d", hour, minute, second, ms);
        } else {
            s = hourEnding(hour) + minuteEnding(minute) + secondEnding(second) + msEnding(ms);

        }
        return s;
    }


    /**
     * Выбирает падеж для слова "час"
     * @param hour
     * @return слово "час" в нужном падеже
     */
    public static String hourEnding(long hour) {
        String hourString = String.valueOf(hour);
        String result = "";

        String pattern1 = "0$|5$|6$|7$|8$|9$";
        String pattern2 = "1$";
        String pattern3 = "2$|3$|4$";

        Pattern pat1 = Pattern.compile(pattern1);
        Matcher match1 = pat1.matcher(hourString);

        Pattern pat2 = Pattern.compile(pattern2);
        Matcher match2 = pat2.matcher(hourString);

        Pattern pat3 = Pattern.compile(pattern3);
        Matcher match3 = pat3.matcher(hourString);

        if (match1.find())
            result = hourString + " часов ";
        else if (match2.find())
            result = hourString + " час ";
        else if (match3.find())
            result = hourString + " часа ";

        return result;
    }
    /**
     * Выбирает падеж для слова "минута"
     * @param minute
     * @return слово "минута" в нужном падеже
     */
    public static String minuteEnding(long minute) {
        String minuteString = String.valueOf(minute);
        String result = "";

        String pattern1 = "0$|5$|6$|7$|8$|9$";
        String pattern2 = "1$";
        String pattern3 = "2$|3$|4$";

        Pattern pat1 = Pattern.compile(pattern1);
        Matcher match1 = pat1.matcher(minuteString);

        Pattern pat2 = Pattern.compile(pattern2);
        Matcher match2 = pat2.matcher(minuteString);

        Pattern pat3 = Pattern.compile(pattern3);
        Matcher match3 = pat3.matcher(minuteString);

        if (match1.find())
            result = minuteString + " минут ";
        else if (match2.find())
            result = minuteString + " минута ";
        else if (match3.find())
            result = minuteString + " минуты ";

        return result;
    }
    /**
     * Выбирает падеж для слова "секунда"
     * @param second
     * @return слово "секунда" в нужном падеже
     */
    public static String secondEnding(long second) {
        String secondString = String.valueOf(second);
        String result = "";

        String pattern1 = "0$|5$|6$|7$|8$|9$";
        String pattern2 = "1$";
        String pattern3 = "2$|3$|4$";

        Pattern pat1 = Pattern.compile(pattern1);
        Matcher match1 = pat1.matcher(secondString);

        Pattern pat2 = Pattern.compile(pattern2);
        Matcher match2 = pat2.matcher(secondString);

        Pattern pat3 = Pattern.compile(pattern3);
        Matcher match3 = pat3.matcher(secondString);

        if (match1.find())
            result = secondString + " секунд ";
        else if (match2.find())
            result = secondString + " секунда ";
        else if (match3.find())
            result = secondString + " секунды ";

        return result;
    }
    /**
     * Выбирает падеж для слова "миллисекунда"
     * @param ms
     * @return слово "миллисекунда" в нужном падеже
     */
    public static String msEnding(long ms) {
        String msString = String.valueOf(ms);
        String result = "";

        String pattern1 = "0$|5$|6$|7$|8$|9$";
        String pattern2 = "1$";
        String pattern3 = "2$|3$|4$";

        Pattern pat1 = Pattern.compile(pattern1);
        Matcher match1 = pat1.matcher(msString);

        Pattern pat2 = Pattern.compile(pattern2);
        Matcher match2 = pat2.matcher(msString);

        Pattern pat3 = Pattern.compile(pattern3);
        Matcher match3 = pat3.matcher(msString);

        if (match1.find())
            result = msString + " миллисекунд ";
        else if (match2.find())
            result = msString + " миллисекунда ";
        else if (match3.find())
            result = msString + " миллисекунды ";

        return result;
    }


    public static void main(String[] args) {
        System.out.println(toWeek(177));
        System.out.println(toHoursMinuteSecondMillisecond(778900100, false));
    }
}
