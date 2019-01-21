package coding_bat;

/*
Given a positive int n, return true if it contains a 1 digit. Note: use % to get the rightmost digit, and / to
discard the rightmost digit.


hasOne(10) → true
hasOne(22) → false
hasOne(220) → false
 */

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ApOne1HasOneTest {

    ApOne1HasOne calc = new ApOne1HasOne();

    @Test
    public void givenInt10ReturnTrue(){
        assertTrue(calc.hasOne(10));
    }

    @Test
        public void givenint20ReturnFalse(){
            assertFalse(calc.hasOne(20));
    }

    @Test
    public void givenint220ReturnFalse(){
        assertFalse(calc.hasOne(220));
    }

    @Test
    public void givenint24541344ReturnTrue(){
        assertTrue(calc.hasOne(24541344));
    }
}
