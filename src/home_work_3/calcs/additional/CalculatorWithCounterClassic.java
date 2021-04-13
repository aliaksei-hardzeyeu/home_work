package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    private long countOperation;

    /**
     * Увеличивает значение счетчика на едницу
     */
    public void incrementCountOperation () {
        countOperation++;
    }

    /**
     * Показывает счетчик
     * @return счетчик
     */
    public long getCountOperation () {
        return countOperation;
    }
}
