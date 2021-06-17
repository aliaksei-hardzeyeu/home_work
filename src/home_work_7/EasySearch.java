package home_work_7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static home_work_7.MainApp.*;

public class EasySearch implements ISearchEngine {

    public static void main(String[] args) {
        EasySearch s = new EasySearch();
        System.out.println(s.search(allBookString, "букет"));
    }


    @Override
    public long search(String text, String word) {
        long count = 0;
        int index = 0;

        do {
            index = text.indexOf(word, index+1);
            count++;
        } while ((text.indexOf(word, index+1) != -1));

        return count;
    }
}