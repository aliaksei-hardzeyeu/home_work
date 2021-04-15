package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;
import home_work_3.calcs.additional.CalculatorWithCounterClassic;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeMain {
    public static void main(String[] args) {
        double x;
        double y;
        CalculatorWithOperator calculatorFirst = new CalculatorWithOperator();
        CalculatorWithCounterAutoComposite calculator1 = new CalculatorWithCounterAutoComposite(calculatorFirst);
        x = calculator1.division(28, 5);
        calculator1.incrementCountOperation();
        x = calculator1.power(x, 2);
        calculator1.incrementCountOperation();
        x = calculator1.addition(x, 4.1);
        calculator1.incrementCountOperation();
        y = calculator1.multiplying(15, 7);
        calculator1.incrementCountOperation();
        x = calculator1.addition(x, y);
        calculator1.incrementCountOperation();
        System.out.println("Результат равен " + x + "; количество вызовов " + calculator1.getCountOperation() + ".");

        CalculatorWithMathCopy calculatorSecond = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoComposite calculator2 = new CalculatorWithCounterAutoComposite(calculatorSecond);
        x = calculator2.division(28, 5);
        calculator2.incrementCountOperation();
        x = calculator2.power(x, 2);
        calculator2.incrementCountOperation();
        x = calculator2.addition(x, 4.1);
        calculator2.incrementCountOperation();
        y = calculator2.multiplying(15, 7);
        calculator2.incrementCountOperation();
        x = calculator2.addition(x, y);
        calculator2.incrementCountOperation();
        System.out.println("Результат равен " + x + "; количество вызовов " + calculator2.getCountOperation() + ".");

        CalculatorWithMathExtends calculatorThird = new CalculatorWithMathExtends();
        CalculatorWithCounterAutoComposite calculator3 = new CalculatorWithCounterAutoComposite(calculatorThird);
        x = calculator3.division(28, 5);
        calculator3.incrementCountOperation();
        x = calculator3.power(x, 2);
        calculator3.incrementCountOperation();
        x = calculator3.addition(x, 4.1);
        calculator3.incrementCountOperation();
        y = calculator3.multiplying(15, 7);
        calculator3.incrementCountOperation();
        x = calculator3.addition(x, y);
        calculator3.incrementCountOperation();
        System.out.println("Результат равен " + x + "; количество вызовов " + calculator3.getCountOperation() + ".");


    }
}
