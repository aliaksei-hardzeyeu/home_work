package home_work_3.runners;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        //4.1 + 15 * 7 + (28 / 5) ^ 2 = 140.45999999999998
    CalculatorWithOperator calculator = new CalculatorWithOperator();
    System.out.println(calculator.addition((calculator.addition((calculator.power((calculator.division(28, 5)), 2)), 4.1)), (calculator.multiplying(15, 7))));


    }
}
