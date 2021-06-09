package home_work_2.arrays.Task2_3;
import java.util.Scanner;

import static home_work_2.arrays.ArraysUtils.*;
import static home_work_2.arrays.Task2_2.*;

public class Task2_3 {
    public static void main(String[] args) {
        int[] container = arrayFromConsole();

        System.out.println("Выберите тип операции");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        IArraysOperation operation = choiceOperation(choice);

        operation.elementsToConsole(container);
        operation.everySecondElementToConsole(container);
        operation.reverseOrder(container);
    }


    public static IArraysOperation choiceOperation(int choice) {
        switch (choice) {
            case 1:
                return new DoWhileOperation();
            case 2:
                return new ForOperation();
            case 3:
                return new WhileOperation();
            case 4:
                return new ForEachOperation();
            default:
                return new DoWhileOperation();

        }
    }

}
