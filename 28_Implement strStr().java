public class Solution {
    int[] T(String needle){
        int[] result = new int[needle.length()];
        result[0] = -1;
        if(result.length == 1){
            return result;
        }
        result[1] = 0;
        int j = 0;
        for(int i  = 2; i < result.length; i++){
            if(needle.charAt(i - 1) == needle.charAt(j)){
                j++;
                result[i] = j;
            }
            else if(j > 0){
                j = result[j];
                i--;
            }
            else{
                result[i] = 0;
            }
        }
        return result;
    }
    
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0){
            return 0;
        }
        if(needle.length() > haystack.length()){
            return -1;
        }
        int[] shift = T(needle);
        int j = 0;
        for(int i = 0; i < needle.length(); i++){
            if(j + i > haystack.length() -  1){
                return -1;
            }
            if(needle.charAt(i) != haystack.charAt(j + i)){
                j = j + i - shift[i];
                i = -1;
            }
        }
        return j;
    }
}