package home_work_2.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class ArraysUtils {
    public static void main(String[] args) {
        int[] container = arrayFromConsole();
        System.out.println(Arrays.toString(arrayRandom(3, 100)));
    }
    public static int[] arrayFromConsole () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int length = sc.nextInt();

        int[] array = new int[length];
        for(int i = 0; i < length; i++) {
            System.out.println("Введите элемент № " + i);
            array[i] = sc.nextInt();
        }
        sc.close();

        return array;
    }

    public static int[] arrayRandom (int size, int maxValueExclusion) {
        int[] container = new int[size];
        Random rand = new Random();

        for (int i = 0; i < container.length; i++ ) {
            container[i] = rand.nextInt(maxValueExclusion);
        }
        return container;
    }
}
