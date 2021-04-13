package home_work_3.runners;
//4.1 + 15 * 7 + (28 / 5) ^ 2
public class WithoutCalculatorMain {
    public static void main(String[] args) {
        System.out.println(calculate());
    }
    public static double calculate () {
        /**
         * 28/5 = 5.6
         * 5.6 ^ 2 = 31.36
         * 15 * 7 = 105
         * 4.1 + 105 = 109.1
         * 109.1 + 31.36 = 140.46
         */
        return 4.1 + 15 * 7 + Math.pow((28.0/5.0), 2);
    }
}
