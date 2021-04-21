package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoComposite calculator1 = new CalculatorWithCounterAutoComposite(new CalculatorWithOperator());
        System.out.println(calculator1.addition((calculator1.addition((calculator1.power((calculator1.division(28, 5)), 2)), 4.1)), (calculator1.multiplying(15, 7))));
        System.out.println("Количество вызовов " + calculator1.getCountOperation());


        CalculatorWithCounterAutoComposite calculator2 = new CalculatorWithCounterAutoComposite(new CalculatorWithMathCopy());
        System.out.println(calculator2.addition((calculator2.addition((calculator2.power((calculator2.division(28, 5)), 2)), 4.1)), (calculator2.multiplying(15, 7))));
        System.out.println("Количество вызовов " + calculator2.getCountOperation());

        CalculatorWithCounterAutoComposite calculator3 = new CalculatorWithCounterAutoComposite(new CalculatorWithMathExtends());
        System.out.println(calculator3.addition((calculator3.addition((calculator3.power((calculator3.division(28, 5)), 2)), 4.1)), (calculator3.multiplying(15, 7))));
        System.out.println("Количество вызовов " + calculator3.getCountOperation());


    }
}
