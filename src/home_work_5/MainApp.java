package home_work_5;

import java.util.Arrays;
import java.util.Comparator;

public class MainApp {

    public static void main(String[] args) {
       // Integer[] array = {4,5,2,3,null, 8,9, null, null};
        DataContainer<String> container = new DataContainer<>(new String[0]);
        int index1 = container.add("Привет");
        int index2 = container.add("Как дела");
        int index00 = container.add(null);
        int index3 = container.add("Работаю");
        int index4 = container.add("Давай потом");
        int index5 = container.add(null);
        String text1 = container.get(index1);
        String text2 = container.get(index2);
        String text3 = container.get(index3);
        String text4 = container.get(index4);
        String text5 = container.get(index5);
        String text00 = container.get(index00);
        System.out.println(text1);
        System.out.println(text2);
        System.out.println(text3);
        System.out.println(text4);
        System.out.println(text5);
        System.out.println(text00);


        System.out.println("\n<<<<DELETE ITEM>>>>>>>>>>>>>>");
        System.out.println(Arrays.toString(container.getItems()));
        container.delete(5);
        System.out.println(Arrays.toString(container.getItems()));


        System.out.println("\n<<<<DELETE BY INDEX>>>>>>>>>>>>>>");
        System.out.println(Arrays.toString(container.getItems()));
        System.out.println(container.delete(21));
        System.out.println(Arrays.toString(container.getItems()));

        System.out.println("\n<<<<TO STRING>>>>>>>>>>>>>>");
        System.out.println(container);
       // container.delete(2);
        System.out.println(Arrays.toString(container.getItems()));


        System.out.println("\n<<<<SORT>>>>>>>>>>>>>>>>");
        MyComparator comparator = new MyComparator();
        System.out.println(Arrays.toString(container.getItems()));
        container.sort(comparator);
        System.out.println(Arrays.toString(container.getItems()));


    }
}
