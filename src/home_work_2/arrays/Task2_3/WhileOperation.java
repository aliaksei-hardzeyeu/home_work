package home_work_2.arrays.Task2_3;

public class WhileOperation implements IArraysOperation{

    public void elementsToConsole(int[] container){
        int index = 0;
        while (index< container.length) {
            System.out.print(container[index] + " ");
            index++;
        }
        System.out.println();
    }

    public void everySecondElementToConsole (int[] container){
        int index = 1;
        while (index< container.length) {
            System.out.print(container[index] + " ");
            index+=2;
        }
        System.out.println();
    }

    public void reverseOrder (int[] container){
        int index = container.length-1;
        while (index >= 0) {
            System.out.print(container[index] + " ");
            index--;
        }
        System.out.println();
    }
}
