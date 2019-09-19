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
    }

    @Test
    void task88c() {
        int expected = 76523;
        int actual = SimpleLoops.task88c(36527);
        Assertions.assertEquals(expected,actual);
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