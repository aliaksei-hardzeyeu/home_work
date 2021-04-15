package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoCompositeInterface {
    public CalculatorWithCounterAutoCompositeInterface (ICalculator calculator) {

    }

    long countOperation;
    public long getCountOperation() {
        return countOperation;
    }
}
