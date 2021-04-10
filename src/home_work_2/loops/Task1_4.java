package home_work_2.loops;

/**
 * не уверен, что это правильно. В любом случае, это решение не подойдёт для остальных случаев.
 */
public class Task1_4 {
    public static void main(String[] args) {
       overFlowFirst();
    }

    public static void overFlowFirst() {
        long a = 1;
        long b = 1;
        while (a > 0) {
            b = a;
            a *= 3;
        }
        System.out.println("-------Множитель 3");
        System.out.println("Число а до переполнения " + b);
        System.out.println("Число а после переполнения " + a);
    }
}

