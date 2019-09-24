package chapter.two;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IntegerNumbersTest {

    @Test
    void task560_testBetween200And300() {
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
    void task561_testWithRandomNaturalNumber() {
        List<Integer> actualList = IntegerNumbers.task561(25);
        List<Integer> expectedList = Arrays.asList(1, 5, 6, 25);
        Assertions.assertEquals(expectedList, actualList);
    }

    @Test
    void task554() {
    }

    @Test
    void task555() {
        int[][] expectedResult = new int[4][];
        expectedResult  [0] = new int [] {1};
        expectedResult  [1] = new int [] {1,1};
        expectedResult  [2] = new int [] {1,2,1};
        expectedResult  [3] = new int [] {1,3,3,1};
        //int[][] actualResult = new int[4][];
        int[][] actualResult = IntegerNumbers.task555(4);
        assertArrayEquals(expectedResult, actualResult);
        //triangle[0] = new int[]{1};
    }

    @Test
    void task562() {
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(153);
        expected.add(370);
        expected.add(371);
        expected.add(407);
        expected.add(1634);
        expected.add(8208);
        expected.add(9474);
        ArrayList<Integer> actual = IntegerNumbers.task562();
        assertEquals(expected,actual);
    }

    @Test
    void task569_testWithRandomNaturalNumber() {
        List<Integer>list = new ArrayList<Integer>() {
            {
                add(2);
                add(3);
                add(4);
                add(5);
                add(6);
                add(8);
                add(9);
                add(10);
            }
        };
        Collections.sort(list);
        Assertions.assertEquals(list,IntegerNumbers.task569(10));
    }

    @Test
    void task565_testWithPositiveOutput() {
        boolean expected = true;
       boolean actual =  IntegerNumbers.task565(2, 5, 3);
     assertEquals(expected, actual);

    }

    @Test
    void task565_testWithNegativeOutput() {

        boolean expected = true;
        boolean actual =  IntegerNumbers.task565(21, 22, 2);
        assertEquals(expected, actual);

    }


}