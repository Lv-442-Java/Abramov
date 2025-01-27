package chapter.one;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
                add(3);
                add(12);
                add(21);
                add(30);
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
                add(3);
                add(12);
                add(21);
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
    void task332_testWithDefaultInput() {
        int[] expected = {6, 3, 1, 0};
        int [] actual = NestedLoops.task332(46);
        assertArrayEquals(expected, actual);
    }

    @Test
    void task332_testWithZeros() {
        int[] expected = {2, 0, 0, 0};
        int [] actual = NestedLoops.task332(4);
        assertArrayEquals(expected, actual);
    }


    @Test
    void task330_testWithNotIdealNumber() {
        Integer[] result = {6, 28, 496};
        List<Integer> expected = Arrays.asList(result);
        List<Integer> actual = NestedLoops.task330(512);
        assertEquals(expected, actual);
    }

    @Test
    void task330_testWithIdealNumber() {
        Integer[] result = {6, 28};
        List<Integer> expected = Arrays.asList(result);
        List<Integer> actual = NestedLoops.task330(496);
        assertEquals(expected, actual);
    }

    @Test
    void task330_testWithLessThenFirstIdealNumber() {
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = NestedLoops.task330(5);
        assertEquals(expected, actual);
    }

    @Test
    void task331a_testIfWeCanRepresent() {
        int[] actualResult = NestedLoops.task331a(347);
        int[] expectedResult = {1, 11, 15};
        assertArrayEquals(actualResult, expectedResult);
    }

    @Test
    void task331a_testIfWeCanNotRepresent() {
        int[] actualResult = NestedLoops.task331a(10);
        int[] expectedResult = {0, 0, 0};
        assertArrayEquals(actualResult, expectedResult);
    }

    @Test
    void task323() {
        List<Integer> actual =  NestedLoops.task323(5);
        List<Integer> expected = new ArrayList<>();
        expected.add(0,1);
        expected.add(1,2);
        expected.add(2,3);
        expected.add(3,4);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void task325() {
        Integer[] result = {2, 3, 5};
        List<Integer> expected = Arrays.asList(result);
        List<Integer> actual = NestedLoops.task325(30);
        assertEquals(expected, actual);
    }

    @Test
    void task331b() {
        ArrayList<String> expected = new ArrayList<>();
        expected.add("3+4+15");
        expected.add("3+15+4");
        expected.add("4+3+15");
        expected.add("4+15+3");
        expected.add("5+9+12");
        expected.add("5+12+9");
        expected.add("9+5+12");
        expected.add("9+12+5");
        expected.add("12+5+9");
        expected.add("12+9+5");
        expected.add("15+3+4");
        expected.add("15+4+3");
        ArrayList<String> actual = NestedLoops.task331b(250);
        assertEquals(expected,actual);
    }

    @Test
    void task340_testWithExpectedListOfNumber() {
        int[] list = {18, 23, 11, 4, 66, 786, 124};
        //String expectedResult = "4 11 18";
        String expectedResult = "11 11 11";  // In case when values from list can be dublicated
        assertEquals(expectedResult, NestedLoops.task340(33, list));
    }
}