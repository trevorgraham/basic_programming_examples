package coding_bat;

/*
Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise
return the string unchanged. This is a little harder than it looks.


withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"
 */

public class StringOne33WithoutX2 {
    public String withoutX2(String str){
        String result= "";
        String two ="";
        String one= "";

        if(str.length() > 2) result = str.substring(2);
        if(str.length() > 1){
            two = str.substring(1,2);
            if(!two.equals("x")) {
                result =  str.substring(1,2) + result;
            }
        }
        if(str.length() >0){
            one = str.substring(0,1);
            if(!one.equals("x")){
                result = str.substring(0,1) + result;
            }
        }
        return result;
    }
}
