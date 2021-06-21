package home_work_7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static home_work_7.MainApp.*;

public class EasySearch implements ISearchEngine {

    /**
     * Метод ищет заданную последовательность символов, и возвращает количество использований
     *
     * @param text текст, в котором ищем
     * @param word набор символов, который ищем
     * @return количество использований
     */
    @Override
    public long search(String text, String word) {
        long count = 0;
        int index = -1;

        do {
            index = text.indexOf(word, index+1);
            if (index == -1) {
                return 0;
            } else {
            count++;
            }
        } while ((text.indexOf(word, index+1) != -1));

        return count;
    }
}