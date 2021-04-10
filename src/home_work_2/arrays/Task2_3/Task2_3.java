package home_work_2.arrays.Task2_3;
import static home_work_2.arrays.ArraysUtils.*;

public class Task2_3 {
    public static void main(String[] args) {
        int[] container = arrayFromConsole();
        DoWhileOperation doWhileOperation = new DoWhileOperation(container);
        ForOperation forOperation = new ForOperation(container);
        WhileOperation whileOperation = new WhileOperation(container);
        ForEachOperation forEachOperation = new ForEachOperation(container);
    }


}
