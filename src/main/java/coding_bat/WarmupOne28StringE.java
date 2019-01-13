package coding_bat;

/*
Return true if the given string contains between 1 and 3 'e' chars.


stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
 */

public class WarmupOne28StringE {

    public boolean stringE(String str){
        boolean result = false;
        int countEs = 0;
        for(int counter = 0; counter < str.length(); counter++){
            if(str.charAt(counter)=='e'){
                countEs= countEs + 1;
            }
        }
        if(countEs >= 1 && countEs <=3) result = true;
        return result;
    }
}
