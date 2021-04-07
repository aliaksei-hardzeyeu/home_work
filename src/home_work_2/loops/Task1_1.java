package home_work_2.loops;

public class Task1_1 {
    public static void main(String[] args) {

        double x = Double.parseDouble(args[0]);
        System.out.println("arg = " + x);
        double remainder = x % 1.0;

        if (remainder == 0 && x > 0) {
            long product = 1;

            for (long i = 1; i <= x; i++) {
                product = product * i;
                if (i < x) {
                    System.out.print(i + " * ");
                } else
                    System.out.print(i + " = ");
            }
            System.out.print(product + "\n");

        } else if (remainder != 0 && x < 0) {
            System.out.println("Число не целое и отрицательное");
        } else if (x < 0) {
            System.out.println("Число отрицательное");
        } else
            System.out.println("Число не целое");
    }
}
