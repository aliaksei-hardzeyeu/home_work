package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    private long countOperation;

    public void incrementCountOperation () {
        countOperation++;
    }

    public long getCountOperation () {
        return countOperation;
    }
    /**
     * Возведение в степень
     * Увеличение счетчика на 1
     * @param x возводимое число
     * @param y степень (по условию положительная и целая)
     * @return произведение
     */
    public double power(double x, int y) {
        incrementCountOperation();
        return Math.pow(x, y);
    }

    /**
     * Модуль числа
     * Увеличение счетчика на 1
     * @param x число
     * @return его модуль
     */
    public double absolute(double x) {
        incrementCountOperation();
        return Math.abs(x);
    }

    /**
     * Квадратный корень числа
     * Увеличение счетчика на 1
     * @param x число
     * @return корень
     */
    public double squareRoot(double x) {
        incrementCountOperation();
        return Math.sqrt(x);
    }
    /**
     * Деление
     * Увеличение счетчика на 1
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
     * Увеличение счетчика на 1
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
     * Увеличение счетчика на 1
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
     * Увеличение счетчика на 1
     * @param x первое слагаемое
     * @param y второе слагаемое
     * @return сумма
     */
    public double addition(double x, double y) {
        incrementCountOperation();
        return x + y;
    }
}



