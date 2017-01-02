package com.belatrixsf.androidexample;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void is_text_correct() throws Exception {
        assertEquals("hola", "hola");
    }

    @Test
    public void array_test() {
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        assertEquals(array.length, 9);
        int[] result = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Arrays.sort(array);
        assertArrayEquals(result, array);
    }
}