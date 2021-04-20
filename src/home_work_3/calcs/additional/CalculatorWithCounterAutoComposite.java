package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoComposite {
    private long countOperation;
    private CalculatorWithOperator calculator1;
    private CalculatorWithMathCopy calculator2;
    private CalculatorWithMathExtends calculator3;

    public CalculatorWithCounterAutoComposite(CalculatorWithMathExtends calculator) {
        this.calculator3 = calculator;
    }

    public CalculatorWithCounterAutoComposite(CalculatorWithMathCopy calculator) {
        this.calculator2 = calculator;
    }

    public CalculatorWithCounterAutoComposite(CalculatorWithOperator calculator) {
        this.calculator1 = calculator;
    }


    public long getCountOperation() {
        return this.countOperation;
    }

    public void incrementCountOperation() {
        this.countOperation++;
    }

    /**
     * Деление
     *
     * @param x делимое
     * @param y делитель
     * @return частное
     */
    public double division1(double x, double y) {
        incrementCountOperation();
        return calculator1.division(x, y);
    }

    /**
     * Умножение
     *
     * @param x первый множитель
     * @param y второй множитель
     * @return произведение
     */
    public double multiplying1(double x, double y) {
        incrementCountOperation();
        return calculator1.multiplying(x, y);
    }

    /**
     * Вычитание
     *
     * @param x уменьшаемое
     * @param y вычитаемое
     * @return разность
     */
    public double subtractio1n(double x, double y) {
        incrementCountOperation();
        return calculator1.subtraction(x, y);
    }

    /**
     * Сложение
     *
     * @param x первое слагаемое
     * @param y второе слагаемое
     * @return сумма
     */
    public double addition1(double x, double y) {
        incrementCountOperation();
        return calculator1.addition(x, y);
    }

    /**
     * Возведение в степень
     *
     * @param x возводимое число
     * @param y степень (по условию положительная и целая)
     * @return произведение
     */
    public double power1(double x, int y) {
        incrementCountOperation();
        return calculator1.power(x, y);
    }

    /**
     * Модуль числа
     *
     * @param x число
     * @return его модуль
     */
    public double absolute1(double x) {
        incrementCountOperation();
       return calculator1.absolute(x);
    }

    /**
     * Квадратный корень числа
     *
     * @param x число
     * @return корень
     */
    public double squareRoot1(double x) {
        incrementCountOperation();
        return calculator1.squareRoot(x);
    }

    /**
     * Деление
     *
     * @param x делимое
     * @param y делитель
     * @return частное
     */
    public double division2(double x, double y) {
        incrementCountOperation();
        return calculator2.division(x, y);
    }

    /**
     * Умножение
     *
     * @param x первый множитель
     * @param y второй множитель
     * @return произведение
     */
    public double multiplying2(double x, double y) {
        incrementCountOperation();
        return calculator2.multiplying(x, y);
    }

    /**
     * Вычитание
     *
     * @param x уменьшаемое
     * @param y вычитаемое
     * @return разность
     */
    public double subtraction2(double x, double y) {
        incrementCountOperation();
        return calculator2.subtraction(x, y);
    }

    /**
     * Сложение
     *
     * @param x первое слагаемое
     * @param y второе слагаемое
     * @return сумма
     */
    public double addition2(double x, double y) {
        incrementCountOperation();
        return calculator2.addition(x, y);
    }

    /**
     * Возведение в степень
     *
     * @param x возводимое число
     * @param y степень (по условию положительная и целая)
     * @return произведение
     */
    public double power2(double x, int y) {
        incrementCountOperation();
        return calculator2.power(x, y);
    }

    /**
     * Модуль числа
     *
     * @param x число
     * @return его модуль
     */
    public double absolute2(double x) {
        incrementCountOperation();
        return calculator2.absolute(x);
    }

    /**
     * Квадратный корень числа
     *
     * @param x число
     * @return корень
     */
    public double squareRoot2(double x) {
        incrementCountOperation();
        return calculator2.squareRoot(x);
    }

    /**
     * Деление
     *
     * @param x делимое
     * @param y делитель
     * @return частное
     */
    public double division3(double x, double y) {
        incrementCountOperation();
        return calculator3.division(x, y);
    }

    /**
     * Умножение
     *
     * @param x первый множитель
     * @param y второй множитель
     * @return произведение
     */
    public double multiplying3(double x, double y) {
        incrementCountOperation();
        return calculator3.multiplying(x, y);
    }

    /**
     * Вычитание
     *
     * @param x уменьшаемое
     * @param y вычитаемое
     * @return разность
     */
    public double subtraction3(double x, double y) {
        incrementCountOperation();
        return calculator3.subtraction(x, y);
    }

    /**
     * Сложение
     *
     * @param x первое слагаемое
     * @param y второе слагаемое
     * @return сумма
     */
    public double addition3(double x, double y) {
        incrementCountOperation();
        return calculator3.addition(x, y);
    }

    /**
     * Возведение в степень
     *
     * @param x возводимое число
     * @param y степень (по условию положительная и целая)
     * @return произведение
     */
    public double power3(double x, int y) {
        incrementCountOperation();
        return calculator3.power(x, y);
    }

    /**
     * Модуль числа
     *
     * @param x число
     * @return его модуль
     */
    public double absolute3(double x) {
        incrementCountOperation();
        return calculator3.absolute(x);
    }

    /**
     * Квадратный корень числа
     *
     * @param x число
     * @return корень
     */
    public double squareRoot3(double x) {
        incrementCountOperation();
        return calculator3.squareRoot(x);
    }
}
