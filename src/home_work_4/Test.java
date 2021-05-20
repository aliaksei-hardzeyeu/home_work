package home_work_4;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static String toString (int number) {
        String[] one = {"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
        String[] two = {"десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
        String[] three = {"двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};

        String numberString = String.valueOf(number);
        String result = "";

        String pattern0 = "0$";
        String pattern1 = "1$";
        String pattern2 = "2$";
        String pattern3 = "3$";
        String pattern4 = "4$";
        String pattern5 = "5$";
        String pattern6 = "6$";
        String pattern7 = "7$";
        String pattern8 = "8$";
        String pattern9 = "9$";

        Pattern pat1 = Pattern.compile(pattern1);
        Matcher match1 = pat1.matcher(numberString);

        Pattern pat2 = Pattern.compile(pattern2);
        Matcher match2 = pat2.matcher(numberString);

        Pattern pat3 = Pattern.compile(pattern3);
        Matcher match3 = pat3.matcher(numberString);

        if (match1.find())
            result = numberString + " часов ";
        else if (match2.find())
            result = numberString + " час ";
        else if (match3.find())
            result = numberString + " часа ";

        return result;
    }

    public static void main(String[] args) {

    }
}


