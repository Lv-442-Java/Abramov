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
    void task87() {
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
    }
}