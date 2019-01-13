package coding_bat;


/*
Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the
string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.


everyNth("Miracle", 2) → "Mrce"
everyNth("abcdefg", 2) → "aceg"
everyNth("abcdefg", 3) → "adg"
 */


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarmupOne31EveryNthTest {
    WarmupOne31EveryNth calc = new WarmupOne31EveryNth();

    @Test
    public void givenAtringMiracleAndInt2ReturnStringMrce(){
        assertEquals("Mrce", calc.everyNth("Miracle", 2));
    }

    @Test
    public void givenAtringAbcdefgAndInt2ReturnStringAceg(){
        assertEquals("aceg", calc.everyNth("abcdefg", 2));
    }
}
