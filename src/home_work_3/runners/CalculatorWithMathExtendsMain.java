package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calculator = new CalculatorWithMathExtends();
        System.out.println(calculator.addition((calculator.addition((calculator.power((calculator.division(28, 5)), 2)), 4.1)), (calculator.multiplying(15, 7))));

    }
}
