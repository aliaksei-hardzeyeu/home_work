package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calculator = new CalculatorWithCounterAutoSuper();
        System.out.println(calculator.addition((calculator.addition((calculator.power((calculator.division(28, 5)), 2)), 4.1)), (calculator.multiplying(15, 7))));
        System.out.println(calculator.getCountOperation());
    }
}
