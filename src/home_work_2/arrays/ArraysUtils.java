package home_work_2.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class ArraysUtils {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayFromConsole()));
        System.out.println(Arrays.toString(arrayRandom(3, 100)));
        sc.close();
    }

    /**
     *Метод для ввода элементов массива
     * @return int[] массив, введённый с клавиатуры
     */
    public static int[] arrayFromConsole () {
        System.out.println("Введите размер массива");
        int length = sc.nextInt();

        int[] array = new int[length];
        for(int i = 0; i < length; i++) {
            System.out.println("Введите элемент № " + i);
            array[i] = sc.nextInt();
        }
        return array;
    }

    /**
     *Метод для генерирования массива с заданными размером и разбросом значений элементов
     * @param size размер массива
     * @param maxValueExclusion разброс (интервал от 0 до maxValueExclusion)
     * @return массив с заданными параметрами
     */
    public static int[] arrayRandom (int size, int maxValueExclusion) {
        int[] container = new int[size];
        Random rand = new Random();

        for (int i = 0; i < container.length; i++ ) {
            container[i] = rand.nextInt(maxValueExclusion);
        }
        return container;
    }
}
