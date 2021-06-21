package home_work_2.test;

import home_work_2.loops.Task1_1;
import home_work_2.loops.Task1_2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static home_work_2.loops.Task1_2.multiplicationOfAllArgumentsNumbers;
import static home_work_2.loops.Task1_3.numberToPower;


public class Task1Test {

    @Test
    public void multiplicationOfArguments1() {

        Assertions.assertEquals(2432902008176640000L, Task1_1.multiplicationOfArguments(20));
    }

    @Test
    public void multiplicationOfArguments2() {

        Assertions.assertEquals(1, Task1_1.multiplicationOfArguments(-5));
    }

    @Test
    public void multiplicationOfArguments3() {

        Assertions.assertEquals(1, Task1_1.multiplicationOfArguments(2.5));
    }

    @Test
    public void multiplicationOfArguments4() {

        Assertions.assertEquals(1, Task1_1.multiplicationOfArguments(-20.4));
    }

    @Test
    public void checkLetter1() {

        Assertions.assertTrue(Task1_2.checkLetter("2124as"));
    }

    @Test
    public void checkLetter2() {

        Assertions.assertFalse(Task1_2.checkLetter("1245325"));
    }

    @Test
    public void multiplicationOfAllArgumentsNumbers1() {

        Assertions.assertEquals(1024, multiplicationOfAllArgumentsNumbers(2124124124));
    }

    @Test
    public void multiplicationOfAllArgumentsNumbers2() {

        Assertions.assertEquals(-4, multiplicationOfAllArgumentsNumbers(-212));
    }

    @Test
    public void numberToPower1 () {

        Assertions.assertEquals(1889568,  numberToPower(18, 5));

    }

    @Test
    public void numberToPower2 () {

        Assertions.assertEquals(56.25,  numberToPower(7.5, 2));

    }
}
