package home_work_5;

import java.util.Arrays;
import java.util.Comparator;

public class MainApp {

    public static void main(String[] args) {
       // Integer[] array = {4,5,2,3,null, 8,9, null, null};
        DataContainer<Integer> container = new DataContainer<>(new Integer[0]);
        int index1 = container.add(1);
        int index2 = container.add(4);
        int index3 = container.add(124);
        int index4 = container.add(2345);
        int index5 = container.add(657);
        int index6 = container.add(4354);
        int index7 = container.add(null);
        int index8 = container.add(34262);
        Integer text1 = container.get(index1);
        Integer text2 = container.get(index2);
        Integer text3 = container.get(index3);
        Integer text4 = container.get(index4);
        Integer text5 = container.get(index5);
        Integer text6 = container.get(index6);
        Integer text7 = container.get(index7);
        Integer text8 = container.get(index8);
        System.out.println(text1);
        System.out.println(text2);
        System.out.println(text3);
        System.out.println(text4);
        System.out.println(text5);
        System.out.println(text6);
        System.out.println(text7);
        System.out.println(text8);


        System.out.println("\n<<<<DELETE ITEM>>>>>>>>>>>>>>");
        System.out.println(Arrays.toString(container.getItems()));
        container.delete(5);
        System.out.println(Arrays.toString(container.getItems()));


        System.out.println("\n<<<<DELETE BY INDEX>>>>>>>>>>>>>>");
        System.out.println(Arrays.toString(container.getItems()));
        container.delete(2);
        System.out.println(Arrays.toString(container.getItems()));

        System.out.println("\n<<<<TO STRING>>>>>>>>>>>>>>");
        System.out.println(container.toString());
       // container.delete(2);
        System.out.println(Arrays.toString(container.getItems()));


        System.out.println("\n<<<<SORT>>>>>>>>>>>>>>>>");
        MyComparator comparator = new MyComparator();
        System.out.println(Arrays.toString(container.getItems()));
        container.sort(comparator);
        System.out.println(Arrays.toString(container.getItems()));


    }
}
