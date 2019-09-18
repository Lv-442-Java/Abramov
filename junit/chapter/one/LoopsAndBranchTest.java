package chapter.one;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LoopsAndBranchTest {

    @Test
    void task224() {
    }

    @Test
    void task241() {
    }

    @Test
    void task182() {
    }

    @Test
    void task178b_testWithDefaultInput() {
        int[] numbers = new int[] {3, 4, 5, 9, 12, 15, 17, 18, 20, 21, 30};

        int actual = LoopsAndBranch.task178b(numbers);

        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void task178b_testWithAllCorrectNums() {
        int[] numbers = new int[] {3, 6, 9, 12, 18, 21};

        int actual = LoopsAndBranch.task178b(numbers);

        int expected = 6;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void task178b_testWithAllIncorrectNums() {
        int[] numbers = new int[] {15, 30, 45, 60, 75};

        int actual = LoopsAndBranch.task178b(numbers);

        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void task178c() {
        int [] testSequence = {1,4,9,36,49};
        int actual = LoopsAndBranch.task178c(testSequence);
        int expected = 2;
        assertEquals(expected,actual);
    }

    @Test
    void task227Positive() {
        Integer [] result = {-6,-3,-2,-1,1,2,3,6};
        List<Integer> expected = Arrays.asList(result);
        List<Integer> actual = LoopsAndBranch.task227(12,18);
        assertEquals(expected,actual);
    }

    @Test
    void task227Negative() {
        Integer [] result = {-6,-3,-2,-1,1,2,3,6};
        List<Integer> expected = Arrays.asList(result);
        List<Integer> actual = LoopsAndBranch.task227(-12,18);
        assertEquals(expected,actual);
    }

    @Test
    void task225() {
    }

    @Test
    void task226_testWithDefaultInput() {
        int firstNum = 30;
        int secondNum = 10;

        List<Integer> actual = LoopsAndBranch.task226(firstNum, secondNum);

        List<Integer> expected = new ArrayList<Integer>() {
            {
                add(30); add(60); add(90);
                add(120); add(150); add(180);
                add(210); add(240); add(270);
            }
        };

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void task226_testForIdenticalResultAfterNumbersSwap() {
        int firstNum = 30;
        int secondNum = 10;

        List<Integer> actual = LoopsAndBranch.task226(firstNum, secondNum);

        List<Integer> expected = LoopsAndBranch.task226(secondNum, firstNum);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void task226_testWithEmptyAnswer() {
        int firstNum = 13;
        int secondNum = 11;

        List<Integer> actual = LoopsAndBranch.task226(firstNum, secondNum);

        List<Integer> expected = new ArrayList<Integer>();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void task226_testWithSameTwoNumbers() {
        int firstNum = 6;
        int secondNum = 6;

        List<Integer> actual = LoopsAndBranch.task226(firstNum, secondNum);

        List<Integer> expected = new ArrayList<Integer>() {
            {
                add(6); add(12); add(18);
                add(24); add(30);
            }
        };

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void task243a() {
        int[] actualResult = LoopsAndBranch.task243a(100);
        int[] expectedResult = {6, 8};
        assertArrayEquals(actualResult, expectedResult);
    }

    @Test
    void task178h() {
        int[] arr = {1, 4, 10, 8, 17, 5, 4, 8};
        int actualResult = LoopsAndBranch.task178h(arr);
        int expectedResult = 4;
        assertEquals(actualResult, expectedResult);
    }

    @Test
    void task178d() {
    }

    @Test
    void task243b() {
    }

    @Test
    void task242() {
    }

}