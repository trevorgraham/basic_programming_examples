package coding_bat;
/*

Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. Return a
string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".


zipZap("zipXzap") → "zpXzp"
zipZap("zopzop") → "zpzp"
zipZap("zzzopzop") → "zzzpzp"
 */

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringTwo18ZipZapTest {

    StringTwo18ZipZap calc = new StringTwo18ZipZap();

    @Test
    public void givenStringZipXzapReturnZpXzp(){
        assertEquals("zpXzp", calc.zipZap("zipXzap"));
    }

    @Test
    public void givenStringZopzopReturnZzp(){
        assertEquals("zpzp", calc.zipZap("zopzop"));
    }

    @Test
    public void givenStringZzzopzoppReturnZzzpzp(){
        assertEquals("zzzpzp", calc.zipZap("zzzopzop"));
    }
}
