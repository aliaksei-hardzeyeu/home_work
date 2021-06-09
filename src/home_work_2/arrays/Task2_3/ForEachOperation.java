package home_work_2.arrays.Task2_3;

public class ForEachOperation implements IArraysOperation{

    public void elementsToConsole(int[] container) {
        for (int element:container) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public void everySecondElementToConsole(int[] container) {
        int index = 0;
        for (int element:container) {
            if (container[index] % 2 == 0) {
                System.out.print(element + " ");
                index++;
            } else
                index++;
        }
        System.out.println();
    }

    public void reverseOrder(int[] container) {
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
