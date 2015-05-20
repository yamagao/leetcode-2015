public class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while(i < j){
            while(i < j && !(s.charAt(i) >= '0' && s.charAt(i) <= '9' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' || s.charAt(i) >= 'a' && s.charAt(i) <= 'z')) i++;
            while(i < j && !(s.charAt(j) >= '0' && s.charAt(j) <= '9' || s.charAt(j) >= 'A' && s.charAt(j) <= 'Z' || s.charAt(j) >= 'a' && s.charAt(j) <= 'z')) j--;
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else if(!(s.charAt(i) >= '0' && s.charAt(i) <= '9') && (s.charAt(i) - 'A' + 'a' == s.charAt(j) || s.charAt(i) - 'a' + 'A' == s.charAt(j))){
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }
}