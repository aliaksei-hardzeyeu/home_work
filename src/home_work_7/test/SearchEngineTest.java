package home_work_7.test;

import home_work_7.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.*;

import static home_work_7.MainApp.allBookString;

public class SearchEngineTest {

    static String text = "1. \"привет, как дела!\" - тут три слова \"привет\", \"как\", \"дела\";\n" +
        "\t2. \"привет,какдела!\" - тут два слова \"привет\", \"какдела\";";


    /**
     * Тесты EasySearch
     */

    @Test
    public void search1() {

        ISearchEngine s = new EasySearch();
        Assertions.assertEquals(0 , s.search(text, "ясли"));
    }

    @Test
    public void search2() {

        EasySearch s = new EasySearch();
        Assertions.assertEquals(4 , s.search(text, "привет"));
    }

    /**
     * Результат 5, т к данный поиск не ищет отдельные слова, а ищет просто совпадения символов
     */
    @Test
    public void search3() {

        EasySearch s = new EasySearch();
        Assertions.assertEquals(5 , s.search(text, "и"));
    }

    /**
     * Тесты RegExSearch
     */

    @Test
    public void search4() {

        ISearchEngine r = new RegExSearch();
        Assertions.assertEquals(4 , r.search(text, "Привет"));
    }

    @Test
    public void search5() {

        ISearchEngine r = new RegExSearch();
        Assertions.assertEquals(4 , r.search(text, "привет"));
    }

    @Test
    public void search6() {

        ISearchEngine r = new RegExSearch();
        Assertions.assertEquals(0 , r.search(text, "и"));
    }

    /**
     * Тесты SearchEnginePunctuationNormalizer
     */

    @Test
    public void search7() {
        SearchEnginePunctuationNormalizer complicatedEngine = new SearchEnginePunctuationNormalizer(new EasySearch());

        String resultingText = "1 привет как дела тут три слова привет как дела 2 привет какдела тут два слова привет какдела ";
        Assertions.assertEquals(resultingText, complicatedEngine.replacePunctuation(text));
    }

}
