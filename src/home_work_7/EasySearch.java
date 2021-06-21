package home_work_7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static home_work_7.MainApp.*;

public class EasySearch implements ISearchEngine {

    /**
     * Метод ищет заданное слово и возвращает количество использований
     *
     * @param text текст, в котором ищем
     * @param word слово, которое ищем
     * @return количество использований слова
     */
    @Override
    public long search(String text, String word) {
        long count = 0;
        int index = -1;

        ArrayList<String> list = wordsToArrayList(text);

        while ((list.contains(word))) {
            index = list.indexOf(word);
            list.remove(index);
            if (index == -1) {
                return 0;
            } else {
                count++;
            }
        }

        return count;

    }
}