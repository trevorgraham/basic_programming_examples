package coding_bat;

/*
Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars,
uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.


endUp("Hello") → "HeLLO"
endUp("hi there") → "hi thERE"
endUp("hi") → "HI"
 */

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarmupOne30EndUpTest{
WarmupOne30EndUp calc = new WarmupOne30EndUp();

@Test
    public void givenStringlloReturnHeLLO(){
    assertEquals("LLO", calc.endUp("llo"));
}

    @Test
    public void givenStringHelloReturnHeLLO(){
        assertEquals("heLLO", calc.endUp("hello"));
    }



}
