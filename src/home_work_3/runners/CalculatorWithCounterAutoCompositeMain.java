package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoComposite calculator1 = new CalculatorWithCounterAutoComposite(new CalculatorWithOperator());
        System.out.println(calculator1.addition1((calculator1.addition1((calculator1.power1((calculator1.division1(28, 5)), 2)), 4.1)), (calculator1.multiplying1(15, 7))));
        System.out.println("Количество вызовов " + calculator1.getCountOperation());


        CalculatorWithCounterAutoComposite calculator2 = new CalculatorWithCounterAutoComposite(new CalculatorWithMathCopy());
        System.out.println(calculator2.addition2((calculator2.addition2((calculator2.power2((calculator2.division2(28, 5)), 2)), 4.1)), (calculator2.multiplying2(15, 7))));
        System.out.println("Количество вызовов " + calculator2.getCountOperation());

        CalculatorWithCounterAutoComposite calculator3 = new CalculatorWithCounterAutoComposite(new CalculatorWithMathExtends());
        System.out.println(calculator3.addition3((calculator3.addition3((calculator3.power3((calculator3.division3(28, 5)), 2)), 4.1)), (calculator3.multiplying3(15, 7))));
        System.out.println("Количество вызовов " + calculator3.getCountOperation());


    }
}
