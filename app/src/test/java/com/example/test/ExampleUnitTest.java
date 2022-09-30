package com.example.test;
import static com.example.test.labClass.*;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void labMin_isCorrect() {
        assertEquals(2, labMin(4,2).intValue());
    }
    @Test
    public void labMin_isCorrect_neg() {
        assertEquals(-4, labMin(-4,-2).intValue());
    }
    @Test
    public void labMax_isCorrect() {
        assertEquals(4, labMax(4,2).intValue());
    }
    @Test
    public void labMax_isCorrect_neg() {
        assertEquals(-2, labMax(-4,-2).intValue());
    }
    /////////////////
    @Test
    public void f_labMin_isCorrect() {
        assertEquals(2.1, labMin((float) 2.2, (float) 2.1),0.1);
    }
    @Test
    public void f_labMin_isCorrect_neg() {
        assertEquals(-3.9,  labMin((float) -3.8,(float)-3.9),0.1);
    }
    @Test
    public void f_labMax_isCorrect() {
        assertEquals(2.2, labMax((float) 2.2, (float) 2.1),0.1);
    }
    @Test
    public void f_labMax_isCorrect_neg() {
        assertEquals(-3.8,  labMax((float) -3.8,(float)-3.9),0.1);
    }




}