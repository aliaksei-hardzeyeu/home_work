package home_work_1;

import java.util.Arrays;
import java.util.Scanner;

//Создать СТАТИЧЕСКИЙ метод String toBinaryString(byte number) и возвращает двоичное представление числа. В методе можно
//        использовать обычную математику которая описана в теории. Теория https://planetcalc.ru/747. Если число отрицательное
//        то выдавать дополнительный код. Пример:
//        7.1 Вводим: 42.  Возвращает: 00101010
//        7.2 Вводим: 15.  Возвращает: 00001111
//        7.3 Вводим: -42. Возвращает: 11010110
//        7.4 Вводим: -15. Возвращает: 11110001
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        byte number = sc.nextByte();
        System.out.println("Entered: " + number + " Returning: " + toBinaryString(number));

    }

    public static String toBinaryString(byte number) {

        byte bin1[] = new byte[8];
        byte bin2[] = new byte[8];
        byte index = 0;

        if (number >= 0) {
            while (number != 0) {
                bin1[index++] = (byte) Math.abs(number % 2);
                number = (byte) (number / 2);
            }
            for (int i = bin1.length - 1; i >= 0; i--) {
                bin2[Math.abs(i - bin2.length + 1)] = bin1[i];
            }
        } else {
            while (number != 0) {
                bin1[index++] = (byte) Math.abs(number % 2);
                number = (byte) (number / 2);
            }
            for (int i = bin1.length - 1; i >= 0; i--) {
                bin2[Math.abs(i - bin2.length + 1)] = bin1[i];
            }
            bin2[0] = 1;


        }

        return Arrays.toString(bin2);
    }
}
