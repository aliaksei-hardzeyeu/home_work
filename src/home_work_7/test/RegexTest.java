package home_work_7.test;


import home_work_7.MainApp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.*;

public class RegexTest {

    @Test
    public void wordsToArrayList1() {
        List<String> list1 = new ArrayList<>();
        list1.add("привет");
        list1.add("как");
        list1.add("дела");

        Assertions.assertEquals(list1, MainApp.wordsToArrayList("привет, как дела!"));
    }

    @Test
    public void wordsToArrayList2() {
        List<String> list2 = new ArrayList<>();
        list2.add("привет");
        list2.add("какдела");

        Assertions.assertEquals(list2, MainApp.wordsToArrayList("привет,какдела!"));
    }

    @Test
    public void wordsToArrayList3() {

        List<String> list3 = new ArrayList<>();
        list3.add("привет");
        list3.add("какдела");

        Assertions.assertEquals(list3, MainApp.wordsToArrayList("привет;какдела!"));
    }

    @Test
    public void wordsToArrayList4() {

        List<String> list4 = new ArrayList<>();
        list4.add("как");
        list4.add("дела");
        list4.add("Что");
        list4.add("делаешь");

        Assertions.assertEquals(list4, MainApp.wordsToArrayList("как дела!.Что делаешь?"));
    }

    @Test
    public void wordsToArrayList5() {

        List<String> list5 = new ArrayList<>();
        list5.add("Привет-привет");

        Assertions.assertEquals(list5, MainApp.wordsToArrayList("Привет-привет"));
    }

    @Test
    public void wordsToArrayList6() {

        List<String> list6 = new ArrayList<>();
        list6.add("Привет");
        list6.add("привет");

        Assertions.assertEquals(list6, MainApp.wordsToArrayList("Привет -привет"));
    }

    @Test
    public void wordsToArrayList7() {

        List<String> list7 = new ArrayList<>();
        list7.add("4-х");

        Assertions.assertEquals(list7, MainApp.wordsToArrayList("4-х"));
    }

    @Test
    public void wordsToArrayList8() {

        List<String> list8 = new ArrayList<>();
        list8.add("один");
        list8.add("и");
        list8.add("1");

        Assertions.assertEquals(list8, MainApp.wordsToArrayList("один и 1"));
    }

    @Test
    public void wordsToArrayList9() {

        List<String> list9 = new ArrayList<>();
        list9.add("бабушка");
        list9.add("бабушке");
        list9.add("бабушку");

        Assertions.assertEquals(list9, MainApp.wordsToArrayList("бабушка бабушке бабушку"));
    }
}
