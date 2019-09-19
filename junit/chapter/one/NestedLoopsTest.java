package chapter.one;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NestedLoopsTest {

    @Test
    void task329_testWithDefaultInput() {
        int firstNum = 31;
        int secondNum = 9;
        List<Integer> actual = NestedLoops.task329(firstNum, secondNum);
        List<Integer> expected = new ArrayList<Integer>() {
            {
                add(3); add(12); add(21); add(30);
            }
        };
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void task329_testThatResultNumsMustBeLessThanFirstNum() {
        int firstNum = 30;
        int secondNum = 9;
        List<Integer> actual = NestedLoops.task329(firstNum, secondNum);
        List<Integer> expected = new ArrayList<Integer>() {
            {
                add(3); add(12); add(21);
            }
        };
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void task329_testWhenSecondNumHasNoIntegerSqrt() {
        int firstNum = 300;
        int secondNum = 10;
        List<Integer> actual = NestedLoops.task329(firstNum, secondNum);
        List<Integer> expected = new ArrayList<Integer>();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void task329_testForEmptyResult() {
        int firstNum = 7;
        int secondNum = 49;
        List<Integer> actual = NestedLoops.task329(firstNum, secondNum);
        List<Integer> expected = new ArrayList<Integer>();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void task332() {
    }

    @Test
    void task330() {
        Integer[] result = {6,28,496};
        List<Integer> expected = Arrays.asList(result);
        List<Integer> actual = NestedLoops.task330(512);
        assertEquals(expected,actual);
    }

    @Test
    void task331a() {
        int[] actualResult = NestedLoops.task331a(347);
        int[] expectedResult = {1, 11, 15};
        assertArrayEquals(actualResult, expectedResult);
    }

    @Test
    void task323() {
    }

    @Test
    void task325() {
        Integer[] result = {2,3,5};
        List<Integer> expected = Arrays.asList(result);
        List<Integer> actual = NestedLoops.task325(30);
        assertEquals(expected,actual);
    }

    @Test
    void task331b() {
    }

    @Test
    void task340() {
    }
}