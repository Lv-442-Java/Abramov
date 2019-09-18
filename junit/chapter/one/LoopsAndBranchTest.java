package chapter.one;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    void task178b() {
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
    void task226() {
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