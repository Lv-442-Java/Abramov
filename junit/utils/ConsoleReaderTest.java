package utils;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ConsoleReaderTest {

    @Test
    void inputNaturalNumber() {
        Scanner sc = mock(Scanner.class);
        when(sc.hasNextInt()).thenReturn(true);
        when(sc.nextInt()).thenReturn(5);
        ConsoleReader cr = new ConsoleReader(sc);
        Integer expect = 5;
        assertEquals(expect,cr.inputIntegerNumber());
    }

    @Test
    void inputArrayOfNaturalNumbers() {
        Scanner mockedSc = mock(Scanner.class);
        ConsoleReader consoleReader = spy(new ConsoleReader(mockedSc));
        doReturn(5,2,6,7,8,1).when(consoleReader).inputNaturalNumber();
        int [] expected = {2,6,7,8,1};
        int [] actual = consoleReader.inputArrayOfNaturalNumbers();
        assertArrayEquals(expected,actual);
    }

    @Test
    void inputIntegerNumber() {
        Scanner sc = mock(Scanner.class);
        when(sc.hasNextInt()).thenReturn(true);
        when(sc.nextInt()).thenReturn(5);
        ConsoleReader cr = new ConsoleReader(sc);
        Integer expect = 5;
        assertEquals(expect,cr.inputIntegerNumber());

    }


    @Test
    void inputDoubleNumber() {
        Scanner sc = mock(Scanner.class);
        when(sc.hasNextDouble()).thenReturn(true);
        when(sc.nextDouble()).thenReturn(5.5);
        ConsoleReader cr = new ConsoleReader(sc);
        double expect = 5.5;
        assertEquals(expect,cr.inputDoubleNumber());
    }
}