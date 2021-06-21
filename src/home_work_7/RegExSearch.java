package home_work_7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static home_work_7.MainApp.allBookString;

public class RegExSearch implements ISearchEngine{

    /**
     * Метод ищет заданное слово, и возвращает количество использований
     * НЕ ЧУВСТВИТЕЛЕН К РЕГИСТРУ
     *
     * @param text текст, в котором ищем
     * @param word слово, которое ищем
     * @return количество использований
     */

    @Override
    public long search(String text, String word) {

        String wordRegex = "(?iu)\\b" + word + "\\b";

        Pattern pattern = Pattern.compile(wordRegex);
        Matcher matcher = pattern.matcher(text);
        long count = 0;

        while (matcher.find()) {
            count++;
        }

        return count;
    }
}
