package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        double x;
        double y;
        CalculatorWithCounterClassic calculator = new CalculatorWithCounterClassic();
        x = calculator.division(28, 5);
        calculator.incrementCountOperation();
        x = calculator.power(x, 2);
        calculator.incrementCountOperation();
        x = calculator.addition(x, 4.1);
        calculator.incrementCountOperation();
        y = calculator.multiplying(15, 7);
        calculator.incrementCountOperation();
        x = calculator.addition(x, y);
        calculator.incrementCountOperation();
        System.out.println("Результат равен " + x + "; количество вызовов " + calculator.getCountOperation() + ".");
    }

}
