package home_work_2.arrays.Task2_3;

class ForOperation implements IArraysOperation {

    public ForOperation (int[] container) {
        System.out.println("FOR loop");
        elementsToConsole(container);
        everySecondElementToConsole(container);
        reverseOrder(container);
    }

    public void elementsToConsole(int[] container) {
        for (int i = 0; i < container.length; i++) {
            System.out.print(container[i] + " ");
        }
        System.out.println();
    }

    public void everySecondElementToConsole(int[] container) {
        for (int i = 1; i < container.length; i += 2) {
            System.out.print(container[i] + " ");
        }
        System.out.println();
    }

    public void reverseOrder(int[] container) {
        for (int i = container.length - 1; i >= 0; i--) {
            System.out.print(container[i] + " ");
        }
        System.out.println();
    }
}