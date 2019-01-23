package coding_bat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.runners.Parameterized.*;

/*
Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the other
is "far", differing from both other values by 2 or more. Note: Math.abs(num) computes the absolute value of a number.


closeFar(1, 2, 10) → true
closeFar(1, 2, 3) → false
closeFar(4, 1, 3) → true
 */
@RunWith(Parameterized.class)
public class LogicTwo6CloseFarTest {
    private Integer a;
    private Integer b;
    private Integer c;
    private boolean expectedResult;
    private LogicTwo6CloseFar logicTwo6CloseFar;

    @Before
    public void initialize(){
        logicTwo6CloseFar = new LogicTwo6CloseFar();
    }

    public LogicTwo6CloseFarTest(Integer a, Integer b, Integer c, Boolean expectedResult){
        this.a = a;
        this.b = b;
        this.c = c;
        this.expectedResult = expectedResult;
    }

    @Parameters
    public static Collection inputNumbers() {
        return Arrays.asList(new Object[][]{
                {1, 2, 10, true},
                {1, 2, 3, false},
                {4, 1, 3, true}
        });
    }

    @Test
    public void testLogicTwo6CloseFar() {
        System.out.println("Parameterized Numbers are :" + " " + a + " " + b + " " + c);
        assertEquals(expectedResult, logicTwo6CloseFar.closeFar(a, b, c));
    }


}
