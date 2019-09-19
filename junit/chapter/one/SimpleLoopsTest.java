package chapter.one;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleLoopsTest {

    @Test
    void task88() {
        int actualResult = SimpleLoops.task88(1782);
        int expectedResult = 2871;
        assertEquals(expectedResult, actualResult);
    }


    @Test
    void task86a() {
    }

    @Test
    void task86b() {
        int actualResult = SimpleLoops.task86b(1256);
        int expectedResult = 14;
        assertEquals(expectedResult, actualResult);
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
        int actualResult = SimpleLoops.task108(30);
        int expectedResult = 32;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void task88aTrue() {
        assertTrue(SimpleLoops.task88a(6));
    }

    @Test
    void task88aFalse() {
        assertFalse(SimpleLoops.task88a(4));
    }

    @Test
    void task86_h() {
    }

    @Test
    void task184() {
        int[] list = {11, 15, 8, 7, 6};
        int[] expectedResult = {0, 0, 8, 0, 6};
        assertArrayEquals(expectedResult, SimpleLoops.task184(4, 3, list));
    }
}