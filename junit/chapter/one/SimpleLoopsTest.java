package chapter.one;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleLoopsTest {

    @Test
    void task88() {
    }

    @Test
    void task86a() {
    }

    @Test
    void task86b() {
    }

    @Test
    void task88c() {
    }

    @Test
    void task88g() {
    }

    @Test
    void task87_testWithDefaultInput() {
        int firstNum = 123456;
        int secondNum = 4;

        int actual = SimpleLoops.task87(firstNum, secondNum);

        int expected = 18;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void task87_testWhenSecondNumIsBiggerThanFirstOne() {
        int firstNum = 123456;
        int secondNum = 8;

        int actual = SimpleLoops.task87(firstNum, secondNum);

        int expected = 21;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void task87_testWithOneBillionFirstNum() {
        int firstNum = 1000000000;
        int secondNum = 8;

        int actual = SimpleLoops.task87(firstNum, secondNum);

        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void task107() {
    }

    @Test
    void task108() {
    }

    @Test
    void task88a() {
    }

    @Test
    void task86_h() {
    }

    @Test
    void task184() {
    }
}