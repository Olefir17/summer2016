public class Solution {
    public String reverseString(String s) {
        String output = "";
        if(s == null || s.length()==0 ){
            return "";
        }

        for (int i = s.length()-1; i>0 ; i--) {
            output +=s.charAt(i);
        }
        return output;
        


    }


}
