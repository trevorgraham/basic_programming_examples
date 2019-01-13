package coding_bat;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/*
Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that
the % "mod" operator computes remainders, so 17 % 10 is 7.

lastDigit(7, 17) → true
lastDigit(6, 17) → false
lastDigit(3, 113) → true
 */

public class WarmupOne29LastDigitTest {
    WarmupOne29LastDigit calc = new WarmupOne29LastDigit();

    @Test
    public void givenInt7andInt17ReturnTrue(){
        assertTrue(calc.lastDigit(7, 17));
    }

    @Test
    public void givenInt6andInt17ReturnTrue(){
        assertFalse(calc.lastDigit(6, 17));
    }

    @Test
    public void givenInt3andInt113ReturnTrue(){
        assertTrue(calc.lastDigit(3, 113));
    }
}
