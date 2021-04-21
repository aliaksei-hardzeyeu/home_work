package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;
import home_work_3.calcs.additional.CalculatorWithMemory;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        double x;
        double y;
        CalculatorWithMemory calculator = new CalculatorWithMemory();
        calculator.setMemory(calculator.division(28, 5));
        calculator.setMemory(calculator.power(calculator.getMemory(), 2));
        calculator.setMemory(calculator.addition(calculator.getMemory(), 4.1));
//        y = calculator.multiplying(15, 7);
//        x = calculator.addition(x, y);
        System.out.println("Результат равен " + calculator.getMemory() + "; количество вызовов " + calculator.getCountOperation() + ".");
    }
    }

