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
    public double division(double x, double y) {
        incrementCountOperation();
        if (calculator1 != null) {
            return calculator1.division(x, y);
        } else if (calculator2 != null) {
            return calculator2.division(x, y);
        } else
            return calculator3.division(x, y);
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
        if (calculator1 != null) {
            return calculator1.multiplying(x, y);
        } else if (calculator2 != null) {
            return calculator2.multiplying(x, y);
        } else
            return calculator3.multiplying(x, y);
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
        if (calculator1 != null) {
            return calculator1.subtraction(x, y);
        } else if (calculator2 != null) {
            return calculator2.subtraction(x, y);
        } else
            return calculator3.subtraction(x, y);
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
        if (calculator1 != null) {
            return calculator1.addition(x, y);
        } else if (calculator2 != null) {
            return calculator2.addition(x, y);
        } else
            return calculator3.addition(x, y);
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
        if (calculator1 != null) {
            return calculator1.power(x, y);
        } else if (calculator2 != null) {
            return calculator2.power(x, y);
        } else
            return calculator3.power(x, y);
    }

    /**
     * Модуль числа
     *
     * @param x число
     * @return его модуль
     */
    public double absolute(double x) {
        incrementCountOperation();
        if (calculator1 != null) {
            return calculator1.absolute(x);
        } else if (calculator2 != null) {
            return calculator2.absolute(x);
        } else
            return calculator3.absolute(x);
    }

    /**
     * Квадратный корень числа
     *
     * @param x число
     * @return корень
     */
    public double squareRoot(double x) {
        incrementCountOperation();
        if (calculator1 != null) {
            return calculator1.squareRoot(x);
        } else if (calculator2 != null) {
            return calculator2.squareRoot(x);
        } else
            return calculator3.squareRoot(x);
    }

}
