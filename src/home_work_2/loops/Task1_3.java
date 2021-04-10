package home_work_2.loops;

import java.util.Scanner;

public class Task1_3 {
    static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        double number = enterNumber();
        int power = enterPower();
        double product = numberToPower(number, power);

        System.out.print(number + " ^ " + power + " = " + product);
        scan.close();
    }

    /**
     * Метод для ввода числа через сканер
     * @return double число
     */
    public static double enterNumber() {
        System.out.println("Введите число");
        String numberString = scan.nextLine();
        return Double.parseDouble(numberString);
    }

    /**
     *  Метод для ввода степени через сканер
     * @return int степень
     */
    public static int enterPower () {
        System.out.println("Введите степень");
        return scan.nextInt();
    }

    /**
     *  Метод для возведения числа в степень
     * @return double произведение
     */
    public static double numberToPower (double number, int power) {
        double product = 1;
        for (int i = 1; i <= power; i++) {
            product = product*number;
        }
        return product;
    }
}
