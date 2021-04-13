package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoComposite {

    public CalculatorWithCounterAutoComposite(CalculatorWithOperator calculator) {
        System.out.println("CalculatorWithOperator: " + calculator.addition((calculator.addition((calculator.power((calculator.division(28, 5)), 2)), 4.1)), (calculator.multiplying(15, 7))));
        System.out.println("Количество операций: " + calculator.getCountOperation() + "\n");
    }

    public CalculatorWithCounterAutoComposite(CalculatorWithMathCopy calculator) {
        System.out.println("CalculatorWithMathCopy: " + calculator.addition((calculator.addition((calculator.power((calculator.division(28, 5)), 2)), 4.1)), (calculator.multiplying(15, 7))));
        System.out.println("Количество операций: " + calculator.getCountOperation() + "\n");

    }

    public CalculatorWithCounterAutoComposite(CalculatorWithMathExtends calculator) {
        System.out.println("CalculatorWithMathExtends: " + calculator.addition((calculator.addition((calculator.power((calculator.division(28, 5)), 2)), 4.1)), (calculator.multiplying(15, 7))));
        System.out.println("Количество операций: " + calculator.getCountOperation());
    }
}
