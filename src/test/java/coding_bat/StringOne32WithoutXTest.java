package coding_bat;

/*
Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return
the string unchanged.


withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"
 */


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringOne32WithoutXTest {
    StringOne32WithoutX calc = new StringOne32WithoutX();

    @Test
    public void givenAStringXHiXReturnStringHi(){
        assertEquals("Hi", calc.withoutX("xHix"));
    }

    @Test
    public void givenstringXhireturnStringHi(){
        assertEquals("Hi", calc.withoutX("xHi"));
    }
}
