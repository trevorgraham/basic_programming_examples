package coding_bat;

/*
Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise
return the string unchanged. This is a little harder than it looks.


withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"
 */

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringOne33WithoutX2Test {
    StringOne33WithoutX2 calc = new StringOne33WithoutX2();

    @Test
    public void givenStringXHireturnStringHi(){
        assertEquals("Hi", calc.withoutX2("xHi"));
    }

    @Test
    public void givenStringHxireturnStringHi(){
        assertEquals("Hi", calc.withoutX2("Hxi"));
    }


}
