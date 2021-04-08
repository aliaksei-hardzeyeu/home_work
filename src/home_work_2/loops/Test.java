package home_work_2.loops;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
     int[] container = {22, 11, -10, 99, 87, -13, -27};
     shrinkArray(container, 10, 60);
     sumOfNumbers(container);
    }

    public static void shrinkArray (int[] container, int lowerRange, int upperRange) {
        System.out.println();
        System.out.println(Arrays.toString(container));
        System.out.println("Сжать массив, удалив элементы, принадлежащие интервалу от " + lowerRange + " до " + upperRange);
        for (int i = 0; i < container.length; i++)
            if (container[i] <= upperRange && container[i] >= lowerRange) container[i] = 0;

        int newLength = 0;
        for (int element:container) {
            if (element != 0) newLength++;
        }

        int[] newContainer = new int[newLength];

        int count = 0;
        for (int element:container) {
            if (element != 0) {
                newContainer[count] = element;
                count++;
            }
        }
        System.out.println(Arrays.toString(newContainer));
    }
    public static void sumOfNumbers (int[] container) {
        System.out.println();
        System.out.println(Arrays.toString(container));
        System.out.println("Сумма цифр массива");
        int sum = 0;
        for (int i = 0; i < container.length;i++) {
            int elementSum;
            int n = Math.abs(container[i]);
            for (elementSum = 0; n!=0; n = n/10) {
                elementSum += n % 10;
            }
            sum = sum + elementSum;
        }
        System.out.println(sum);
    }
}




