package home_work_2.sorts;

import java.util.Arrays;
import home_work_2.arrays.ArraysUtils;

import static home_work_2.arrays.ArraysUtils.*;

//4.* Выполнить сортировку массива с числами:
//	4.1. После каждой сортировки в консоли у вас должно получиться "[Какой массив был до сортировки] ->
//	[Каким стал массив после сортировки]". Для преобразования массива в текст можно использовать класс Arrays.
//	4.2. Создать класс SortsUtils. Пишем в нём следующие алгоритмы:
//		4.2.1. Пузырьковая сортировка
//		4.2.2. Шейкерная сортировка
//	4.3. Для тестов используем предварительно созданные массивы (в коде ваши тесты должны остаться):
//		4.3.1. {1,2,3,4,5,6}
//		4.3.2. {1,1,1,1}
//		4.3.3. {9,1,5,99,9,9}
//		4.3.4. {}
//	4.4. После тестов написать код который будет массив через ранее созданный arrayRandom. Отсортировать.
//	4.5. После рандома написать код который будет создавать массив через ранее созданный arrayFromConsole. Отсортировать.
public class SortUtils {
    public static void main(String[] args) {
        int[] container1 = {1,2,3,4,5,6};
        int[] container2 = {1,1,1,1};
        int[] container3 = {9,1,5,99,9,9};
        int[] container4 = {};

//        testBubbleSort(container1, container2,container3,container4);
//        testShakerSort(container1, container2,container3,container4);

        System.out.println("Массив после пузырьковой сортировки" + Arrays.toString(bubbleSort(arrayFromConsole())) + "\n");
        System.out.println("Массив после пузырьковой сортировки" + Arrays.toString(bubbleSort(arrayRandom(10, 100))) + "\n");

        System.out.println("Массив после шейкерной сортировки  " + Arrays.toString(shakerSort(arrayFromConsole())));
        System.out.println("Массив после шейкерной сортировки  " + Arrays.toString(shakerSort(arrayRandom(10, 100))) + "\n");

    }
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

    public static void testBubbleSort (int[] container1,int[] container2, int[] container3, int[] container4) {
        System.out.println("Массив после сортировки " + Arrays.toString(bubbleSort(container1)) + "\n");
        System.out.println("Массив после сортировки " + Arrays.toString(bubbleSort(container2)) + "\n");
        System.out.println("Массив после сортировки " + Arrays.toString(bubbleSort(container3)) + "\n");
        System.out.println("Массив после сортировки " + Arrays.toString(bubbleSort(container4)) + "\n");
    }

    public static void testShakerSort (int[] container1,int[] container2, int[] container3, int[] container4) {
        System.out.println("Массив после сортировки " + Arrays.toString(bubbleSort(container1)) + "\n");
        System.out.println("Массив после сортировки " + Arrays.toString(bubbleSort(container2)) + "\n");
        System.out.println("Массив после сортировки " + Arrays.toString(bubbleSort(container3)) + "\n");
        System.out.println("Массив после сортировки " + Arrays.toString(bubbleSort(container4)) + "\n");
    }

}
