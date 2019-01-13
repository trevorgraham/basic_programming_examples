package coding_bat;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/*
Return true if the given string contains between 1 and 3 'e' chars.


stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
 */

public class WarmupOne28StringETest {
    WarmupOne28StringE calc = new WarmupOne28StringE();

    @Test
    public void givenStringHelloReturnTrue(){
        assertTrue(calc.stringE("Hello"));
    }

    @Test
    public void givenStringHeelleReturnTrue(){
        assertTrue(calc.stringE("Heelle"));
    }

    @Test
    public void givenStringHeeleleReturnFalse(){
        assertFalse(calc.stringE("Heelele"));
    }
}
