package home_work_2.arrays.Task2_3;

public class DoWhileOperation implements IArraysOperation{

    public DoWhileOperation (int[] container) {
        System.out.println("DO WHILE loop");
        elementsToConsole(container);
        everySecondElementToConsole(container);
        reverseOrder(container);
    }

    public void elementsToConsole(int[] container){
        int index = 0;
        do {
            System.out.print(container[index] + " ");
            index++;
        } while (index < container.length);
        System.out.println();
    }

    public void everySecondElementToConsole (int[] container){
        int index = 1;
        do {
            System.out.print(container[index] + " ");
            index+=2;
        } while (index < container.length);
        System.out.println();
    }

    public void reverseOrder (int[] container){
        int index = container.length-1;
        do {
            System.out.print(container[index] + " ");
            index--;
        } while (index >= 0);
        System.out.println();
    }
}
