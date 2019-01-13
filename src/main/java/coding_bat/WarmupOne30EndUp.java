package coding_bat;

/*
Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars,
 uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.


endUp("Hello") → "HeLLO"
endUp("hi there") → "hi thERE"
endUp("hi") → "HI"
 */

public class WarmupOne30EndUp {
    public String endUp(String str){
        String result ="";
        if(str.length()<3){
            result=str.toUpperCase();
        }else{
            String front = str.substring(0, str.length()-3);
            String end = str.substring(str.length()-3).toUpperCase();
            result = front+end;
        }
        return result;
    }
}
