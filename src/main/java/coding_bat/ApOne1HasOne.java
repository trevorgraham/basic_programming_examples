package coding_bat;

/*
Given a positive int n, return true if it contains a 1 digit. Note: use % to get the rightmost digit, and / to
discard the rightmost digit.


hasOne(10) → true
hasOne(22) → false
hasOne(220) → false
 */

public class ApOne1HasOne {
    public boolean hasOne(int n){
        boolean result = false;
        while(n>0){
            if(n%10 == 1 || n/10 ==1) result = true;
            n = n/10;
        }
        return result;
    }
}
