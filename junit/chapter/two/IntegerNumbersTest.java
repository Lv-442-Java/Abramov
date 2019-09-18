package chapter.two;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IntegerNumbersTest {

    @Test
    void task560() {
    }

    @Test
    void task559_testWithDefaultInput() {
        int number = 40;

        List<Integer> actual = IntegerNumbers.task559(number);

        List<Integer> expected = new ArrayList<Integer>() {
            {
                add(3); add(7); add(31);
            }
        };

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void task559_testThatResultNumsMustBeLessThanMainNum() {
        int number = 3;

        List<Integer> actual = IntegerNumbers.task559(number);

        List<Integer> expected = new ArrayList<Integer>();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void task561() {
    }

    @Test
    void task554() {
    }

    @Test
    void task555() {
    }

    @Test
    void task562() {
    }

    @Test
    void task569() {
    }

    @Test
    void task565() {
    }
}