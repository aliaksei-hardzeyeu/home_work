package home_work_2.loops;

import java.util.Scanner;

//1.3. Возведение в степень. Через консоль пользователь вводит два числа. Первое число это число которое
// мы будем возводить, Второе число это степень в которую возводят первое число. Степень - только положительная и целая.
// Возводимое число - может быть отрицательным и оно будет дробным. Math использовать нельзя.
//        1.3.1 Пример: Ввели 18 и 5, должно получиться в консоли: 18.0 ^ 5 = 1 889 568.0
//        1.3.2 Пример: Ввели 7.5 и 2, должно получиться в консоли: 7.5 ^ 2 = 56.25
public class Task1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        String numberString = sc.nextLine();
        System.out.println("Введите степень");
        int power = sc.nextInt();
        sc.close();

        double number = Double.parseDouble(numberString);
        System.out.print(numberString + " ^ " + power + " = " + numberToPower(number, power));
    }

    public static double numberToPower (double number, int power) {
        double product = 1;
        for (int i = 1; i <= power; i++) {
            product = product*number;
        }
        return product;
    }
}
