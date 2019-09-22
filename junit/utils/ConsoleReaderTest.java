package utils;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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