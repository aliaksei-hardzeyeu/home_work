package home_work_2.arrays;

import java.util.Arrays;

import static home_work_2.arrays.ArraysUtils.arrayRandom;


public class Task2_4 {
    public static void main(String[] args) {
        int[] container = arrayRandom(10, 100);
        evenPositiveSum(container);
        maxEvenIndexElement(container);
        lessThanAverage(container);
        twoMinElements(container);
        sumOfNumbers(container);
        shrinkArray(container, 0,30);
    }

    public static void evenPositiveSum(int[] container) {
        System.out.println();
        System.out.println(Arrays.toString(container));
        System.out.println("Сумма четных положительных элементов массива");
        int sum = 0;
        for (int element : container) {
            if (element >= 0 && element % 2 == 0) {
                sum = sum + element;
            }
        }
        System.out.println(sum);
    }

    public static void maxEvenIndexElement(int[] container) {
        System.out.println();
        System.out.println(Arrays.toString(container));
        System.out.println("Максимальный из элементов массива с четными индексами");
        int max = 0;
        int temp;
        for (int i = 0; i < container.length; i += 2) {
            for (int j = 0; j < container.length; j += 2) {
                if (container[i] >= container[j]) {
                    temp = container[i];
                    if (temp >= max) {
                        max = temp;
                    }
                }
            }
        }
        System.out.println(max);
    }

    public static void lessThanAverage(int[] container) {
        System.out.println();
        System.out.println(Arrays.toString(container));
        System.out.println("Элементы массива, которые меньше среднего арифметического");
        int sum = 0;
        for (int number : container) {
            sum = sum + number;
        }
        int average = sum / container.length;
        System.out.println("Среднее арифметическое = " + average);

        for (int number : container) {
            if (number < average) {
                System.out.print(number + " ");
            }
        }
    }

    public static void twoMinElements(int[] container) {
        System.out.println("\n");
        System.out.println(Arrays.toString(container));
        System.out.println("Найти два наименьших (минимальных) элемента массива");
        int temp;
        for (int i = 0; i < container.length; i++) {
            for (int j = 1; j < container.length - i; j++) {
                if (container[j-1] >= container[j]) {
                    temp = container[j-1];
                    container[j-1] = container[j];
                    container[j] = temp;
                }
            }
        }
        System.out.println("Два минимальных элемента: " + container[0] + " " + container[1]);
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