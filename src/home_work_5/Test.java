package home_work_5;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        String [] testArr = {"4" , "alice", "cd" , "null", "fuck"};
        DataContainer<String> dataContainer  = new DataContainer<>(testArr);
        MyComparator myComparator = new MyComparator();
        System.out.println(dataContainer.toString());

        dataContainer.sort(myComparator);
        System.out.println(dataContainer.toString());
        //System.out.println(Arrays.toString(testArr));
        //System.out.println("index = " + dataContainer.add(121312352));
        //System.out.println(dataContainer.get(9));

//        System.out.println(Arrays.toString(dataContainer.getItems()));
//        System.out.println(dataContainer);
//        System.out.println("Deleted? - " + dataContainer.delete(1));
//        System.out.println(Arrays.toString(dataContainer.getItems()));
//        System.out.println("Deleted item? - " + dataContainer.delete( "33"));
//        System.out.println(Arrays.toString(dataContainer.getItems()));
//        System.out.println("Added item? - " + dataContainer.add( "hello"));
//        System.out.println(Arrays.toString(dataContainer.getItems()));


    }
}
