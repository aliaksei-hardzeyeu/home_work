package home_work_2.sorts;

import java.util.Arrays;

import static home_work_2.arrays.ArraysUtils.*;

public class SortUtils {
    public static void main(String[] args) {
        int[] container1 = {1,2,3,4,5,6};
        int[] container2 = {1,1,1,1};
        int[] container3 = {9,1,5,99,9,9};
        int[] container4 = {};

        testBubbleSort(container1, container2,container3,container4);
        testShakerSort(container1, container2,container3,container4);
/**
 * Делаем копии массивов для работы в каждом методе
 */
        int[] arrayFromConsole1 = arrayFromConsole();
        int[] arrayRandom1 = arrayRandom(10, 100);
        int[] arrayFromConsole2 = new int[arrayFromConsole1.length];
        System.arraycopy(arrayFromConsole1, 0,  arrayFromConsole2, 0, arrayFromConsole1.length );
        int[] arrayRandom2 = new int[arrayRandom1.length];
        System.arraycopy(arrayRandom1, 0,  arrayRandom2, 0, arrayRandom1.length );

        System.out.println("Массив после пузырьковой сортировки " + Arrays.toString(bubbleSort(arrayFromConsole1)) + "\n");
        System.out.println("Массив после пузырьковой сортировки " + Arrays.toString(bubbleSort(arrayRandom1)) + "\n");

        System.out.println("Массив после шейкерной сортировки  " + Arrays.toString(shakerSort(arrayFromConsole2)) + "\n");
        System.out.println("Массив после шейкерной сортировки  " + Arrays.toString(shakerSort(arrayRandom2)));
    }

    /**
     * Пузырьковая сортировка
     * @param container исходный массив
     * @return отсортированный массив
     */
    public static int[] bubbleSort (int[] container) {
        System.out.println("Массив до сортировки " + Arrays.toString(container));
        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < container.length-1; i++) {
                if (container[i] > container[i + 1]) {
                    isSorted = false;
                    temp = container[i];
                    container[i] = container[i+1];
                    container[i+1] = temp;
                }
            }
        }
        return container;
    }

    /**
     * Шейкерная сортировка
     * @param container исходный массив
     * @return отсортированный массив
     */
    public static int[] shakerSort(int[] container) {
        System.out.println("Массив до сортировки " + Arrays.toString(container));
        int temp;
        int left = 0;
        int right = container.length - 1;

        do {
            for (int i = left; i < right; i++) {
                if (container[i] > container[i+1]) {
                    temp = container[i];
                    container[i] = container[i+1];
                    container[i+1] = temp;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (container[i] < container[i - 1]) {
                    temp = container[i];
                    container[i] = container[i-1];
                    container[i-1] = temp;
                }
            }
            left++;
        }
        while (left<right);

        return container;
    }

    /**
     * Тестирование пузырьковой сортировки на заданных массивах
     * @param container1
     * @param container2
     * @param container3
     * @param container4
     */
    public static void testBubbleSort (int[] container1,int[] container2, int[] container3, int[] container4) {
        System.out.println("Массив после сортировки " + Arrays.toString(bubbleSort(container1)) + "\n");
        System.out.println("Массив после сортировки " + Arrays.toString(bubbleSort(container2)) + "\n");
        System.out.println("Массив после сортировки " + Arrays.toString(bubbleSort(container3)) + "\n");
        System.out.println("Массив после сортировки " + Arrays.toString(bubbleSort(container4)) + "\n");
    }

    /**
     * Тестирование шейкерной сортировки на заданных массивах
     * @param container1
     * @param container2
     * @param container3
     * @param container4
     */
    public static void testShakerSort (int[] container1,int[] container2, int[] container3, int[] container4) {
        System.out.println("Массив после сортировки " + Arrays.toString(bubbleSort(container1)) + "\n");
        System.out.println("Массив после сортировки " + Arrays.toString(bubbleSort(container2)) + "\n");
        System.out.println("Массив после сортировки " + Arrays.toString(bubbleSort(container3)) + "\n");
        System.out.println("Массив после сортировки " + Arrays.toString(bubbleSort(container4)) + "\n");
    }

}
