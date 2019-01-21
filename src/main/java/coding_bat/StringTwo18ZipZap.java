package coding_bat;
/*

Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. Return a
string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".


zipZap("zipXzap") → "zpXzp"
zipZap("zopzop") → "zpzp"
zipZap("zzzopzop") → "zzzpzp"
 */

    public class StringTwo18ZipZap {
    public String zipZap(String str) {
        String result = "";
        for (int count = 0; count < str.length() - 2; count++) {
            if (str.charAt(count) == 'z' && str.charAt(count +2) == 'p') {
                result = result + "zp";
                count = count+2;
            }
            else{
                result = result + str.charAt(count);
            }
        }
        return result;
    }
}
