package home_work_7;

import home_work_2.sorts.SortUtils;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) {
        String text1 = "привет, как дела!";// - тут три слова "привет", "как", "дела";
        String text2 = "привет,какдела!";// - тут два слова "привет", "какдела";
        String text3 = "привет;какдела!";// - тут два слова "привет", "какдела";   !!!!!!!!!!!!!!!  ВИДИТ ОДНО СЛОВО
        String text4 = "как дела!.Что делаешь?";//- тут четыре слова "как", "дела", "Что", "делаешь"; !!!!!!!!!!!!! ВИДИТ 5 СЛОВ
        String text5 = "Привет-привет";// - тут одно слово "Привет-привет";
        String text6 = "Привет -привет";// - тут два слова "Привет", "привет";
        String text7 = "4-х";// - тут одно слово "4-х";
        String text8 = "один и 1";// - тут три слова "один", "и", "1"
        String text9 = "бабушка бабушке бабушку";// - тут три слова "бабушка", "бабушке", "бабушку"

//        numberOfWords(text1);
//        numberOfWords(text2);
//        numberOfWords(text3);
//        numberOfWords(text4);
//        numberOfWords(text5);
//        numberOfWords(text6);
//        numberOfWords(text7);
//        numberOfWords(text8);
//        numberOfWords(text9);

//        wordsToArr(text1);
//        wordsToArr(text2);
//        wordsToArr(text3);
//        wordsToArr(text4);
//        wordsToArr(text5);
//        wordsToArr(text6);
//        wordsToArr(text7);
//        wordsToArr(text8);
//        wordsToArr(text9);
    }

    public static void numberOfWords(String text) {
        String[] wordsArr = text.split("[[ ]*|[,]*|[\\.]*|[:]*|[/]*|[!]*|[?]*|[+]*]+"); //\s*(\s|,|!|\.)\s*
        System.out.println("#############################\n" + text + "\n" + Arrays.toString(wordsArr));
        System.out.println(wordsArr.length + "\n#############################");
    }

    public static ArrayList<String> wordsToArrayList (String text) {
        String pat = "\\b[а-яА-Я\\w]+(\\-[а-яА-Я\\w]+)?";
        Pattern pattern = Pattern.compile(pat);
        Matcher match1 = pattern.matcher(text);

        ArrayList<String> arrList = new ArrayList<>();

        while (match1.find()) {
            arrList.add(match1.group());
        }

        return arrList;
    }
}
