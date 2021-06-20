package home_work_2.loops;

public class Task1_1 {
    public static void main(String[] args) {
        System.out.println(multiplicationOfArguments(-2));
    }


    public static long multiplicationOfArguments(double args) {

        double x = args;
        System.out.println("arg = " + x);
        double remainder = x % 1.0;
        long product = 1;

        if (remainder == 0 && x > 0) {

            for (long i = 1; i <= x; i++) {
                product = product * i;
                String out = (i < x ? " * " : " = ");
                System.out.print(i + out);
            }
            System.out.print(product + "\n");

        } else if (remainder != 0 && x < 0) {
            System.out.println("Число не целое и отрицательное");
        } else if (x < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число не целое");
        }

        return product;
    }
}
