package chapter.two;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class IntegerNumbersTest {

    @Test
    void task560() {
        int [] friendlyBetween200And300 = {220,284};
        List<int[]> expected = new ArrayList<>();
        expected.add(friendlyBetween200And300);
        List<int[]> actual = IntegerNumbers.task560();
        for (int i=0;i<actual.size();i++){
            assertArrayEquals(expected.get(i),actual.get(i));
        }
        assertEquals(expected.size(),actual.size());
    }

    @Test
    void task559() {
    }

    @Test
    void task561() {
        List<Integer> actualList = IntegerNumbers.task561(25);
        List<Integer> expectedList = Arrays.asList(1, 5, 6, 25);
        Assertions.assertEquals(expectedList, actualList);
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