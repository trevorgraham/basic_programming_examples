package coding_bat;

/*
Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the other
is "far", differing from both other values by 2 or more. Note: Math.abs(num) computes the absolute value of a number.


closeFar(1, 2, 10) → true
closeFar(1, 2, 3) → false
closeFar(4, 1, 3) → true
 */

public class LogicTwo6CloseFar {
    public boolean closeFar (int a, int b, int c){
        boolean result = false;
        int diffAB = Math.abs(a - b);
        int diffAC = Math.abs(a - c);
        int diffBC = Math.abs(b - c);


        if(diffAB <2 || diffAC <2){
            if(((diffAB >= 2) && (diffBC >= 2)) || ((diffAC >= 2) && (diffBC >= 2))){
                result = true;
            }
        }

        return result;
    }

}
