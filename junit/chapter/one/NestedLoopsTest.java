package chapter.one;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NestedLoopsTest {

    @Test
    void task329() {
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
    }

    @Test
    void task331b() {
    }

    @Test
    void task340() {
    }
}