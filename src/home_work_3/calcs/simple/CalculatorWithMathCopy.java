package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathCopy  {
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
        return Math.pow(x, y);
    }

    /**
     * Модуль числа
     *
     * @param x число
     * @return его модуль
     */
    public double absolute(double x) {
        return Math.abs(x);
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
