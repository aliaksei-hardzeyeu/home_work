package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {
    private long countOperation;

    public void incrementCountOperation() {
        countOperation++;
    }

    public long getCountOperation() {
        return countOperation;
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
        return Math.pow(x, y);
    }

    /**
     * Модуль числа
     *
     * @param x число
     * @return его модуль
     */
    public double absolute(double x) {
        incrementCountOperation();
        return Math.abs(x);
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
