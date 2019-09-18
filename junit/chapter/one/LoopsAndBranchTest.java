package chapter.one;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

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
    }

    @Test
    void task227() {
    }

    @Test
    void task225() {
    }

    @Test
    void task226() {
    }

    @Test
    void task243a() {//?
        int naturalNumber = 100;
        ArrayList<int[]> actualResult = LoopsAndBranch.task243a(naturalNumber);
        for (int[] arr : actualResult) {
            assertEquals(Math.pow(arr[0], 2) + Math.pow(arr[1], 2), naturalNumber);
        }
    }

    @Test
    void task178h() {
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

    @Test
    void factorial() {
    }
}