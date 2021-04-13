package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {
    private long countOperation;

    public void incrementCountOperation() {
        countOperation++;
    }

    public long getCountOperation() {
        return countOperation;
    }

    /**
     * Деление
     *
     * @param x делимое
     * @param y делитель
     * @return частное
     */
    public double division(double x, double y) {
        incrementCountOperation();
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
        incrementCountOperation();
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
        incrementCountOperation();
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
        incrementCountOperation();
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
        incrementCountOperation();
        double result = x;
        if (y == 1) {
            System.out.println("Степень равна 1");
            return x;
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
        incrementCountOperation();
        if (x < 0) {
            return x * (-1);
        } else return x;
    }

    /**
     * Квадратный корень числа
     *
     * @param x число
     * @return корень
     */
    public double squareRoot(double x) {
        incrementCountOperation();
        return Math.sqrt(x);
    }
}