package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoComposite {

    public CalculatorWithCounterAutoComposite(CalculatorWithOperator calculator) {

    }

    public CalculatorWithCounterAutoComposite(CalculatorWithMathCopy calculator) {

    }

    public CalculatorWithCounterAutoComposite(CalculatorWithMathExtends calculator) {
//        System.out.println("CalculatorWithMathExtends: " + calculator.addition((calculator.addition((calculator.power((calculator.division(28, 5)), 2)), 4.1)), (calculator.multiplying(15, 7))));
//        System.out.println("Количество операций: " + calculator.getCountOperation());
    }


    /**
     * Деление
     *
     * @param x делимое
     * @param y делитель
     * @return частное
     */
    public double division(double x, double y) {
        return x / y;
    }

    /**
     * Умножение
     *
     * @param x первый множитель
     * @param y второй множитель
     * @return произведение
     */
    public double multiplying(double x, double y) {
        return x * y;
    }

    /**
     * Вычитание
     *
     * @param x уменьшаемое
     * @param y вычитаемое
     * @return разность
     */
    public double subtraction(double x, double y) {
        return x - y;
    }

    /**
     * Сложение
     *
     * @param x первое слагаемое
     * @param y второе слагаемое
     * @return сумма
     */
    public double addition(double x, double y) {
        return x + y;
    }

    /**
     * Возведение в степень
     *
     * @param x возводимое число
     * @param y степень (по условию положительная и целая)
     * @return произведение
     */
    public double power(double x, int y) {
        double result = x;
        if (y == 1) {
            System.out.println("Степень равна 1");
            return x;
        } else if (y == 0) {
            System.out.println("Степень равна 0");
            return 1;
        } else {
            for (int i = 2; i <= y; i++) {
                result *= x;
            }
        }
        return result;
    }

    /**
     * Модуль числа
     *
     * @param x число
     * @return его модуль
     */
    public double absolute(double x) {
        if (x < 0) {
            return -x;
        } else return x;
    }

    /**
     * Квадратный корень числа
     *
     * @param x число
     * @return корень
     */
    public double squareRoot(double x) {
        return Math.sqrt(x);
    }
}
