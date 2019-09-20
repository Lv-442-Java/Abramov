package chapter.one;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LoopsAndBranchTest {

    @Test
    void task224() {
        ArrayList expected = new ArrayList() ;
        expected.add(0,5);
        expected.add(1,3);
        expected.add(2,1);
        ArrayList actual = LoopsAndBranch.task224(15);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void task241_testWithDefaultInput() {
    double expected = 5.0E-9;
    double actual = LoopsAndBranch.task241(4, 0.01);
    assertEquals(expected, actual);
    }

    @Test
    void task241_testWithZero() {
        double expected = -0.00;
        double actual = LoopsAndBranch.task241(1, 0.00);
        assertEquals(expected, actual);
    }

    @Test
    void task182_testWithDefaultInput() {

       int [] array = {14, 15, 31, 25, 30, 28};
        Integer [] result = {3, 70};
        List<Integer> expected = Arrays.asList(result);
        List<Integer> actual = LoopsAndBranch.task182(array);
        assertEquals(expected,actual);
    }

    @Test
    void task182_testWithIncorrectNumbs() {

        int [] array = {14, 13, 31, 26, 34, 28};
        Integer [] result = {0, 0};
        List<Integer> expected = Arrays.asList(result);
        List<Integer> actual = LoopsAndBranch.task182(array);
        assertEquals(expected,actual);
    }

    @Test
    void task178b_testWithDefaultInput() {
        int[] numbers = new int[]{3, 4, 5, 9, 12, 15, 17, 18, 20, 21, 30};
        int actual = LoopsAndBranch.task178b(numbers);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void task178b_testWithAllCorrectNums() {
        int[] numbers = new int[]{3, 6, 9, 12, 18, 21};
        int actual = LoopsAndBranch.task178b(numbers);
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void task178b_testWithAllIncorrectNums() {
        int[] numbers = new int[]{15, 30, 45, 60, 75};

        int actual = LoopsAndBranch.task178b(numbers);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void task178c_testWithSomeCorrectNums() {
        int[] testSequence = {1, 4, 9, 36, 49};
        int actual = LoopsAndBranch.task178c(testSequence);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void task178c_testWithAllIncorrectNums() {
        int[] testSequence = {1, 3, 9, 7, 49};
        int actual = LoopsAndBranch.task178c(testSequence);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void task227_testWithPositiveParameters() {
        Integer[] result = {-6, -3, -2, -1, 1, 2, 3, 6};
        List<Integer> expected = Arrays.asList(result);
        List<Integer> actual = LoopsAndBranch.task227(12, 18);
        assertEquals(expected, actual);
    }

    @Test
    void task227_testWithNegativeAndPositiveParameters() {
        Integer[] result = {-6, -3, -2, -1, 1, 2, 3, 6};
        List<Integer> expected = Arrays.asList(result);
        List<Integer> actual = LoopsAndBranch.task227(-12, 18);
        assertEquals(expected, actual);
    }

    @Test
    void task227_testWithNegativeParameters() {
        Integer[] result = {-6, -3, -2, -1, 1, 2, 3, 6};
        List<Integer> expected = Arrays.asList(result);
        List<Integer> actual = LoopsAndBranch.task227(-12, -18);
        assertEquals(expected, actual);
    }

    @Test
    void task225() {
        Integer[] result = {8, 16};
        List<Integer> expected = Arrays.asList(result);
        List<Integer> actual = LoopsAndBranch.task225(256);
        assertEquals(expected, actual);
    }

    @Test
    void task226_testWithDefaultInput() {
        int firstNum = 30;
        int secondNum = 10;
        List<Integer> actual = LoopsAndBranch.task226(firstNum, secondNum);
        List<Integer> expected = new ArrayList<Integer>() {
            {
                add(30);
                add(60);
                add(90);
                add(120);
                add(150);
                add(180);
                add(210);
                add(240);
                add(270);
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
                add(6);
                add(12);
                add(18);
                add(24);
                add(30);
            }
        };
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void task243a_testIfWeCanRepresent() {
        int[] actualResult = LoopsAndBranch.task243a(100);
        int[] expectedResult = {6, 8};
        assertArrayEquals(actualResult, expectedResult);
    }

    @Test
    void task243a_testIfWeCanNotRepresent() {
        int[] actualResult = LoopsAndBranch.task243a(9);
        int[] expectedResult = {0, 0};
        assertArrayEquals(actualResult, expectedResult);
    }

    @Test
    void task178h_testWithRandomNaturalSequence() {
        int[] arr = {1, 4, 10, 8, 17, 5, 4, 8};
        int actualResult = LoopsAndBranch.task178h(arr);
        int expectedResult = 4;
        assertEquals(actualResult, expectedResult);
    }

    @Test
    void task178d() {
        int [] arr = {14,15,16,17,35,45,95,45};
        int expected = 2;
        int actual = LoopsAndBranch.task178d(arr);
        assertEquals(expected,actual);
    }

    @Test
    void task243b() {
        ArrayList<String> expected = new ArrayList<>();
        expected.add("6+8");
        expected.add("8+6");
        ArrayList<String> actual = LoopsAndBranch.task243b(100);
        assertEquals(expected,actual);
    }

    @Test
    void task242() {
        assertEquals(720, LoopsAndBranch.factorial(6));
        //assertEquals(0.0013888889,LoopsAndBranch.task242(6));
    }
}