package home_work_2.arrays;
////2.2 Перебор массива при помощи do....while, while, for, foreach. Элементы массива вводить используя ранее созданный
//// arrayFromConsole. Все задачи в одном классе, в отдельных методах. Должно получиться 3 метода:
////		2.2.1. Вывести все элементы в консоль.
////		2.2.2. Вывести каждый второй элемент массива в консоль.
////		2.2.3. Вывести все элементы массива в консоль в обратном порядке.
public class Task2_2 {
    public static void main(String[] args) {
        int[] container = ArraysUtils.arrayFromConsole();
        elementsToConsole(container);
        everySecondElementToConsole(container);
        reverseOrder(container);
    }

    public static void elementsToConsole (int[] container) {
       int index = 0;
       do {
           System.out.print(container[index] + " ");
           index++;
       } while (index < container.length);

       System.out.println();

       index = 0;
       while (index< container.length) {
           System.out.print(container[index] + " ");
           index++;
       }

       System.out.println();

       for (int i = 0; i < container.length; i++) {
           System.out.print(container[i] + " ");
       }

       System.out.println();

        for (int element:container) {
            System.out.print(element + " ");
        }
        System.out.println("\n");

    }
    public static void everySecondElementToConsole (int[] container) {
        int index = 0;
        do {
            System.out.print(container[index] + " ");
            index+=2;
        } while (index < container.length);

        System.out.println();

        index = 0;
        while (index< container.length) {
            System.out.print(container[index] + " ");
            index+=2;
        }

        System.out.println();

        for (int i = 0; i < container.length; i+=2) {
            System.out.print(container[i] + " ");
        }

        System.out.println();

        index = 0;
        for (int element:container) {
            if (container[index] % 2 == 0) {
                System.out.print(element + " ");
                index++;
            } else
                index++;
        }
        System.out.println("\n");
    }

    public static void reverseOrder (int[] container) {
        int index = container.length-1;
        do {
            System.out.print(container[index] + " ");
            index--;
        } while (index >= 0);

        System.out.println();

        index = container.length-1;
        while (index >= 0) {
            System.out.print(container[index] + " ");
            index--;
        }

        System.out.println();

        for (int i = container.length - 1; i >=0 ; i--) {
            System.out.print(container[i] + " ");
        }

        System.out.println();

        int[] reverseContainer = new int[container.length];
        int i = container.length - 1;
        for (int element:container) {
            reverseContainer[i] = element;
            i--;
        }
        for (int element:reverseContainer) {
            System.out.print(element + " ");

        }

    }
}
